package com.geewaza.sonarqube.webapi.model.permissions;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 10:17
 **/
public class PermissionTemplate {

    private String id;
    private String name;
    private String description;
    private String projectKeyPattern;
    private Date createdAt;
    private Date updatedAt;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectKeyPattern() {
        return projectKeyPattern;
    }

    public void setProjectKeyPattern(String projectKeyPattern) {
        this.projectKeyPattern = projectKeyPattern;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }
}
