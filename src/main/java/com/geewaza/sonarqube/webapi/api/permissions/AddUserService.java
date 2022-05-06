package com.geewaza.sonarqube.webapi.api.permissions;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:56
 **/
public class AddUserService extends AbstractService<AddUserService, Boolean> {
    public AddUserService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"login", "permission"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/add_user");
        return true;
    }
    public AddUserService login(String login) {
        return put("login", login);
    }
    public AddUserService permission(String permission) {
        return put("permission", permission);
    }
    public AddUserService projectId(String projectId) {
        return put("projectId", projectId);
    }
    public AddUserService projectKey(String projectKey) {
        return put("projectKey", projectKey);
    }

}
