package com.geewaza.sonarqube.webapi.model.measure;

import com.geewaza.sonarqube.webapi.model.PageModel;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 17:53
 **/
public class Metrics extends PageModel {

    private Metric[] metrics;

    public Metric[] getMetrics() {
        return metrics;
    }

    public void setMetrics(Metric[] metrics) {
        this.metrics = metrics;
    }
}
