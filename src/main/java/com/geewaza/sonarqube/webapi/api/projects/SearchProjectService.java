package com.geewaza.sonarqube.webapi.api.projects;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.component.Components;

import java.io.IOException;
import java.util.Date;

/**
 * Search for projects or views to administrate them.
 * Requires 'System Administrator' permission
 *
 * @author : wangheng
 * @date : 2022-05-03 23:17
 **/
public class SearchProjectService extends AbstractService<SearchProjectService, Components> {
    public SearchProjectService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Components doExecute() throws IOException {
         return doGet("api/projects/search", Components.class);
    }

    public SearchProjectService analyzedBefore(Date analyzedBefore) {
        return put("analyzedBefore", analyzedBefore);
    }

    public SearchProjectService onProvisionedOnly(Boolean onProvisionedOnly) {
        return put("onProvisionedOnly", onProvisionedOnly);
    }

    public SearchProjectService projects(String... projects) {
        return putCsvParam("projects", projects);
    }

    public SearchProjectService p(Integer p) {
        return put("p", p);
    }

    public SearchProjectService ps(Integer ps) {
        return put("ps", ps);
    }

    public SearchProjectService q(String q) {
        return put("q", q);
    }

    public SearchProjectService qualifiers(String... qualifiers) {
        return putCsvParam("qualifiers", qualifiers);
    }

}
