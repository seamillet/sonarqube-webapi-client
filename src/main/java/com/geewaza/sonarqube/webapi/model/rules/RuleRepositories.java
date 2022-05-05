package com.geewaza.sonarqube.webapi.model.rules;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 18:14
 **/
public class RuleRepositories {
    private RuleRepository[] repositories;

    public RuleRepository[] getRepositories() {
        return repositories;
    }

    public void setRepositories(RuleRepository[] repositories) {
        this.repositories = repositories;
    }
}
