package com.geewaza.sonarqube.webapi.model.qualitygates;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 12:01
 **/
public class QualityGate {

    private Long id;

    private String name;
    @JSONField(name = "default")
    private Boolean isDefault;

    private Boolean selected;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }
}
