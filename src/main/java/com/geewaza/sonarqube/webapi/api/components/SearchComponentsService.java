package com.geewaza.sonarqube.webapi.api.components;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.component.Components;

import java.io.IOException;

/**
 * Search for components
 *
 * @author : wangheng
 * @date : 2022-05-03 18:51
 **/
public class SearchComponentsService extends AbstractService<SearchComponentsService, Components> {


    public SearchComponentsService(BaseHttpClient httpClient) {
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

    public SearchComponentsService language(String language) {
        return put("language", language);
    }

    public SearchComponentsService p(Integer p) {
        return put("p", p);
    }

    public SearchComponentsService ps(Integer ps) {
        return put("ps", ps);
    }

    public SearchComponentsService q(String q) {
        return put("q", q);
    }
    public SearchComponentsService qualifiers(String... qualifier) {
        return putCsvParam("qualifiers", qualifier);
    }



}
