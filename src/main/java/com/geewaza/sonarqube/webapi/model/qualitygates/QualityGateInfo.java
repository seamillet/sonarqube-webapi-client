package com.geewaza.sonarqube.webapi.model.qualitygates;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 12:01
 **/
public class QualityGateInfo {

    private Long id;

    private String name;

    private Condition[] conditions;

    private Boolean isDefault;

    private Boolean isBuiltIn;

    private Action action;

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

    public Condition[] getConditions() {
        return conditions;
    }

    public void setConditions(Condition[] conditions) {
        this.conditions = conditions;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Boolean getBuiltIn() {
        return isBuiltIn;
    }

    public void setBuiltIn(Boolean builtIn) {
        isBuiltIn = builtIn;
    }

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }
}
