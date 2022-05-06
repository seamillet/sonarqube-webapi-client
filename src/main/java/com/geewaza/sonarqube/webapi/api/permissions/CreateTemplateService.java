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
public class CreateTemplateService extends AbstractService<CreateTemplateService, PermissionTemplateResponse> {
    public CreateTemplateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"name"};
    }

    @Override
    protected PermissionTemplateResponse doExecute() throws IOException {
        return doPost("api/permissions/create_template", PermissionTemplateResponse.class);
    }
    public CreateTemplateService description(String description) {
        return put("description", description);
    }
    public CreateTemplateService name(String name) {
        return put("name", name);
    }
    public CreateTemplateService projectKeyPattern(String projectKeyPattern) {
        return put("projectKeyPattern", projectKeyPattern);
    }

}
