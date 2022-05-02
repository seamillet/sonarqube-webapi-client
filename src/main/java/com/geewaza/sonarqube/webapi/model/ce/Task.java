package com.geewaza.sonarqube.webapi.model.ce;

import java.util.Date;

/**
 * Compute Engine task info
 *
 * @author chengkeqian
 * @since 2017-06-20
 */
public class Task {
    private String id;
    private String type;
    private String componentId;
    private String componentKey;
    private String componentName;
    private String componentQualifier;
    private String analysisId;
    private String status;
    private Date submittedAt;
    private Date startedAt;
    private Date executedAt;
    private Long executionTimeMs;
    private Boolean logs;
    private String errorMessage;
    private String errorType;
    private Boolean hasErrorStacktrace;
    private Boolean hasScannerContext;
    private String scannerContext;
    private String organization;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public String getComponentKey() {
        return componentKey;
    }

    public void setComponentKey(String componentKey) {
        this.componentKey = componentKey;
    }

    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public String getComponentQualifier() {
        return componentQualifier;
    }

    public void setComponentQualifier(String componentQualifier) {
        this.componentQualifier = componentQualifier;
    }

    public String getAnalysisId() {
        return analysisId;
    }

    public void setAnalysisId(String analysisId) {
        this.analysisId = analysisId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getSubmittedAt() {
        return submittedAt;
    }

    public void setSubmittedAt(Date submittedAt) {
        this.submittedAt = submittedAt;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public Date getExecutedAt() {
        return executedAt;
    }

    public void setExecutedAt(Date executedAt) {
        this.executedAt = executedAt;
    }

    public Long getExecutionTimeMs() {
        return executionTimeMs;
    }

    public void setExecutionTimeMs(Long executionTimeMs) {
        this.executionTimeMs = executionTimeMs;
    }

    public Boolean getLogs() {
        return logs;
    }

    public void setLogs(Boolean logs) {
        this.logs = logs;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getErrorType() {
        return errorType;
    }

    public void setErrorType(String errorType) {
        this.errorType = errorType;
    }

    public Boolean getHasErrorStacktrace() {
        return hasErrorStacktrace;
    }

    public void setHasErrorStacktrace(Boolean hasErrorStacktrace) {
        this.hasErrorStacktrace = hasErrorStacktrace;
    }

    public Boolean getHasScannerContext() {
        return hasScannerContext;
    }

    public void setHasScannerContext(Boolean hasScannerContext) {
        this.hasScannerContext = hasScannerContext;
    }

    public String getScannerContext() {
        return scannerContext;
    }

    public void setScannerContext(String scannerContext) {
        this.scannerContext = scannerContext;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }
}
