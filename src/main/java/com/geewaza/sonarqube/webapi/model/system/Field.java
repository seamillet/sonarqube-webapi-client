package com.geewaza.sonarqube.webapi.model.system;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 09:27
 **/
public class Field {
    private String key;
    private String name;
    private String description;
    private String type;
    private String[] options;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }
}
