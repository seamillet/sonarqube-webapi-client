package com.geewaza.sonarqube.webapi.model.qualityprofiles;

import com.geewaza.sonarqube.webapi.model.qualitygates.Action;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 15:13
 **/
public class QualityProfile {

    private String key;
    private String name;
    private String language;
    private String parentKey;
    private Boolean isDefault;
    private Boolean isInherited;
    private Boolean isBuiltIn;
    private Integer activeRuleCount;
    private Integer activeDeprecatedRuleCount;
    private Date ruleUpdatedAt;
    private Date lastUsed;
    private Action[] actions;


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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getParentKey() {
        return parentKey;
    }

    public void setParentKey(String parentKey) {
        this.parentKey = parentKey;
    }

    public Boolean getDefault() {
        return isDefault;
    }

    public void setDefault(Boolean aDefault) {
        isDefault = aDefault;
    }

    public Boolean getInherited() {
        return isInherited;
    }

    public void setInherited(Boolean inherited) {
        isInherited = inherited;
    }

    public Boolean getBuiltIn() {
        return isBuiltIn;
    }

    public void setBuiltIn(Boolean builtIn) {
        isBuiltIn = builtIn;
    }

    public Integer getActiveRuleCount() {
        return activeRuleCount;
    }

    public void setActiveRuleCount(Integer activeRuleCount) {
        this.activeRuleCount = activeRuleCount;
    }

    public Integer getActiveDeprecatedRuleCount() {
        return activeDeprecatedRuleCount;
    }

    public void setActiveDeprecatedRuleCount(Integer activeDeprecatedRuleCount) {
        this.activeDeprecatedRuleCount = activeDeprecatedRuleCount;
    }

    public Date getRuleUpdatedAt() {
        return ruleUpdatedAt;
    }

    public void setRuleUpdatedAt(Date ruleUpdatedAt) {
        this.ruleUpdatedAt = ruleUpdatedAt;
    }

    public Date getLastUsed() {
        return lastUsed;
    }

    public void setLastUsed(Date lastUsed) {
        this.lastUsed = lastUsed;
    }

    public Action[] getActions() {
        return actions;
    }

    public void setActions(Action[] actions) {
        this.actions = actions;
    }
}
