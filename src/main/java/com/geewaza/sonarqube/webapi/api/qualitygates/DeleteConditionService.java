package com.geewaza.sonarqube.webapi.api.qualitygates;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualitygates.Condition;

import java.io.IOException;

/**
 * Add a new condition to a quality gate.
 * Requires the 'Administer Quality Gates' permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class DeleteConditionService extends AbstractService<DeleteConditionService, Boolean> {
    public DeleteConditionService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"id"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualitygates/delete_condition");
        return true;
    }

    public DeleteConditionService id(Long id) {
        return put("id", id);
    }

    public DeleteConditionService organization(String organization) {
        return put("organization", organization);
    }

}
