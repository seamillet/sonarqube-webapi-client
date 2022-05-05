package com.geewaza.sonarqube.webapi.model.project;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:24
 **/
public class Analyses {
    private String key;
    private Date date;
    private String projectVersion;
    private String buildString;
    private String revision;
    private Boolean manualNewCodePeriodBaseline;
    private AnalysisEvent[] events;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getProjectVersion() {
        return projectVersion;
    }

    public void setProjectVersion(String projectVersion) {
        this.projectVersion = projectVersion;
    }

    public String getBuildString() {
        return buildString;
    }

    public void setBuildString(String buildString) {
        this.buildString = buildString;
    }

    public String getRevision() {
        return revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public Boolean getManualNewCodePeriodBaseline() {
        return manualNewCodePeriodBaseline;
    }

    public void setManualNewCodePeriodBaseline(Boolean manualNewCodePeriodBaseline) {
        this.manualNewCodePeriodBaseline = manualNewCodePeriodBaseline;
    }

    public AnalysisEvent[] getEvents() {
        return events;
    }

    public void setEvents(AnalysisEvent[] events) {
        this.events = events;
    }
}
