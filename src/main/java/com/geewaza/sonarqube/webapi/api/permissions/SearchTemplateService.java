package com.geewaza.sonarqube.webapi.api.permissions;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.permissions.PermissionTemplates;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:56
 **/
public class SearchTemplateService extends AbstractService<SearchTemplateService, PermissionTemplates> {
    public SearchTemplateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected PermissionTemplates doExecute() throws IOException {
        return doGet("api/permissions/search_templates", PermissionTemplates.class);
    }

    public SearchTemplateService q(String q) {
        return put("q", q);
    }

}
