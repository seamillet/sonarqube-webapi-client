package com.geewaza.sonarqube.webapi.model.project;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:53
 **/
public class ProjectBranches {

    private ProjectBranch[] branches;

    public ProjectBranch[] getBranches() {
        return branches;
    }

    public void setBranches(ProjectBranch[] branches) {
        this.branches = branches;
    }
}
