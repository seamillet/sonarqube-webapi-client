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
public class DeleteTemplateService extends AbstractService<DeleteTemplateService, Boolean> {
    public DeleteTemplateService(BaseHttpClient httpClient) {
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
    public DeleteTemplateService templateId(String templateId) {
        return put("templateId", templateId);
    }
    public DeleteTemplateService templateName(String templateName) {
        return put("templateName", templateName);
    }

}
