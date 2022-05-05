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
public class AddGroupToTemplateService extends AbstractService<AddGroupToTemplateService, Boolean> {
    public AddGroupToTemplateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"permission"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/permissions/add_group_to_template");
        return true;
    }
    public AddGroupToTemplateService groupId(String groupId) {
        return put("groupId", groupId);
    }
    public AddGroupToTemplateService groupName(String groupName) {
        return put("groupName", groupName);
    }
    public AddGroupToTemplateService permission(String permission) {
        return put("permission", permission);
    }
    public AddGroupToTemplateService templateId(String templateId) {
        return put("templateId", templateId);
    }
    public AddGroupToTemplateService templateName(String templateName) {
        return put("templateName", templateName);
    }
}
