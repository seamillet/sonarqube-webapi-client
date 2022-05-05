package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualitygates.Condition;
import com.geewaza.sonarqube.webapi.model.qualitygates.QualityGate;

import java.io.IOException;

/**
 * Add a new condition to a quality gate.
 * Requires the 'Administer Quality Gates' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class CreateConditionService extends AbstractService<CreateConditionService, Condition> {
    public CreateConditionService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"error", "gateId", "metric"};
    }

    @Override
    protected Condition doExecute() throws IOException {
        return doPost("api/qualitygates/create_condition", Condition.class);
    }

    public CreateConditionService error(Integer error) {
        return put("error", error);
    }

    public CreateConditionService gateId(Long gateId) {
        return put("gateId", gateId);
    }

    public CreateConditionService metric(String metric) {
        return put("metric", metric);
    }

    public CreateConditionService op(String op) {
        return put("op", op);
    }

    public CreateConditionService organization(String organization) {
        return put("organization", organization);
    }

}
