package com.geewaza.sonarqube.webapi.api.usergroups;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.user.Groups;

import java.io.IOException;

/**
 * Search for user groups.
 * Requires the following permission: 'Administer System'.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class SearchUserGroupService extends AbstractService<SearchUserGroupService, Groups> {
    public SearchUserGroupService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Groups doExecute() throws IOException {
        return doGet("api/user_groups/search", Groups.class);
    }
    public SearchUserGroupService f(String... f) {
        return putCsvParam("f", f);
    }
    public SearchUserGroupService p(Integer p) {
        return put("p", p);
    }
    public SearchUserGroupService ps(String ps) {
        return put("ps", ps);
    }
    public SearchUserGroupService q(String q) {
        return put("q", q);
    }


}
