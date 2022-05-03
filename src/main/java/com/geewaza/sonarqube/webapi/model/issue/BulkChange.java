package com.geewaza.sonarqube.webapi.model.issue;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 20:36
 **/
public class BulkChange {

    private Integer total;
    private Integer success;
    private Integer ignored;
    private Integer failures;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getSuccess() {
        return success;
    }

    public void setSuccess(Integer success) {
        this.success = success;
    }

    public Integer getIgnored() {
        return ignored;
    }

    public void setIgnored(Integer ignored) {
        this.ignored = ignored;
    }

    public Integer getFailures() {
        return failures;
    }

    public void setFailures(Integer failures) {
        this.failures = failures;
    }
}
