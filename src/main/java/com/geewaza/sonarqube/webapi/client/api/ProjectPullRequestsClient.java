package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.projectpullrequests.DeleteProjectPullRequestService;
import com.geewaza.sonarqube.webapi.api.projectpullrequests.ListProjectPullRequestService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:41
 **/
public class ProjectPullRequestsClient extends AbstractSonarClient {
    public ProjectPullRequestsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public DeleteProjectPullRequestService deleteProjectPullRequest() {
        return new DeleteProjectPullRequestService(this.httpClient);
    }

    public ListProjectPullRequestService listProjectPullRequest() {
        return new ListProjectPullRequestService(this.httpClient);
    }


}
