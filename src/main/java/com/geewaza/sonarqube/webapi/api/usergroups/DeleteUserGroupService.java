package com.geewaza.sonarqube.webapi.api.usergroups;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Delete a group. The default groups cannot be deleted.
 * 'id' or 'name' must be provided.
 * Requires the following permission: 'Administer System'.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class DeleteUserGroupService extends AbstractService<DeleteUserGroupService, Boolean> {
    public DeleteUserGroupService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/user_groups/delete");
        return true;
    }
    public DeleteUserGroupService id(String id) {
        return put("id", id);
    }
    public DeleteUserGroupService name(String name) {
        return put("name", name);
    }

}
