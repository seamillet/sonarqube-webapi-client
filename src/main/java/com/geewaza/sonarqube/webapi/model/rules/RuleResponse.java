package com.geewaza.sonarqube.webapi.model.rules;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 18:08
 **/
public class RuleResponse {
    private Rule rule;
    private Active[] actives;

    public Rule getRule() {
        return rule;
    }

    public void setRule(Rule rule) {
        this.rule = rule;
    }

    public Active[] getActives() {
        return actives;
    }

    public void setActives(Active[] actives) {
        this.actives = actives;
    }
}
