package com.geewaza.sonarqube.webapi.api.users;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.user.Groups;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 21:54
 **/
public class GetUserGroupsService extends AbstractService<GetUserGroupsService, Groups> {
    public GetUserGroupsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"login"};
    }

    @Override
    protected Groups doExecute() throws IOException {
        return doGet("api/users/groups", Groups.class);
    }

    public GetUserGroupsService login(String login) {
        return put("login", login);
    }

    public GetUserGroupsService p(Integer p) {
        return put("p", p);
    }

    public GetUserGroupsService ps(Integer ps) {
        return put("ps", ps);
    }

    public GetUserGroupsService q(String q) {
        return put("q", q);
    }

    public GetUserGroupsService selected(String selected) {
        return put("selected", selected);
    }
}
