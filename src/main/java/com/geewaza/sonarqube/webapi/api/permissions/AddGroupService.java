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
public class AddGroupService extends AbstractService<AddGroupService, Boolean> {
    public AddGroupService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"permission"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/add_group");
        return true;
    }
    public AddGroupService groupId(String groupId) {
        return put("groupId", groupId);
    }
    public AddGroupService groupName(String groupName) {
        return put("groupName", groupName);
    }
    public AddGroupService permission(String permission) {
        return put("permission", permission);
    }
    public AddGroupService projectId(String projectId) {
        return put("projectId", projectId);
    }
    public AddGroupService projectKey(String projectKey) {
        return put("projectKey", projectKey);
    }

}
