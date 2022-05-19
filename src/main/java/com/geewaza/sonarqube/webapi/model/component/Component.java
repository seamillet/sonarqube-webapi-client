/**
 * Copyright 2022 bejson.com
 */
package com.geewaza.sonarqube.webapi.model.component;

import com.geewaza.sonarqube.webapi.model.measure.Measures;

import java.util.Date;

/**
 * Auto-generated: 2022-04-29 9:30:58
 *
 * @author wangheng
 */
public class Component {

    private String id;
    private String key;
    private String name;
    private String qualifier;
    private String language;
    private String path;
    private String[] tags;
    private String version;
    private Date analysisDate;
    private Date leakPeriodDate;
    private String visibility;
    private String organization;
    private Measures[] measures;
    private Boolean needIssueSync;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Date getAnalysisDate() {
        return analysisDate;
    }

    public void setAnalysisDate(Date analysisDate) {
        this.analysisDate = analysisDate;
    }

    public Date getLeakPeriodDate() {
        return leakPeriodDate;
    }

    public void setLeakPeriodDate(Date leakPeriodDate) {
        this.leakPeriodDate = leakPeriodDate;
    }

    public String getVisibility() {
        return visibility;
    }

    public void setVisibility(String visibility) {
        this.visibility = visibility;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public Measures[] getMeasures() {
        return measures;
    }

    public void setMeasures(Measures[] measures) {
        this.measures = measures;
    }

    public Boolean getNeedIssueSync() {
        return needIssueSync;
    }

    public void setNeedIssueSync(Boolean needIssueSync) {
        this.needIssueSync = needIssueSync;
    }
}