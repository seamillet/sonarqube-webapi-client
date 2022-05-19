package com.geewaza.sonarqube.webapi.api.measures;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.measure.ComponentMeasuresTree;

import java.io.IOException;

/**
 * Navigate through components based on the chosen strategy with specified measures. The baseComponentId or the component parameter must be provided.
 * Requires the following permission: 'Browse' on the specified project.
 * When limiting search with the q parameter, directories are not returned.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:52
 **/
public class GetComponentMeasuresTreeService extends AbstractService<GetComponentMeasuresTreeService, ComponentMeasuresTree> {
    public GetComponentMeasuresTreeService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"metricKeys"};
    }

    @Override
    protected ComponentMeasuresTree doExecute() throws IOException {
        return doGet("api/measures/component_tree", ComponentMeasuresTree.class);
    }

    public GetComponentMeasuresTreeService additionalFields(String... additionalFields) {
        return putCsvParam("additionalFields", additionalFields);
    }

    public GetComponentMeasuresTreeService asc(Boolean asc) {
        return put("asc", asc);
    }

    /**
     * Branch key. Not available in the community edition.
     *
     * @param branch    Example value:feature/my_branch
     * @return  GetComponentMeasuresService
     */
    public GetComponentMeasuresTreeService branch(String branch) {
        return put("branch", branch);
    }

    public GetComponentMeasuresTreeService component(String component) {
        return put("component", component);
    }

    public GetComponentMeasuresTreeService metricKeys(String... metricKeys) {
        return putCsvParam("metricKeys", metricKeys);
    }

    public GetComponentMeasuresTreeService metricPeriodSort(Integer metricPeriodSort) {
        return put("metricPeriodSort", metricPeriodSort);
    }

    public GetComponentMeasuresTreeService metricSort(String metricSort) {
        return put("metricSort", metricSort);
    }

    public GetComponentMeasuresTreeService metricSortFilter(String metricSortFilter) {
        return put("metricSortFilter", metricSortFilter);
    }

    public GetComponentMeasuresTreeService p(Integer p) {
        return put("p", p);
    }

    public GetComponentMeasuresTreeService ps(Integer ps) {
        return put("ps", ps);
    }

    /**
     * Pull request id. Not available in the community edition.
     * @param pullRequest   Example value:5461
     * @return  GetComponentMeasuresService
     */
    public GetComponentMeasuresTreeService pullRequest(String pullRequest) {
        return put("pullRequest", pullRequest);
    }


    public GetComponentMeasuresTreeService q(String q) {
        return put("q", q);
    }

    public GetComponentMeasuresTreeService qualifiers(String... qualifiers) {
        return putCsvParam("qualifiers", qualifiers);
    }
    public GetComponentMeasuresTreeService s(String... s) {
        return putCsvParam("s", s);
    }
    public GetComponentMeasuresTreeService strategy(String strategy) {
        return put("strategy", strategy);
    }


}