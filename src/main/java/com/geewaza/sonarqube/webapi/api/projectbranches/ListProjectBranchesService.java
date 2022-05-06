package com.geewaza.sonarqube.webapi.api.projectbranches;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.project.ProjectBranches;

import java.io.IOException;

/**
 * List the branches of a project.
 * Requires 'Browse' or 'Execute analysis' rights on the specified project.
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class ListProjectBranchesService extends AbstractService<ListProjectBranchesService, ProjectBranches> {
    public ListProjectBranchesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"project"};
    }

    @Override
    protected ProjectBranches doExecute() throws IOException {
        return doGet("api/project_branches/list", ProjectBranches.class);
    }

    public ListProjectBranchesService project(String project) {
        return put("project", project);
    }

}
