package com.geewaza.sonarqube.webapi.api.usergroups;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.user.GroupResponse;

import java.io.IOException;

/**
 * Create a group.
 * Requires the following permission: 'Administer System'.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class CreateUserGroupService extends AbstractService<CreateUserGroupService, GroupResponse> {
    public CreateUserGroupService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"name"};
    }

    @Override
    protected GroupResponse doExecute() throws IOException {
        return doPost("api/user_groups/create", GroupResponse.class);
    }
    public CreateUserGroupService description(String description) {
        return put("description", description);
    }
    public CreateUserGroupService name(String name) {
        return put("name", name);
    }

}
