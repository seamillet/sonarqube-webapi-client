/**
  * Copyright 2022 bejson.com 
  */
package com.geewaza.sonarqube.webapi.model.measure;

/**
 * Auto-generated: 2022-04-29 9:30:58
 *
 * @author wangheng
 */
public class Measures {

    private String metric;
    private String value;
    private Period period;
    public void setMetric(String metric) {
         this.metric = metric;
     }
     public String getMetric() {
         return metric;
     }

    public void setValue(String value) {
         this.value = value;
     }
     public String getValue() {
         return value;
     }

    public void setPeriod(Period period) {
         this.period = period;
     }
     public Period getPeriod() {
         return period;
     }

}