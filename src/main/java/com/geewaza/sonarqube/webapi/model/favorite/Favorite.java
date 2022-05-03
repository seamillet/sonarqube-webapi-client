package com.geewaza.sonarqube.webapi.model.favorite;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 17:34
 **/
public class Favorite {

    private String organization;
    private String key;
    private String name;
    private String qualifier;

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

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
