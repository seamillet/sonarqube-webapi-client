package com.geewaza.sonarqube.webapi.api.projectpullrequests;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.project.ProjectPullRequests;

import java.io.IOException;

/**
 * List the pull requests of a project.
 * One of the following permissions is required:
 * 'Browse' rights on the specified project
 * 'Execute Analysis' rights on the specified project
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class ListProjectPullRequestService extends AbstractService<ListProjectPullRequestService, ProjectPullRequests> {
    public ListProjectPullRequestService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"project"};
    }

    @Override
    protected ProjectPullRequests doExecute() throws IOException {
        return doGet("api/project_pull_requests/list", ProjectPullRequests.class);
    }

    public ListProjectPullRequestService project(String project) {
        return put("project", project);
    }

}
