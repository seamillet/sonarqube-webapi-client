package com.geewaza.sonarqube.webapi.model.qualityprofiles;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 15:26
 **/
public class Loader {
    private String key;
    private String name;
    private String[] languages;

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

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }
}
