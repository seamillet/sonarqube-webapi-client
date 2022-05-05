package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Delete a Quality Gate.
 * Requires the 'Administer Quality Gates' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class DestroyService extends AbstractService<DestroyService, Boolean> {
    public DestroyService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"id"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualitygates/destroy");
        return true;
    }

    public DestroyService id(Long id) {
        return put("id", id);
    }

    public DestroyService organization(String organization) {
        return put("organization", organization);
    }

}
