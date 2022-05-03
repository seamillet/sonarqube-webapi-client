package com.geewaza.sonarqube.webapi.api.components;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.component.Components;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 18:51
 **/
public class ComponentsSearchService extends AbstractService<ComponentsSearchService, Components> {


    public ComponentsSearchService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"qualifiers"};
    }

    @Override
    protected Components doExecute() throws IOException {
        return this.httpClient.get("api/components/search", params, Components.class);
    }

    public ComponentsSearchService language(String language) {
        return put("language", language);
    }

    public ComponentsSearchService p(Integer p) {
        return put("p", p);
    }

    public ComponentsSearchService ps(Integer ps) {
        return put("ps", ps);
    }

    public ComponentsSearchService q(String q) {
        return put("q", q);
    }
    public ComponentsSearchService qualifiers(String... qualifier) {
        return putCsvParam("qualifiers", qualifier);
    }



}
