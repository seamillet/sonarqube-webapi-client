package com.geewaza.sonarqube.webapi.model.user;

import com.alibaba.fastjson.annotation.JSONField;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class Group {
    private Long id;
    private String name;
    private String description;
    private Boolean selected;
    @JSONField(name = "default")
    private Boolean defaultFlag;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getSelected() {
        return selected;
    }

    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    public Boolean getDefaultFlag() {
        return defaultFlag;
    }

    public void setDefaultFlag(Boolean defaultFlag) {
        this.defaultFlag = defaultFlag;
    }
}
