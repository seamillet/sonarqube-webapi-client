package com.geewaza.sonarqube.webapi.api.projects;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;
import java.util.Date;

/**
 * Delete one or several projects.
 * Requires 'Administer System' permission.
 * At least one parameter is required among analyzedBefore, projects, projectIds (deprecated since 6.4) and q
 *
 * @author : wangheng
 * @date : 2022-05-03 23:17
 **/
public class BulkDeleteProjectService extends AbstractService<BulkDeleteProjectService, Boolean> {
    public BulkDeleteProjectService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
         doPost("api/projects/bulk_delete");
         return true;
    }

    public BulkDeleteProjectService analyzedBefore(Date analyzedBefore) {
        return put("analyzedBefore", analyzedBefore);
    }

    public BulkDeleteProjectService onProvisionedOnly(Boolean onProvisionedOnly) {
        return put("onProvisionedOnly", onProvisionedOnly);
    }

    public BulkDeleteProjectService projects(String... projects) {
        return putCsvParam("projects", projects);
    }

    public BulkDeleteProjectService q(String q) {
        return put("q", q);
    }

    public BulkDeleteProjectService qualifiers(String... qualifiers) {
        return putCsvParam("qualifiers", qualifiers);
    }

}
