package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.projects.*;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 23:16
 **/
public class ProjectsClient extends AbstractSonarClient {
    public ProjectsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }


    public BulkDeleteProjectService bulkDeleteProject() {
        return new BulkDeleteProjectService(this.httpClient);
    }

    public CreateProjectService createProject() {
        return new CreateProjectService(this.httpClient);
    }

    public DeleteProjectService deleteProject() {
        return new DeleteProjectService(this.httpClient);
    }

    public SearchProjectService searchProject() {
        return new SearchProjectService(this.httpClient);
    }
    public UpdateProjectKeyService updateProjectKey() {
        return new UpdateProjectKeyService(this.httpClient);
    }
    public UpdateProjectVisibilityService updateProjectVisibility() {
        return new UpdateProjectVisibilityService(this.httpClient);
    }
}
