package com.geewaza.sonarqube.webapi.client.impl;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.UserClient;
import com.geewaza.sonarqube.webapi.model.user.Groups;
import com.geewaza.sonarqube.webapi.model.user.UserResponse;
import com.geewaza.sonarqube.webapi.model.user.Users;

import java.io.IOException;
import java.util.Map;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class UserClientImpl extends AbstractSonarClient implements UserClient {


    public UserClientImpl(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Update a user's password. Authenticated users can change their own password, provided that the account is not linked to an external authentication system. Administer System permission is required to change another user's password.
     *
     * @param login            User login
     * @param password         New password
     * @param previousPassword Previous password. Required when changing one's own password.
     * @return success or not
     * @throws IOException IOException
     */
    @Override
    public Boolean changeUserPassword(String login, String password, String previousPassword) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("login", login)
                .put("password", password).put("previousPassword", previousPassword).build();
        this.httpClient.post("api/users/change_password", null, JSONObject.toJSONString(params));
        return true;
    }

    /**
     * Create a user.
     * If a deactivated user account exists with the given login, it will be reactivated.
     * Requires Administer System permission
     *
     * @param login      User login
     * @param name       User name
     * @param email      User email
     * @param local      Specify if the user should be authenticated from SonarQube server or from an external authentication system. Password should not be set when local is set to false.
     * @param password   User password. Only mandatory when creating local user, otherwise it should not be set
     * @param scmAccount List of SCM accounts. To set several values, the parameter must be called once for each value.
     * @return UserResponse
     * @throws IOException IOException
     */
    @Override
    public UserResponse createUser(String login, String name, String email, Boolean local, String password, String scmAccount) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("login", login).put("name", name).put("email", email)
                .put("local", local).put("password", password).put("scmAccount", scmAccount).build();
        return this.httpClient.post("api/users/create", null, JSONObject.toJSONString(params), UserResponse.class);
    }

    /**
     * Deactivate a user. Requires Administer System permission
     *
     * @param login User login
     * @return UserResponse
     * @throws IOException IOException
     */
    @Override
    public UserResponse deactivateUser(String login) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("login", login).build();
        return this.httpClient.post("api/users/deactivate", null, JSONObject.toJSONString(params), UserResponse.class);
    }

    /**
     * Lists the groups a user belongs to.
     * Requires Administer System permission.
     *
     * @param login    A user login
     * @param p        1-based page number
     * @param ps       Page size. Must be greater than 0.
     * @param q        Limit search to group names that contain the supplied string.
     * @param selected Depending on the value, show only selected items (selected=selected), deselected items (selected=deselected), or all items with their selection status (selected=all).
     * @return Groups
     * @throws IOException IOException
     */
    @Override
    public Groups getUserGroups(String login, Integer p, Integer ps, String q, String selected) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("login", login).put("p", p).put("ps", ps).put("q", q)
                .put("selected", selected).build();
        return this.httpClient.get("api/users/groups", params, Groups.class);
    }

    /**
     * Get a list of active users.
     * The following fields are only returned when user has Administer System permission or for logged-in in user :
     * - 'email'
     * - 'externalIdentity'
     * - 'externalProvider'
     * - 'groups'
     * - 'lastConnectionDate'
     * - 'tokensCount'
     * Field 'lastConnectionDate' is only updated every hour, so it may not be accurate, for instance when a user authenticates many times in less than one hour.
     *
     * @param p  1-based page number
     * @param ps Page size. Must be greater than 0 and less or equal than 500
     * @param q  Filter on login, name and email
     * @return Users
     * @throws IOException IOException
     */
    @Override
    public Users searchUsers(Integer p, Integer ps, String q) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("p", p).put("ps", ps).put("q", q).build();
        return this.httpClient.get("api/users/search", params, Users.class);
    }

    /**
     * Update a user.
     * Requires Administer System permission
     *
     * @param login      User login
     * @param name       User name
     * @param email      User email
     * @param scmAccount SCM accounts. To set several values, the parameter must be called once for each value.
     * @return UserResponse
     * @throws IOException IOException
     */
    @Override
    public UserResponse updateUser(String login, String name, String email, String scmAccount) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("login", login).put("name", name).put("email", email).put("scmAccount", scmAccount).build();
        return this.httpClient.post("api/users/update", null, JSONObject.toJSONString(params), UserResponse.class);
    }

    /**
     * Update a user login. A login can be updated many times.
     * Requires Administer System permission
     *
     * @param login    The current login (case-sensitive)
     * @param newLogin The new login. It must not already exist.
     * @return success or not
     * @throws IOException IOException
     */
    @Override
    public Boolean updateUserLogin(String login, String newLogin) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("login", login).put("newLogin", newLogin).build();
        this.httpClient.post("api/users/update_login", null, JSONObject.toJSONString(params));
        return true;
    }
}
