package com.geewaza.sonarqube.webapi.model.measure;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-02 22:23
 **/
public class MetricHistory {

    private Date date;
    private String value;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
