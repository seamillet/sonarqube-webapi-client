package com.geewaza.sonarqube.webapi.api.components;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.component.ComponentResponse;

import java.io.IOException;

/**
 * Returns a component (file, directory, project, view…) and its ancestors. The ancestors are ordered from the parent to the root project. The 'componentId' or 'component' parameter must be provided.
 * Requires the following permission: 'Browse' on the project of the specified component.
 *
 * @author : wangheng
 * @date : 2022-05-03 18:51
 **/
public class ShowComponentsService extends AbstractService<ShowComponentsService, ComponentResponse> {


    public ShowComponentsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected ComponentResponse doExecute() throws IOException {
        return this.httpClient.get("api/components/show", params, ComponentResponse.class);
    }

    public ShowComponentsService component(String component) {
        return put("component", component);
    }
}
