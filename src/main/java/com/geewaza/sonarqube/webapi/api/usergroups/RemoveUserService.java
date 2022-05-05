package com.geewaza.sonarqube.webapi.api.usergroups;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Remove a user from a group.
 * 'id' or 'name' must be provided.
 * Requires the following permission: 'Administer System'.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class RemoveUserService extends AbstractService<RemoveUserService, Boolean> {
    public RemoveUserService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/user_groups/remove_user");
        return true;
    }
    public RemoveUserService id(String id) {
        return put("id", id);
    }
    public RemoveUserService login(String login) {
        return put("login", login);
    }
    public RemoveUserService name(String name) {
        return put("name", name);
    }

}
