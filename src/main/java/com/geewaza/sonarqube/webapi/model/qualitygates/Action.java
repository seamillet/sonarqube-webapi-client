package com.geewaza.sonarqube.webapi.model.qualitygates;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 14:15
 **/
public class Action {
    private Boolean rename;
    private Boolean setAsDefault;
    private Boolean copy;
    private Boolean associateProjects;
    private Boolean manageConditions;

    public Boolean getRename() {
        return rename;
    }

    public void setRename(Boolean rename) {
        this.rename = rename;
    }

    public Boolean getSetAsDefault() {
        return setAsDefault;
    }

    public void setSetAsDefault(Boolean setAsDefault) {
        this.setAsDefault = setAsDefault;
    }

    public Boolean getCopy() {
        return copy;
    }

    public void setCopy(Boolean copy) {
        this.copy = copy;
    }

    public Boolean getAssociateProjects() {
        return associateProjects;
    }

    public void setAssociateProjects(Boolean associateProjects) {
        this.associateProjects = associateProjects;
    }

    public Boolean getManageConditions() {
        return manageConditions;
    }

    public void setManageConditions(Boolean manageConditions) {
        this.manageConditions = manageConditions;
    }
}
