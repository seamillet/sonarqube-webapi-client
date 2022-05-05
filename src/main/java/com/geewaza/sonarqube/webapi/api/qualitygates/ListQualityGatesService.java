package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualitygates.QualityGateInfoList;
import com.geewaza.sonarqube.webapi.model.qualitygates.QualityGateResponse;

import java.io.IOException;

/**
 * Get a list of quality gates
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class ListQualityGatesService extends AbstractService<ListQualityGatesService, QualityGateInfoList> {
    public ListQualityGatesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected QualityGateInfoList doExecute() throws IOException {
        return doGet("api/qualitygates/list", QualityGateInfoList.class);
    }

    public ListQualityGatesService organization(String organization) {
        return put("organization", organization);
    }

}
