package com.geewaza.sonarqube.webapi.model.project;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 17:14
 **/
public class ProjectPullRequests {
    private ProjectPullRequest[] pullRequests;

    public ProjectPullRequest[] getPullRequests() {
        return pullRequests;
    }

    public void setPullRequests(ProjectPullRequest[] pullRequests) {
        this.pullRequests = pullRequests;
    }
}
