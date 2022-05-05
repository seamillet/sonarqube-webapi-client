package com.geewaza.sonarqube.webapi.model.rules;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 18:22
 **/
public class Facet {
    private String name;
    private Value[] values;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Value[] getValues() {
        return values;
    }

    public void setValues(Value[] values) {
        this.values = values;
    }
}
