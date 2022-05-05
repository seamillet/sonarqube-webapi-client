package com.geewaza.sonarqube.webapi.model.project;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:53
 **/
public class BranchStatus {
    private String qualityGateStatus;
    private Integer bugs;
    private Integer vulnerabilities;
    private Integer codeSmells;

    public String getQualityGateStatus() {
        return qualityGateStatus;
    }

    public void setQualityGateStatus(String qualityGateStatus) {
        this.qualityGateStatus = qualityGateStatus;
    }

    public Integer getBugs() {
        return bugs;
    }

    public void setBugs(Integer bugs) {
        this.bugs = bugs;
    }

    public Integer getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(Integer vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public Integer getCodeSmells() {
        return codeSmells;
    }

    public void setCodeSmells(Integer codeSmells) {
        this.codeSmells = codeSmells;
    }
}
