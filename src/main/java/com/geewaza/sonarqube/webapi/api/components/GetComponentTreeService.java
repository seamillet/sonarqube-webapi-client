package com.geewaza.sonarqube.webapi.api.components;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.component.ComponentTree;
import com.geewaza.sonarqube.webapi.model.component.Components;

import java.io.IOException;

/**
 * Navigate through components based on the chosen strategy. The componentId or the component parameter must be provided.
 * Requires the following permission: 'Browse' on the specified project.
 * When limiting search with the q parameter, directories are not returned.
 *
 * @author : wangheng
 * @date : 2022-05-03 18:51
 **/
public class GetComponentTreeService extends AbstractService<GetComponentTreeService, ComponentTree> {


    public GetComponentTreeService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected ComponentTree doExecute() throws IOException {
        return this.httpClient.get("api/components/tree", params, ComponentTree.class);
    }

    public GetComponentTreeService asc(Boolean asc) {
        return put("asc", asc);
    }

    public GetComponentTreeService component(String component) {
        return put("component", component);
    }

    public GetComponentTreeService p(Integer p) {
        return put("p", p);
    }

    public GetComponentTreeService ps(Integer ps) {
        return put("ps", ps);
    }

    public GetComponentTreeService q(String q) {
        return put("q", q);
    }
    public GetComponentTreeService qualifiers(String... qualifier) {
        return putCsvParam("qualifiers", qualifier);
    }
    public GetComponentTreeService s(String... s) {
        return putCsvParam("s", s);
    }
    public GetComponentTreeService strategy(String strategy) {
        return put("strategy", strategy);
    }


}
