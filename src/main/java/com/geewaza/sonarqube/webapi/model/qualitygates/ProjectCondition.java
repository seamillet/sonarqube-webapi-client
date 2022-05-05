package com.geewaza.sonarqube.webapi.model.qualitygates;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 12:04
 **/
public class ProjectCondition {
    private Integer periodIndex;
    private String status;
    private String metricKey;
    private String comparator;
    private String errorThreshold;
    private String actualValue;

    public Integer getPeriodIndex() {
        return periodIndex;
    }

    public void setPeriodIndex(Integer periodIndex) {
        this.periodIndex = periodIndex;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMetricKey() {
        return metricKey;
    }

    public void setMetricKey(String metricKey) {
        this.metricKey = metricKey;
    }

    public String getComparator() {
        return comparator;
    }

    public void setComparator(String comparator) {
        this.comparator = comparator;
    }

    public String getErrorThreshold() {
        return errorThreshold;
    }

    public void setErrorThreshold(String errorThreshold) {
        this.errorThreshold = errorThreshold;
    }

    public String getActualValue() {
        return actualValue;
    }

    public void setActualValue(String actualValue) {
        this.actualValue = actualValue;
    }
}
