/**
 * Copyright 2022 bejson.com
 */
package com.geewaza.sonarqube.webapi.model.measure;

/**
 * Auto-generated: 2022-04-29 9:30:58
 *
 * @author wangheng
 */
public class Metrics {

    private String key;
    private String name;
    private String description;
    private String domain;
    private String type;
    private Boolean higherValuesAreBetter;
    private Boolean qualitative;
    private Boolean hidden;

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

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getHigherValuesAreBetter() {
        return higherValuesAreBetter;
    }

    public void setHigherValuesAreBetter(Boolean higherValuesAreBetter) {
        this.higherValuesAreBetter = higherValuesAreBetter;
    }

    public Boolean getQualitative() {
        return qualitative;
    }

    public void setQualitative(Boolean qualitative) {
        this.qualitative = qualitative;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }
}