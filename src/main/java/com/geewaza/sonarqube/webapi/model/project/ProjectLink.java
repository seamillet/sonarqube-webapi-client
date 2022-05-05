package com.geewaza.sonarqube.webapi.model.project;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 17:00
 **/
public class ProjectLink {
    private String id;
    private String name;
    private String type;
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
