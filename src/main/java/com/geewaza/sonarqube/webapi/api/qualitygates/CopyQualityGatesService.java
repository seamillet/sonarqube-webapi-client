package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.api.components.GetComponentTreeService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Copy a Quality Gate.
 * Requires the 'Administer Quality Gates' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class CopyQualityGatesService extends AbstractService<CopyQualityGatesService, Boolean> {
    public CopyQualityGatesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"id", "name"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualitygates/copy");
        return true;
    }

    public CopyQualityGatesService id(Long id) {
        return put("id", id);
    }

    public CopyQualityGatesService name(String name) {
        return put("name", name);
    }

    public CopyQualityGatesService organization(String organization) {
        return put("organization", organization);
    }

}
