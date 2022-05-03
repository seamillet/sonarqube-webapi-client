package com.geewaza.sonarqube.webapi.model.component;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 23:26
 **/
public class Project {

    private String key;
    private String name;
    private String qualifier;

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
}
