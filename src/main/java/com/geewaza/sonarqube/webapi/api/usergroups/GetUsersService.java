package com.geewaza.sonarqube.webapi.api.usergroups;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.user.GroupUsers;
import com.geewaza.sonarqube.webapi.model.user.Groups;

import java.io.IOException;

/**
 * Search for users with membership information with respect to a group.
 * Requires the following permission: 'Administer System'.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetUsersService extends AbstractService<GetUsersService, GroupUsers> {
    public GetUsersService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected GroupUsers doExecute() throws IOException {
        return doGet("api/user_groups/users", GroupUsers.class);
    }
    public GetUsersService id(String id) {
        return put("id", id);
    }
    public GetUsersService name(String name) {
        return put("name", name);
    }
    public GetUsersService p(Integer p) {
        return put("p", p);
    }
    public GetUsersService ps(String ps) {
        return put("ps", ps);
    }
    public GetUsersService q(String q) {
        return put("q", q);
    }
    public GetUsersService selected(String selected) {
        return put("selected", selected);
    }


}
