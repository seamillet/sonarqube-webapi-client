package com.geewaza.sonarqube.webapi.api.permissions;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:56
 **/
public class RemoveGroupService extends AbstractService<RemoveGroupService, Boolean> {
    public RemoveGroupService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"permission"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/remove_group");
        return true;
    }
    public RemoveGroupService groupId(String groupId) {
        return put("groupId", groupId);
    }
    public RemoveGroupService groupName(String groupName) {
        return put("groupName", groupName);
    }
    public RemoveGroupService permission(String permission) {
        return put("permission", permission);
    }
    public RemoveGroupService projectId(String projectId) {
        return put("projectId", projectId);
    }
    public RemoveGroupService projectKey(String projectKey) {
        return put("projectKey", projectKey);
    }

}
