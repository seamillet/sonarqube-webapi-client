package com.geewaza.sonarqube.webapi.api.projectbranches;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Rename the main branch of a project.
 * Requires 'Administer' permission on the specified project.
 *
 * @author : wangheng
 * @date : 2022-05-05 16:32
 **/
public class RenameProjectBranchesService extends AbstractService<RenameProjectBranchesService, Boolean> {
    public RenameProjectBranchesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"name", "project"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/project_branches/rename");
        return true;
    }

    public RenameProjectBranchesService name(String name) {
        return put("name", name);
    }
    public RenameProjectBranchesService project(String project) {
        return put("project", project);
    }


}
