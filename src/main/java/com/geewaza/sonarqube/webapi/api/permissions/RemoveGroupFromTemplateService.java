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
public class RemoveGroupFromTemplateService extends AbstractService<RemoveGroupFromTemplateService, Boolean> {
    public RemoveGroupFromTemplateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"permission"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/remove_group_from_template");
        return true;
    }
    public RemoveGroupFromTemplateService groupId(String groupId) {
        return put("groupId", groupId);
    }
    public RemoveGroupFromTemplateService groupName(String groupName) {
        return put("groupName", groupName);
    }
    public RemoveGroupFromTemplateService permission(String permission) {
        return put("permission", permission);
    }
    public RemoveGroupFromTemplateService templateId(String templateId) {
        return put("templateId", templateId);
    }
    public RemoveGroupFromTemplateService templateName(String templateName) {
        return put("templateName", templateName);
    }
}
