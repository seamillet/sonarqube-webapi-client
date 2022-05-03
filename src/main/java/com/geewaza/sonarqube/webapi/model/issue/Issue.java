/**
  * Copyright 2022 bejson.com 
  */
package com.geewaza.sonarqube.webapi.model.issue;

import com.geewaza.sonarqube.webapi.model.user.User;

/**
 * Auto-generated: 2022-05-03 19:33:29
 *
 * @author wangheng
 */
public class Issue {

    private IssueInfo issue;
    private IssueComponent[] components;
    private Rule[] rules;
    private User[] users;

    public IssueInfo getIssue() {
        return issue;
    }

    public void setIssue(IssueInfo issueInfo) {
        this.issue = issueInfo;
    }

    public IssueComponent[] getComponents() {
        return components;
    }

    public void setComponents(IssueComponent[] components) {
        this.components = components;
    }

    public Rule[] getRules() {
        return rules;
    }

    public void setRules(Rule[] rules) {
        this.rules = rules;
    }

    public User[] getUsers() {
        return users;
    }

    public void setUsers(User[] users) {
        this.users = users;
    }
}