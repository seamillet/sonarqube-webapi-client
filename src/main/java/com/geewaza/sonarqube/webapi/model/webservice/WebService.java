package com.geewaza.sonarqube.webapi.model.webservice;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 18:05
 **/
public class WebService {
    private String path;
    private String since;
    private String description;
    private Action[] actions;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Action[] getActions() {
        return actions;
    }

    public void setActions(Action[] actions) {
        this.actions = actions;
    }
}
