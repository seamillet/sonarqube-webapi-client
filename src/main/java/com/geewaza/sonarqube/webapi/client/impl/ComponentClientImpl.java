package com.geewaza.sonarqube.webapi.client.impl;


import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.ComponentClient;
import com.geewaza.sonarqube.webapi.model.component.ComponentShow;
import com.geewaza.sonarqube.webapi.model.component.ComponentTree;
import com.geewaza.sonarqube.webapi.model.component.Components;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class ComponentClientImpl extends AbstractSonarClient implements ComponentClient {

    public ComponentClientImpl(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Search for components
     *
     * @param language   Language key. If provided, only components for the given language are returned.
     * @param p          1-based page number
     * @param ps         Page size. Must be greater than 0 and less or equal than 500
     * @param q          Limit search to:
     *                   - component names that contain the supplied string
     *                   - component keys that are exactly the same as the supplied string
     * @param qualifiers Comma-separated list of component qualifiers. Filter the results with the specified qualifiers. Possible values are:
     *                   - BRC - Sub-projects
     *                   - DIR - Directories
     *                   - FIL - Files
     *                   - TRK - Projects
     *                   - UTS - Test Files
     * @return Components
     * @throws IOException IOException
     */
    @Override
    public Components searchComponents(String language, Integer p, Integer ps, String q, List<String> qualifiers) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("language", language)
                .put("p", p).put("ps", ps).put("q", q).put("qualifiers", buildCommaArray(qualifiers)).build();
        return this.httpClient.get("api/components/search", params, Components.class);
    }

    /**
     * Returns a component (file, directory, project, view…) and its ancestors. The ancestors are ordered from the parent to the root project. The 'componentId' or 'component' parameter must be provided.
     * Requires the following permission: 'Browse' on the project of the specified component.
     *
     * @param component Component key
     * @return ComponentShow
     * @throws IOException IOException
     */
    @Override
    public ComponentShow showComponent(String component) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("component", component).build();
        return this.httpClient.get("api/components/show", params, ComponentShow.class);
    }

    /**
     * Navigate through components based on the chosen strategy. The componentId or the component parameter must be provided.
     * Requires the following permission: 'Browse' on the specified project.
     * When limiting search with the q parameter, directories are not returned.
     *
     * @param asc        Ascending sort
     * @param component  Base component key. The search is based on this component.
     * @param p          1-based page number
     * @param ps         Page size. Must be greater than 0 and less or equal than 500
     * @param q          Limit search to:
     *                   - component names that contain the supplied string
     *                   - component keys that are exactly the same as the supplied string
     * @param qualifiers Comma-separated list of component qualifiers. Filter the results with the specified qualifiers. Possible values are:
     *                   - BRC - Sub-projects
     *                   - DIR - Directories
     *                   - FIL - Files
     *                   - TRK - Projects
     *                   - UTS - Test Files
     * @param s          Comma-separated list of sort fields. Example value:name, path
     * @param strategy   Strategy to search for base component descendants:
     *                   - children: return the children components of the base component. Grandchildren components are not returned
     *                   - all: return all the descendants components of the base component. Grandchildren are returned.
     *                   - leaves: return all the descendant components (files, in general) which don't have other children. They are the leaves of the component tree.
     * @return ComponentTree
     * @throws IOException IOException
     */
    @Override
    public ComponentTree getComponentTree(Boolean asc, String component, Integer p, Integer ps, String q, List<String> qualifiers, List<String> s, String strategy) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("asc", asc).put("component", component)
                .put("p", p).put("ps", ps).put("q", q).put("qualifiers", buildCommaArray(qualifiers))
                .put("s", buildCommaArray(s)).put("strategy", strategy).build();
        return this.httpClient.get("api/components/tree", params, ComponentTree.class);
    }
}
