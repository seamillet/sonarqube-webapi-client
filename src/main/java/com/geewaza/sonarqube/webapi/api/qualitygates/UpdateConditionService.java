package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Update a condition attached to a quality gate.
 * Requires the 'Administer Quality Gates' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class UpdateConditionService extends AbstractService<UpdateConditionService, Boolean> {
    public UpdateConditionService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"id", "error", "metric"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualitygates/update_condition");
        return true;
    }

    public UpdateConditionService id(Long id) {
        return put("id", id);
    }

    public UpdateConditionService error(Integer error) {
        return put("error", error);
    }

    public UpdateConditionService metric(String metric) {
        return put("metric", metric);
    }

    public UpdateConditionService op(String op) {
        return put("op", op);
    }

    public UpdateConditionService organization(String organization) {
        return put("organization", organization);
    }

}
