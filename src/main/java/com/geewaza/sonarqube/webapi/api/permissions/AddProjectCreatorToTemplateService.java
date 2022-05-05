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
public class AddProjectCreatorToTemplateService extends AbstractService<AddProjectCreatorToTemplateService, Boolean> {
    public AddProjectCreatorToTemplateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"permission"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/add_project_creator_to_template");
        return true;
    }
    public AddProjectCreatorToTemplateService permission(String permission) {
        return put("permission", permission);
    }
    public AddProjectCreatorToTemplateService templateId(String templateId) {
        return put("templateId", templateId);
    }
    public AddProjectCreatorToTemplateService templateName(String templateName) {
        return put("templateName", templateName);
    }
}
