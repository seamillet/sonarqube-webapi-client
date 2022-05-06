package com.geewaza.sonarqube.webapi.api.permissions;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:56
 **/
public class AddUserToTemplateService extends AbstractService<AddUserToTemplateService, Boolean> {
    public AddUserToTemplateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"login", "permission"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/add_user_to_template");
        return true;
    }
    public AddUserToTemplateService login(String login) {
        return put("login", login);
    }
    public AddUserToTemplateService permission(String permission) {
        return put("permission", permission);
    }
    public AddUserToTemplateService templateId(String templateId) {
        return put("templateId", templateId);
    }
    public AddUserToTemplateService templateName(String templateName) {
        return put("templateName", templateName);
    }
}
