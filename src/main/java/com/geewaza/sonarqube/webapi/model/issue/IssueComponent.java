/**
 * Copyright 2022 bejson.com
 */
package com.geewaza.sonarqube.webapi.model.issue;

/**
 * Auto-generated: 2022-05-03 19:33:29
 *
 * @author wangheng
 */
public class IssueComponent {

    private String key;
    private String uuid;
    private Boolean enabled;
    private String qualifier;
    private String name;
    private String longName;
    private String path;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLongName() {
        return longName;
    }

    public void setLongName(String longName) {
        this.longName = longName;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}