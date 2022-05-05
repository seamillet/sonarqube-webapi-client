package com.geewaza.sonarqube.webapi.model.project;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:53
 **/
public class ProjectBranch {

    private String name;
    private String type;
    private String mergeBranch;
    private Boolean isMain;
    private BranchStatus status;
    private Date analysisDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMergeBranch() {
        return mergeBranch;
    }

    public void setMergeBranch(String mergeBranch) {
        this.mergeBranch = mergeBranch;
    }

    public Boolean getMain() {
        return isMain;
    }

    public void setMain(Boolean main) {
        isMain = main;
    }

    public BranchStatus getStatus() {
        return status;
    }

    public void setStatus(BranchStatus status) {
        this.status = status;
    }

    public Date getAnalysisDate() {
        return analysisDate;
    }

    public void setAnalysisDate(Date analysisDate) {
        this.analysisDate = analysisDate;
    }
}
