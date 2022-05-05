package com.geewaza.sonarqube.webapi.model.qualitygates;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 12:04
 **/
public class ProjectStatusResponse {
    private ProjectStatus projectStatus;

    public ProjectStatus getProjectStatus() {
        return projectStatus;
    }

    public void setProjectStatus(ProjectStatus projectStatus) {
        this.projectStatus = projectStatus;
    }
}
