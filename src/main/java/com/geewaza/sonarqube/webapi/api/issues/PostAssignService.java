package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Issue;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 19:51
 **/
public class PostAssignService extends AbstractService<PostAssignService, Issue> {
    public PostAssignService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"issue"};
    }

    @Override
    protected Issue doExecute() throws IOException {
        return doPost("api/issues/assign", Issue.class);
    }

    public PostAssignService assignee(String assignee) {
        return put("assignee", assignee);
    }

    public PostAssignService issue(String issue) {
        return put("issue", issue);
    }
}
