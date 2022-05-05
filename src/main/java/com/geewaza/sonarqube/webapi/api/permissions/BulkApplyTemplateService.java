package com.geewaza.sonarqube.webapi.api.permissions;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;
import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:56
 **/
public class BulkApplyTemplateService extends AbstractService<BulkApplyTemplateService, Boolean> {
    public BulkApplyTemplateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/bulk_apply_template");
        return true;
    }
    public BulkApplyTemplateService analyzedBefore(Date analyzedBefore) {
        return put("analyzedBefore", analyzedBefore);
    }
    public BulkApplyTemplateService onProvisionedOnly(Boolean onProvisionedOnly) {
        return put("onProvisionedOnly", onProvisionedOnly);
    }
    public BulkApplyTemplateService projects(String... projects) {
        return putCsvParam("projects", projects);
    }
    public BulkApplyTemplateService q(String q) {
        return put("q", q);
    }
    public BulkApplyTemplateService qualifiers(String... qualifiers) {
        return putCsvParam("qualifiers", qualifiers);
    }


    public BulkApplyTemplateService templateId(String templateId) {
        return put("templateId", templateId);
    }
    public BulkApplyTemplateService templateName(String templateName) {
        return put("templateName", templateName);
    }

}
