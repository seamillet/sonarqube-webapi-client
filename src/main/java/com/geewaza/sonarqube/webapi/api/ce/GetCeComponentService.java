package com.geewaza.sonarqube.webapi.api.ce;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.ce.CeComponent;
import com.geewaza.sonarqube.webapi.model.ce.TaskStatus;

import java.io.IOException;

/**
 * Get the pending tasks, in-progress tasks and the last executed task of a given component (usually a project).
 * Requires the following permission: 'Browse' on the specified component.
 * Either 'componentId' or 'component' must be provided.
 *
 * @author : wangheng
 * @date : 2022-05-05 11:27
 **/
public class GetCeComponentService extends AbstractService<GetCeComponentService, CeComponent> {
    public GetCeComponentService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected CeComponent doExecute() throws IOException {
        return doGet("api/ce/component", CeComponent.class);
    }

    public GetCeComponentService component(String component) {
        return put("component", component);
    }

}

