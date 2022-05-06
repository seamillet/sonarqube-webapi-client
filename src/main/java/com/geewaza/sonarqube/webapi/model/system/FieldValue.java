package com.geewaza.sonarqube.webapi.model.system;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 09:36
 **/
public class FieldValue {
    @JSONField(name = "boolean")
    private String isBoolean;

    private String text;

    public String getIsBoolean() {
        return isBoolean;
    }

    public void setIsBoolean(String isBoolean) {
        this.isBoolean = isBoolean;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
