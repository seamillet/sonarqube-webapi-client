package com.geewaza.sonarqube.webapi.model.system;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 09:37
 **/
public class Setting {
    private String key;
    private String value;
    private String[] values;
    private Boolean inherited;
    private FieldValue[] fieldValues;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String[] getValues() {
        return values;
    }

    public void setValues(String[] values) {
        this.values = values;
    }

    public Boolean getInherited() {
        return inherited;
    }

    public void setInherited(Boolean inherited) {
        this.inherited = inherited;
    }

    public FieldValue[] getFieldValues() {
        return fieldValues;
    }

    public void setFieldValues(FieldValue[] fieldValues) {
        this.fieldValues = fieldValues;
    }
}
