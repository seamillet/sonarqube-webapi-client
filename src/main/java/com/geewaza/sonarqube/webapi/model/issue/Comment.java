/**
  * Copyright 2022 bejson.com 
  */
package com.geewaza.sonarqube.webapi.model.issue;
import java.util.Date;

/**
 * Auto-generated: 2022-05-03 19:33:29
 *
 * @author wangheng
 */
public class Comment {

    private String key;
    private String login;
    private String htmlText;
    private String markdown;
    private Boolean updatable;
    private Date createdAt;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getHtmlText() {
        return htmlText;
    }

    public void setHtmlText(String htmlText) {
        this.htmlText = htmlText;
    }

    public String getMarkdown() {
        return markdown;
    }

    public void setMarkdown(String markdown) {
        this.markdown = markdown;
    }

    public Boolean getUpdatable() {
        return updatable;
    }

    public void setUpdatable(Boolean updatable) {
        this.updatable = updatable;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}