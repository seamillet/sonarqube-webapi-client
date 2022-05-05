package com.geewaza.sonarqube.webapi.model.rules;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 18:03
 **/
public class Rule {
    private String key;
    private String repo;
    private String name;
    private Date createAt;
    private String htmlDesc;
    private String mdDesc;
    private String severity;
    private String status;
    private Boolean isTemplate;
    private String templateKey;
    private String lang;
    private String langName;
    private String[] sysTags;
    private String[] tags;
    private RuleParam[] params;
    private String scope;
    private String type;
    private Boolean isExternal;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getRepo() {
        return repo;
    }

    public void setRepo(String repo) {
        this.repo = repo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getHtmlDesc() {
        return htmlDesc;
    }

    public void setHtmlDesc(String htmlDesc) {
        this.htmlDesc = htmlDesc;
    }

    public String getMdDesc() {
        return mdDesc;
    }

    public void setMdDesc(String mdDesc) {
        this.mdDesc = mdDesc;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getTemplate() {
        return isTemplate;
    }

    public void setTemplate(Boolean template) {
        isTemplate = template;
    }

    public String getTemplateKey() {
        return templateKey;
    }

    public void setTemplateKey(String templateKey) {
        this.templateKey = templateKey;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getLangName() {
        return langName;
    }

    public void setLangName(String langName) {
        this.langName = langName;
    }

    public String[] getSysTags() {
        return sysTags;
    }

    public void setSysTags(String[] sysTags) {
        this.sysTags = sysTags;
    }

    public RuleParam[] getParams() {
        return params;
    }

    public void setParams(RuleParam[] params) {
        this.params = params;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Boolean getExternal() {
        return isExternal;
    }

    public void setExternal(Boolean external) {
        isExternal = external;
    }

    public String[] getTags() {
        return tags;
    }

    public void setTags(String[] tags) {
        this.tags = tags;
    }
}
