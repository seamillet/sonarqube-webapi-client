package com.geewaza.sonarqube.webapi.client.impl;


import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.MeasureClient;
import com.geewaza.sonarqube.webapi.model.measure.ComponentMeasures;
import com.geewaza.sonarqube.webapi.model.measure.ComponentMeasuresHistory;
import com.geewaza.sonarqube.webapi.model.measure.ComponentMeasuresTree;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class MeasureClientImpl extends AbstractSonarClient implements MeasureClient {


    public MeasureClientImpl(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Return component with specified measures. The componentId or the component parameter must be provided.
     * Requires the following permission: 'Browse' on the project of specified component.
     *
     * @param metricKeys       Comma-separated list of metric keys
     * @param component        Component key
     * @param additionalFields Comma-separated list of additional fields that can be returned in the response.
     * @return ComponentMeasures
     * @throws IOException IOException
     */
    @Override
    public ComponentMeasures getComponentMeasures(List<String> metricKeys, String component, List<String> additionalFields) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("metricKeys", buildCommaArray(metricKeys))
                .put("component", component).put("additionalFields", buildCommaArray(additionalFields)).build();
        return this.httpClient.get("api/measures/component", params, ComponentMeasures.class);
    }

    /**
     * Navigate through components based on the chosen strategy with specified measures. The baseComponentId or the component parameter must be provided.
     * Requires the following permission: 'Browse' on the specified project.
     * When limiting search with the q parameter, directories are not returned.
     *
     * @param metricKeys       Comma-separated list of metric keys. Types DISTRIB, DATA are not allowed.
     * @param additionalFields Comma-separated list of additional fields that can be returned in the response.
     * @param asc              Ascending sort
     * @param component        Component key. The search is based on this component.
     * @param metricPeriodSort Sort measures by leak period or not ?. The 's' parameter must contain the 'metricPeriod' value.
     * @param metricSort       Metric key to sort by. The 's' parameter must contain the 'metric' or 'metricPeriod' value. It must be part of the 'metricKeys' parameter
     * @param metricSortFilter Filter components. Sort must be on a metric. Possible values are:
     *                         - all: return all components
     *                         - withMeasuresOnly: filter out components that do not have a measure on the sorted metric
     * @param p                1-based page number
     * @param ps               Page size. Must be greater than 0 and less or equal than 500
     * @param q                Limit search to:
     *                         - component names that contain the supplied string
     *                         - component keys that are exactly the same as the supplied string
     * @param qualifiers       Comma-separated list of component qualifiers. Filter the results with the specified qualifiers. Possible values are:
     *                         - BRC - Sub-projects
     *                         - DIR - Directories
     *                         - FIL - Files
     *                         - TRK - Projects
     *                         - UTS - Test Files
     * @param s                Comma-separated list of sort fields
     * @param strategy         Strategy to search for base component descendants:
     *                         - children: return the children components of the base component. Grandchildren components are not returned
     *                         - all: return all the descendants components of the base component. Grandchildren are returned.
     *                         - leaves: return all the descendant components (files, in general) which don't have other children. They are the leaves of the component tree.
     * @return ComponentMeasuresTree
     * @throws IOException ComponentMeasuresTree
     */
    @Override
    public ComponentMeasuresTree getComponentMeasuresTree(List<String> metricKeys, List<String> additionalFields,
                                                          Boolean asc, String component, Integer metricPeriodSort,
                                                          String metricSort, String metricSortFilter, Integer p,
                                                          Integer ps, String q, String qualifiers, List<String> s,
                                                          String strategy) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("metricKeys", buildCommaArray(metricKeys))
                .put("component", component).put("additionalFields", buildCommaArray(additionalFields))
                .put("asc", asc).put("metricPeriodSort", metricPeriodSort).put("metricSort", metricSort)
                .put("metricSortFilter", metricSortFilter).put("p", p).put("ps", ps).put("q", q)
                .put("qualifiers", qualifiers).put("s", buildCommaArray(s)).put("strategy", strategy).build();
        return this.httpClient.get("api/measures/component_tree", params, ComponentMeasuresTree.class);
    }

    /**
     * Search measures history of a component.
     * Measures are ordered chronologically.
     * Pagination applies to the number of measures for each metric.
     * Requires the following permission: 'Browse' on the specified component
     *
     * @param component Component key
     * @param metrics   Comma-separated list of metric keys
     * @param from      Filter measures created after the given date (inclusive).
     *                  Either a date (server timezone) or datetime can be provided
     * @param to        Filter measures created before the given date (inclusive).
     *                  Either a date (server timezone) or datetime can be provided
     * @param p         1-based page number
     * @param ps        Page size. Must be greater than 0 and less or equal than 1000
     * @return ComponentMeasuresHistory
     * @throws IOException IOException
     */
    @Override
    public ComponentMeasuresHistory searchComponentMeasureHistory(String component, List<String> metrics, Date from, Date to, Integer p, Integer ps) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("component", component)
                .put("metrics", buildCommaArray(metrics)).put("from", from).put("to", to).put("p", p).put("ps", ps)
                .build();
        return this.httpClient.get("api/measures/search_history", params, ComponentMeasuresHistory.class);
    }
}
