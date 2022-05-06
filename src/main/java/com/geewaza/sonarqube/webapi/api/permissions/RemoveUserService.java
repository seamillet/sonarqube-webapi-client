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
public class RemoveUserService extends AbstractService<RemoveUserService, Boolean> {
    public RemoveUserService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"login", "permission"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/remove_user");
        return true;
    }
    public RemoveUserService login(String login) {
        return put("login", login);
    }
    public RemoveUserService permission(String permission) {
        return put("permission", permission);
    }
    public RemoveUserService projectId(String projectId) {
        return put("projectId", projectId);
    }
    public RemoveUserService projectKey(String projectKey) {
        return put("projectKey", projectKey);
    }

}
