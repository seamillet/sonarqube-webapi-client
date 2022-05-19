package com.geewaza.sonarqube.webapi.api.components;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.component.ComponentTree;

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

    /**
     * Ascending sort
     * @param asc   Default value:true
     * @return GetComponentTreeService
     */
    public GetComponentTreeService asc(Boolean asc) {
        return put("asc", asc);
    }

    /**
     * Branch key. Not available in the community edition.
     * @param branch Example value:feature/my_branch
     * @return GetComponentTreeService
     */
    public GetComponentTreeService branch(String branch) {
        return put("branch", branch);
    }

    /**
     * Base component key. The search is based on this component.
     * @param component Example value:my_project
     * @return  GetComponentTreeService
     */
    public GetComponentTreeService component(String component) {
        return put("component", component);
    }

    /**
     * 1-based page number
     * @param p Default value:1
     * @return GetComponentTreeService
     */
    public GetComponentTreeService p(Integer p) {
        return put("p", p);
    }

    /**
     * Page size. Must be greater than 0 and less or equal than 500
     * @param ps    Default value:100
     * @return  GetComponentTreeService
     */
    public GetComponentTreeService ps(Integer ps) {
        return put("ps", ps);
    }

    /**
     * Pull request id. Not available in the community edition.
     * @param pullRequest Example value:5461
     * @return GetComponentTreeService
     */
    public GetComponentTreeService pullRequest(String pullRequest) {
        return put("pullRequest", pullRequest);
    }

    /**
     * Limit search to:
     * component names that contain the supplied string
     * component keys that are exactly the same as the supplied string
     * @param q Example value:FILE_NAM
     * @return  GetComponentTreeService
     */
    public GetComponentTreeService q(String q) {
        return put("q", q);
    }

    /**
     * Comma-separated list of component qualifiers. Filter the results with the specified qualifiers. Possible values are:
     * BRC - Sub-projects
     * UTS - Test Files
     * FIL - Files
     * DIR - Directories
     * TRK - Projects
     * @param qualifier
     * @return
     */
    public GetComponentTreeService qualifiers(String... qualifier) {
        return putCsvParam("qualifiers", qualifier);
    }

    /**
     * Comma-separated list of sort fields
     * @param s Default value:name
     * @return
     */
    public GetComponentTreeService s(String... s) {
        return putCsvParam("s", s);
    }

    /**
     * Strategy to search for base component descendants:
     * children: return the children components of the base component. Grandchildren components are not returned
     * all: return all the descendants components of the base component. Grandchildren are returned.
     * leaves: return all the descendant components (files, in general) which don't have other children. They are the leaves of the component tree.
     * @param strategy  Default value:all
     * @return  GetComponentTreeService
     */
    public GetComponentTreeService strategy(String strategy) {
        return put("strategy", strategy);
    }


}
