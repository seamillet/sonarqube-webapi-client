package com.geewaza.sonarqube.webapi.api.usergroups;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Add a user to a group.
 * 'id' or 'name' must be provided.
 * Requires the following permission: 'Administer System'.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class AddUserService extends AbstractService<AddUserService, Boolean> {
    public AddUserService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/user_groups/add_user");
        return true;
    }
    public AddUserService id(String id) {
        return put("id", id);
    }
    public AddUserService login(String login) {
        return put("login", login);
    }
    public AddUserService name(String name) {
        return put("name", name);
    }

}
