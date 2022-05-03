/**
  * Copyright 2022 bejson.com 
  */
package com.geewaza.sonarqube.webapi.model.webservice;

/**
 * Auto-generated: 2022-05-03 18:4:0
 *
 * @author wangheng
 */
public class Param {

    private String key;
    private Boolean required;
    private Boolean internal;
    private Integer maximumValue;
    private Integer minimumLength;
    private String defaultValue;
    private String exampleValue;
    private String since;
    private String deprecatedSince;
    private String deprecatedKey;
    private String deprecatedKeySince;
    private String[] possibleValues;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public Integer getMaximumValue() {
        return maximumValue;
    }

    public void setMaximumValue(Integer maximumValue) {
        this.maximumValue = maximumValue;
    }

    public Integer getMinimumLength() {
        return minimumLength;
    }

    public void setMinimumLength(Integer minimumLength) {
        this.minimumLength = minimumLength;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getExampleValue() {
        return exampleValue;
    }

    public void setExampleValue(String exampleValue) {
        this.exampleValue = exampleValue;
    }

    public String getSince() {
        return since;
    }

    public void setSince(String since) {
        this.since = since;
    }

    public String getDeprecatedSince() {
        return deprecatedSince;
    }

    public void setDeprecatedSince(String deprecatedSince) {
        this.deprecatedSince = deprecatedSince;
    }

    public String getDeprecatedKey() {
        return deprecatedKey;
    }

    public void setDeprecatedKey(String deprecatedKey) {
        this.deprecatedKey = deprecatedKey;
    }

    public String getDeprecatedKeySince() {
        return deprecatedKeySince;
    }

    public void setDeprecatedKeySince(String deprecatedKeySince) {
        this.deprecatedKeySince = deprecatedKeySince;
    }

    public String[] getPossibleValues() {
        return possibleValues;
    }

    public void setPossibleValues(String[] possibleValues) {
        this.possibleValues = possibleValues;
    }
}