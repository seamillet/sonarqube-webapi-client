package com.geewaza.sonarqube.webapi.model.rules;

import com.geewaza.sonarqube.webapi.model.PageModel;

import java.util.Map;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 18:15
 **/
public class Rules extends PageModel {
    private Rule[] rules;
    private Map<String, Active> actives;
    private Facet[] facets;

    public Rule[] getRules() {
        return rules;
    }

    public void setRules(Rule[] rules) {
        this.rules = rules;
    }

    public Map<String, Active> getActives() {
        return actives;
    }

    public void setActives(Map<String, Active> actives) {
        this.actives = actives;
    }

    public Facet[] getFacets() {
        return facets;
    }

    public void setFacets(Facet[] facets) {
        this.facets = facets;
    }
}
