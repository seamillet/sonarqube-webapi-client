package com.geewaza.sonarqube.webapi.model.duplication;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 11:36
 **/
public class DuplicationFile {

    private String key;
    private String name;
    private String projectName;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
}
