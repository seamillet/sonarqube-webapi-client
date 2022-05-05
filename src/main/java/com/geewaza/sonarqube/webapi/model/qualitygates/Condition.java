package com.geewaza.sonarqube.webapi.model.qualitygates;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 12:04
 **/
public class Condition {
    private Integer id;
    private String metric;
    private String op;
    private String error;
    private String warning;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getWarning() {
        return warning;
    }

    public void setWarning(String warning) {
        this.warning = warning;
    }
}
