/**
  * Copyright 2022 bejson.com 
  */
package com.geewaza.sonarqube.webapi.model.measure;

/**
 * Auto-generated: 2022-04-29 9:39:59
 *
 * @author wangheng
 */
public class BaseComponent {

    private String key;
    private String name;
    private String qualifier;
    private Measures[] measures;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public Measures[] getMeasures() {
        return measures;
    }

    public void setMeasures(Measures[] measures) {
        this.measures = measures;
    }
}