package com.geewaza.sonarqube.webapi.model.issue;

import com.geewaza.sonarqube.webapi.model.system.Value;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-09 18:54
 **/
public class Facet {

    private String property;

    private Value[] values;

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public Value[] getValues() {
        return values;
    }

    public void setValues(Value[] values) {
        this.values = values;
    }
}
