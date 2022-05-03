package com.geewaza.sonarqube.webapi.model.notifications;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 22:36
 **/
public class Notification {
    private String channel;
    private String type;
    private String organization;
    private String project;
    private String projectName;

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
