package com.geewaza.sonarqube.webapi.model.issue;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 20:29
 **/
public class Diff {
    private String key;
    private String newValue;
    private String oldValue;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getNewValue() {
        return newValue;
    }

    public void setNewValue(String newValue) {
        this.newValue = newValue;
    }

    public String getOldValue() {
        return oldValue;
    }

    public void setOldValue(String oldValue) {
        this.oldValue = oldValue;
    }
}
