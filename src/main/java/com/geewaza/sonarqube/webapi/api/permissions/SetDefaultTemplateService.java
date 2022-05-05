package com.geewaza.sonarqube.webapi.api.permissions;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.permissions.PermissionTemplateResponse;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:56
 **/
public class SetDefaultTemplateService extends AbstractService<SetDefaultTemplateService, Boolean> {
    public SetDefaultTemplateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"name"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/set_default_template");
        return true;
    }
    public SetDefaultTemplateService qualifier(String qualifier) {
        return put("qualifier", qualifier);
    }
    public SetDefaultTemplateService templateId(String templateId) {
        return put("templateId", templateId);
    }
    public SetDefaultTemplateService templateName(String templateName) {
        return put("templateName", templateName);
    }

}
