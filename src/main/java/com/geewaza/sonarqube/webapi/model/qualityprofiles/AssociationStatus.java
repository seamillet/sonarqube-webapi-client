package com.geewaza.sonarqube.webapi.model.qualityprofiles;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 15:35
 **/
public class AssociationStatus {

    private String id;
    private String key;
    private String name;
    private Boolean selected;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
