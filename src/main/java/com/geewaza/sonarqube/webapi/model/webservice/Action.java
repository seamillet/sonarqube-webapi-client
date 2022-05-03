/**
  * Copyright 2022 bejson.com 
  */
package com.geewaza.sonarqube.webapi.model.webservice;

/**
 * Auto-generated: 2022-05-03 18:4:0
 *
 * @author wangheng
 */
public class Action {

    private String key;
    private String description;
    private String since;
    private String deprecatedSince;
    private Boolean internal;
    private Boolean post;
    private Boolean hasResponseExample;
    private Changelog[] changelog;
    private Param[] params;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public String getDeprecatedSince() {
        return deprecatedSince;
    }

    public void setDeprecatedSince(String deprecatedSince) {
        this.deprecatedSince = deprecatedSince;
    }

    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public Boolean getPost() {
        return post;
    }

    public void setPost(Boolean post) {
        this.post = post;
    }

    public Boolean getHasResponseExample() {
        return hasResponseExample;
    }

    public void setHasResponseExample(Boolean hasResponseExample) {
        this.hasResponseExample = hasResponseExample;
    }

    public Changelog[] getChangelog() {
        return changelog;
    }

    public void setChangelog(Changelog[] changelog) {
        this.changelog = changelog;
    }

    public Param[] getParams() {
        return params;
    }

    public void setParams(Param[] params) {
        this.params = params;
    }
}