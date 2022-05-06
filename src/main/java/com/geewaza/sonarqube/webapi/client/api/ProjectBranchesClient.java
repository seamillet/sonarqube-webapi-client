package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.projectbranches.DeleteProjectBranchesService;
import com.geewaza.sonarqube.webapi.api.projectbranches.ListProjectBranchesService;
import com.geewaza.sonarqube.webapi.api.projectbranches.RenameProjectBranchesService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:41
 **/
public class ProjectBranchesClient extends AbstractSonarClient {
    public ProjectBranchesClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public DeleteProjectBranchesService deleteProjectBranches() {
        return new DeleteProjectBranchesService(this.httpClient);
    }

    public ListProjectBranchesService listProjectBranches() {
        return new ListProjectBranchesService(this.httpClient);
    }

    public RenameProjectBranchesService renameProjectBranches() {
        return new RenameProjectBranchesService(this.httpClient);
    }

}
