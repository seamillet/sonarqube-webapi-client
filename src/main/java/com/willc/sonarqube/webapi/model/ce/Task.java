package com.willc.sonarqube.webapi.model.ce;

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
    private String submittedAt;
    private String startedAt;
    private String executedAt;
    private String executionTimeMs;
    private Boolean logs;
}
