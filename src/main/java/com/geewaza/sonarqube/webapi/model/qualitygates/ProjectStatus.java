package com.geewaza.sonarqube.webapi.model.qualitygates;

import com.geewaza.sonarqube.webapi.model.measure.Period;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 12:04
 **/
public class ProjectStatus {
    private String status;
    private Boolean ignoredConditions;
    private ProjectCondition[] conditions;
    private Period[] periods;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getIgnoredConditions() {
        return ignoredConditions;
    }

    public void setIgnoredConditions(Boolean ignoredConditions) {
        this.ignoredConditions = ignoredConditions;
    }

    public ProjectCondition[] getConditions() {
        return conditions;
    }

    public void setConditions(ProjectCondition[] conditions) {
        this.conditions = conditions;
    }

    public Period[] getPeriods() {
        return periods;
    }

    public void setPeriods(Period[] periods) {
        this.periods = periods;
    }
}
