package com.geewaza.sonarqube.webapi.model.rules;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 18:06
 **/
public class RuleParam {
    private String key;
    private String htmlDesc;
    private String defaultValue;
    private String type;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getHtmlDesc() {
        return htmlDesc;
    }

    public void setHtmlDesc(String htmlDesc) {
        this.htmlDesc = htmlDesc;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
