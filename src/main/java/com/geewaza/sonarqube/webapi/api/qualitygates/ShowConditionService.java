package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualitygates.Condition;
import com.geewaza.sonarqube.webapi.model.qualitygates.QualityGateInfo;

import java.io.IOException;

/**
 * Display the details of a quality gate
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class ShowConditionService extends AbstractService<ShowConditionService, QualityGateInfo> {
    public ShowConditionService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected QualityGateInfo doExecute() throws IOException {
        return doGet("api/qualitygates/show", QualityGateInfo.class);
    }

    public ShowConditionService id(Long id) {
        return put("id", id);
    }

    public ShowConditionService name(String name) {
        return put("name", name);
    }

    public ShowConditionService organization(String organization) {
        return put("organization", organization);
    }

}
