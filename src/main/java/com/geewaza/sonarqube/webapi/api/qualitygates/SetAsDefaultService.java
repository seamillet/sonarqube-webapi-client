package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Set a quality gate as the default quality gate.
 * Requires the 'Administer Quality Gates' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class SetAsDefaultService extends AbstractService<SetAsDefaultService, Boolean> {
    public SetAsDefaultService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"id"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualitygates/set_as_default");
        return true;
    }

    public SetAsDefaultService id(Long id) {
        return put("id", id);
    }

    public SetAsDefaultService organization(String organization) {
        return put("organization", organization);
    }

}
