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
public class RemoveUserFromTemplateService extends AbstractService<RemoveUserFromTemplateService, Boolean> {
    public RemoveUserFromTemplateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"login", "permission"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/remove_user_from_template");
        return true;
    }
    public RemoveUserFromTemplateService login(String login) {
        return put("login", login);
    }
    public RemoveUserFromTemplateService permission(String permission) {
        return put("permission", permission);
    }
    public RemoveUserFromTemplateService templateId(String templateId) {
        return put("templateId", templateId);
    }
    public RemoveUserFromTemplateService templateName(String templateName) {
        return put("templateName", templateName);
    }
}
