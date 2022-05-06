package com.geewaza.sonarqube.webapi.api.permissions;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.permissions.PermissionTemplateResponse;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:56
 **/
public class UpdateTemplateService extends AbstractService<UpdateTemplateService, PermissionTemplateResponse> {
    public UpdateTemplateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"id"};
    }

    @Override
    protected PermissionTemplateResponse doExecute() throws IOException {
        return doPost("api/permissions/update_template", PermissionTemplateResponse.class);
    }
    public UpdateTemplateService id(String id) {
        return put("id", id);
    }
    public UpdateTemplateService description(String description) {
        return put("description", description);
    }
    public UpdateTemplateService name(String name) {
        return put("name", name);
    }
    public UpdateTemplateService projectKeyPattern(String projectKeyPattern) {
        return put("projectKeyPattern", projectKeyPattern);
    }

}
