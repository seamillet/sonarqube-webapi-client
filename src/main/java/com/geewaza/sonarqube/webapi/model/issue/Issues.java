package com.geewaza.sonarqube.webapi.model.issue;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 21:27
 **/
public class Issues extends Paging {
    private IssueInfo[] issues;

    private Facet[] facets;

    public IssueInfo[] getIssues() {
        return issues;
    }

    public void setIssues(IssueInfo[] issues) {
        this.issues = issues;
    }

    public Facet[] getFacets() {
        return facets;
    }

    public void setFacets(Facet[] facets) {
        this.facets = facets;
    }
}
