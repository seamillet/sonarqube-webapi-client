package com.geewaza.sonarqube.webapi.api.projectpullrequests;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Delete a pull request.
 * Requires 'Administer' rights on the specified project.
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class DeleteProjectPullRequestService extends AbstractService<DeleteProjectPullRequestService, Boolean> {
    public DeleteProjectPullRequestService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"project", "pullRequest"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/project_pull_requests/delete");
        return true;
    }

    public DeleteProjectPullRequestService project(String project) {
        return put("project", project);
    }
    public DeleteProjectPullRequestService pullRequest(String pullRequest) {
        return put("pullRequest", pullRequest);
    }



}
