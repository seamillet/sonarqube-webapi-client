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

    /**
     * Branch key. Not available in the community edition.
     * @param branch Example value:feature/my_branch
     * @return ShowComponentsService
     */
    public ShowComponentsService branch(String branch) {
        return put("branch", branch);
    }

    /**
     * Component key
     * @param component Example value:my_project
     * @return  ShowComponentsService
     */
    public ShowComponentsService component(String component) {
        return put("component", component);
    }

    /**
     * Pull request id. Not available in the community edition.
     * @param pullRequest Example value:5461
     * @return ShowComponentsService
     */
    public ShowComponentsService pullRequest(String pullRequest) {
        return put("pullRequest", pullRequest);
    }
}
