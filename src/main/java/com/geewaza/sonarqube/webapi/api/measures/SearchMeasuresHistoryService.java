package com.geewaza.sonarqube.webapi.api.measures;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.measure.ComponentMeasuresHistory;

import java.io.IOException;
import java.util.Date;

/**
 * Search measures history of a component.
 * Measures are ordered chronologically.
 * Pagination applies to the number of measures for each metric.
 * Requires the following permission: 'Browse' on the specified component
 *
 * @author : wangheng
 * @date : 2022-05-03 22:52
 **/
public class SearchMeasuresHistoryService extends AbstractService<SearchMeasuresHistoryService, ComponentMeasuresHistory> {
    public SearchMeasuresHistoryService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"component", "metrics"};
    }

    @Override
    protected ComponentMeasuresHistory doExecute() throws IOException {
        return doGet("api/measures/search_history", ComponentMeasuresHistory.class);
    }

    public SearchMeasuresHistoryService component(String component) {
        return put("component", component);
    }

    public SearchMeasuresHistoryService from(Date from) {
        return put("from", from);
    }

    public SearchMeasuresHistoryService to(Date to) {
        return put("to", to);
    }

    public SearchMeasuresHistoryService metrics(String... metrics) {
        return putCsvParam("metrics", metrics);
    }

    public SearchMeasuresHistoryService p(Integer p) {
        return put("p", p);
    }

    public SearchMeasuresHistoryService ps(Integer ps) {
        return put("ps", ps);
    }

}