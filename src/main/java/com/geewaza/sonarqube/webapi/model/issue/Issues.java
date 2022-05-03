package com.geewaza.sonarqube.webapi.model.issue;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 21:27
 **/
public class Issues extends Paging {
    private Issue[] issues;

    public Issue[] getIssues() {
        return issues;
    }

    public void setIssues(Issue[] issues) {
        this.issues = issues;
    }
}
