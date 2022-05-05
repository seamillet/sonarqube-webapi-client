package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualitygates.QualityGateInfoList;
import com.geewaza.sonarqube.webapi.model.qualitygates.QualityGates;

import java.io.IOException;

/**
 * Search for projects associated (or not) to a quality gate.
 * Only authorized projects for current user will be returned.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class SearchQualityGatesService extends AbstractService<SearchQualityGatesService, QualityGates> {
    public SearchQualityGatesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"gateId"};
    }

    @Override
    protected QualityGates doExecute() throws IOException {
        return doGet("api/qualitygates/search", QualityGates.class);
    }
    public SearchQualityGatesService gateId(Long gateId) {
        return put("gateId", gateId);
    }

    public SearchQualityGatesService organization(String organization) {
        return put("organization", organization);
    }

    public SearchQualityGatesService page(Integer page) {
        return put("page", page);
    }

    public SearchQualityGatesService pageSize(Integer pageSize) {
        return put("pageSize", pageSize);
    }

    public SearchQualityGatesService query(String query) {
        return put("query", query);
    }

    public SearchQualityGatesService selected(String selected) {
        return put("selected", selected);
    }

}
