package com.geewaza.sonarqube.webapi.api.updatecenter;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.Errors;

import java.io.IOException;

/**
 * Update a group.
 * Requires the following permission: 'Administer System'.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class UpdateService extends AbstractService<UpdateService, Errors> {
    public UpdateService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Errors doExecute() throws IOException {
        return doGet("api/updatecenter/upload", Errors.class);
    }

}
