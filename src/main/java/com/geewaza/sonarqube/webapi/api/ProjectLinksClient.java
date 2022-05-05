package com.geewaza.sonarqube.webapi.api;

import com.geewaza.sonarqube.webapi.api.projectlinks.CreateProjectLinkService;
import com.geewaza.sonarqube.webapi.api.projectlinks.DeleteProjectLinkService;
import com.geewaza.sonarqube.webapi.api.projectlinks.SearchProjectLinksService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.impl.AbstractSonarClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:41
 **/
public class ProjectLinksClient extends AbstractSonarClient {
    public ProjectLinksClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public CreateProjectLinkService createProjectLink() {
        return new CreateProjectLinkService(this.httpClient);
    }

    public DeleteProjectLinkService deleteProjectLink() {
        return new DeleteProjectLinkService(this.httpClient);
    }

    public SearchProjectLinksService searchProjectLinks() {
        return new SearchProjectLinksService(this.httpClient);
    }

}
