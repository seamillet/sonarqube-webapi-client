/**
  * Copyright 2022 bejson.com 
  */
package com.geewaza.sonarqube.webapi.model.measure;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * Auto-generated: 2022-04-29 9:39:59
 *
 * @author wangheng
 */
public class ComponentMeasuresTree extends Paging {

    private BaseComponent baseComponent;
    private Components[] components;
    private Metric[] metrics;
    private Period period;

    public BaseComponent getBaseComponent() {
        return baseComponent;
    }

    public void setBaseComponent(BaseComponent baseComponent) {
        this.baseComponent = baseComponent;
    }

    public Components[] getComponents() {
        return components;
    }

    public void setComponents(Components[] components) {
        this.components = components;
    }

    public Metric[] getMetrics() {
        return metrics;
    }

    public void setMetrics(Metric[] metrics) {
        this.metrics = metrics;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}