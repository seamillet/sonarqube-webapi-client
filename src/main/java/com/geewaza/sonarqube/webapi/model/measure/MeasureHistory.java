/**
 * Copyright 2022 bejson.com
 */
package com.geewaza.sonarqube.webapi.model.measure;

/**
 * Auto-generated: 2022-04-29 9:30:58
 *
 * @author wangheng
 */
public class MeasureHistory {

    private String metric;
    private MetricHistory[] history;

    public String getMetric() {
        return metric;
    }

    public void setMetric(String metric) {
        this.metric = metric;
    }

    public MetricHistory[] getHistory() {
        return history;
    }

    public void setHistory(MetricHistory[] history) {
        this.history = history;
    }
}