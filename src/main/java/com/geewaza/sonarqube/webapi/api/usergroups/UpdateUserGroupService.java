package com.geewaza.sonarqube.webapi.api.usergroups;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Update a group.
 * Requires the following permission: 'Administer System'.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class UpdateUserGroupService extends AbstractService<UpdateUserGroupService, Boolean> {
    public UpdateUserGroupService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"id"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/user_groups/update");
        return true;
    }
    public UpdateUserGroupService description(String description) {
        return put("description", description);
    }
    public UpdateUserGroupService id(String id) {
        return put("id", id);
    }
    public UpdateUserGroupService name(String name) {
        return put("name", name);
    }

}
