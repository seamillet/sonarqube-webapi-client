package com.geewaza.sonarqube.webapi.api.ce;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.api.components.GetComponentTreeService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.ce.Tasks;

import java.io.IOException;
import java.util.Date;

/**
 * Search for tasks.
 * Requires the system administration permission, or project administration permission if componentId is set.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:27
 **/
public class GetActivityCeService extends AbstractService<GetActivityCeService, Tasks> {
    public GetActivityCeService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Tasks doExecute() throws IOException {
        return doGet("api/ce/activity", Tasks.class);
    }

    public GetActivityCeService componentId(String componentId) {
        return put("componentId", componentId);
    }

    public GetActivityCeService maxExecutedAt(Date maxExecutedAt) {
        return put("maxExecutedAt", maxExecutedAt);
    }

    public GetActivityCeService minSubmittedAt(Date minSubmittedAt) {
        return put("minSubmittedAt", minSubmittedAt);
    }

    public GetActivityCeService onlyCurrents(Boolean onlyCurrents) {
        return put("onlyCurrents", onlyCurrents);
    }

    public GetActivityCeService ps(Integer ps) {
        return put("ps", ps);
    }

    public GetActivityCeService q(String q) {
        return put("q", q);
    }

    public GetActivityCeService status(String... status) {
        return putCsvParam("status", status);
    }

    public GetActivityCeService type(String type) {
        return put("type", type);
    }
}

