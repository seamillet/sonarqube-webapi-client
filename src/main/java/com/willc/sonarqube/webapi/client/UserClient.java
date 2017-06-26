package com.willc.sonarqube.webapi.client;

import com.google.common.base.Strings;
import com.google.gson.JsonObject;
import com.willc.sonarqube.webapi.model.user.Groups;
import com.willc.sonarqube.webapi.model.user.User;
import com.willc.sonarqube.webapi.model.user.Users;

import java.io.IOException;

/**
 * Created by chengkeqian on 2017/6/20.
 */
public class UserClient {
    private BaseHttpClient httpClient;

    public UserClient(BaseHttpClient baseHttpClient) {
        this.httpClient = baseHttpClient;
    }

    public User getUser(String login) throws IOException {
        this.httpClient.get(String.format("api/users/search?q=%s", login),User.class);
        return null;
    }

    public Users getUsers(String p, String ps) throws IOException {
        this.httpClient.get(String.format("api/users/search?p=%s&ps=%s", p, ps),Users.class);
        return null;
    }

    public User createUser(String login, String email, String name, String password) throws IOException {
        JsonObject params = new JsonObject();
        params.addProperty("email", email);
        params.addProperty("login", login);
        params.addProperty("name", name);
        params.addProperty("password", password);
        httpClient.post("api/users/create", params.toString());
        return null;
    }

    public User updateUser(String login, String email, String name) throws IOException {
        JsonObject params = new JsonObject();
        params.addProperty("login", login);
        if (!Strings.isNullOrEmpty(email)) {
            params.addProperty("email", email);
        }
        if (!Strings.isNullOrEmpty(name)) {
            params.addProperty("name", name);
        }
        httpClient.post("api/users/update", params.toString());
        return null;
    }

    public boolean updateUserPassword(String login, String password, String previousPassword) throws IOException {
        JsonObject params = new JsonObject();
        params.addProperty("login", login);
        params.addProperty("password", password);
        if (!Strings.isNullOrEmpty(previousPassword)) {
            params.addProperty("previousPassword", previousPassword);
        }
        httpClient.post("api/users/change_password", params.toString());
        return false;
    }

    public boolean deactiveUser(String login) throws IOException {
        httpClient.post("api/users/deactivate", String.format("{\"login\":%s}", login));
        return false;
    }

    public Groups getGroupsOfUser(String login, String p, String ps, String selected) throws IOException {
        return httpClient.get(String.format("api/users/groups?login=%s&p=%s&ps=%s&selected=%s", login, p, ps, selected), Groups.class);
    }

    public boolean authentication() throws IOException {
        //{"valid": true}
        String result = this.httpClient.get("api/authentication/validate");
        return false;
    }
}
