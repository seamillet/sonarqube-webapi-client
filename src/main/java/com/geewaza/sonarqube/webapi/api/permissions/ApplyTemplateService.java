package com.geewaza.sonarqube.webapi.api.permissions;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:56
 **/
public class ApplyTemplateService extends AbstractService<ApplyTemplateService, Boolean> {
    public ApplyTemplateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/apply_template");
        return true;
    }
    public ApplyTemplateService projectId(String projectId) {
        return put("projectId", projectId);
    }
    public ApplyTemplateService projectKey(String projectKey) {
        return put("projectKey", projectKey);
    }
    public ApplyTemplateService templateId(String templateId) {
        return put("templateId", templateId);
    }
    public ApplyTemplateService templateName(String templateName) {
        return put("templateName", templateName);
    }

}
