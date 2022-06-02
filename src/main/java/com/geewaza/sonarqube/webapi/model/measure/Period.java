/**
 * Copyright 2022 bejson.com
 */
package com.geewaza.sonarqube.webapi.model.measure;

import java.util.Date;

/**
 * Auto-generated: 2022-04-29 9:30:58
 *
 * @author wangheng
 */
public class Period {

    private String mode;
    private Date date;
    private String parameter;
    private Integer index;
    private String value;
    private Boolean bestValue;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Boolean getBestValue() {
        return bestValue;
    }

    public void setBestValue(Boolean bestValue) {
        this.bestValue = bestValue;
    }
}