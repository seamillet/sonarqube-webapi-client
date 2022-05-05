package com.geewaza.sonarqube.webapi.model.rules;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 18:20
 **/
public class Active {

    private String qProfile;
    private String inherit;
    private String severity;
    private Param[] params;

    public String getqProfile() {
        return qProfile;
    }

    public void setqProfile(String qProfile) {
        this.qProfile = qProfile;
    }

    public String getInherit() {
        return inherit;
    }

    public void setInherit(String inherit) {
        this.inherit = inherit;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public Param[] getParams() {
        return params;
    }

    public void setParams(Param[] params) {
        this.params = params;
    }
}
