package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Rename a Quality Gate.
 * Requires the 'Administer Quality Gates' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class RenameQualityGatesService extends AbstractService<RenameQualityGatesService, Boolean> {
    public RenameQualityGatesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"id", "name"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualitygates/rename");
        return true;
    }

    public RenameQualityGatesService id(Long id) {
        return put("id", id);
    }

    public RenameQualityGatesService name(String name) {
        return put("name", name);
    }

    public RenameQualityGatesService organization(String organization) {
        return put("organization", organization);
    }

}
