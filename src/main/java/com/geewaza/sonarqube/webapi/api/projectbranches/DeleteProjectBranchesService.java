package com.geewaza.sonarqube.webapi.api.projectbranches;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Delete a non-main branch of a project.
 * Requires 'Administer' rights on the specified project.
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class DeleteProjectBranchesService extends AbstractService<DeleteProjectBranchesService, Boolean> {
    public DeleteProjectBranchesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"branch", "project"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/project_branches/delete");
        return true;
    }

    public DeleteProjectBranchesService branch(String branch) {
        return put("branch", branch);
    }
    public DeleteProjectBranchesService project(String project) {
        return put("project", project);
    }


}
