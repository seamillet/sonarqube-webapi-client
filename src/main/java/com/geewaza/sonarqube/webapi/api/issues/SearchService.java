package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Issues;

import java.io.IOException;
import java.util.Date;

/**
 * Search for issues.
 * At most one of the following parameters can be provided at the same time: componentKeys and componentUuids.
 * Requires the 'Browse' permission on the specified project(s).
 *
 * @author : wangheng
 * @date : 2022-05-03 19:54
 **/
public class SearchService extends AbstractService<SearchService, Issues> {
    public SearchService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Issues doExecute() throws IOException {
        return doGet("api/issues/search", Issues.class);
    }

    public SearchService additionalFields(String... additionalFields) {
        return putCsvParam("additionalFields", additionalFields);
    }

    public SearchService asc(Boolean asc) {
        return put("asc", asc);
    }

    public SearchService assigned(Boolean assigned) {
        return put("assigned", assigned);
    }

    public SearchService assignees(String... assignees) {
        return putCsvParam("assignees", assignees);
    }

    public SearchService author(String author) {
        return put("author", author);
    }

    public SearchService componentKeys(String... componentKeys) {
        return putCsvParam("componentKeys", componentKeys);
    }

    public SearchService createdAfter(Date createdAfter) {
        return put("createdAfter", createdAfter);
    }

    public SearchService createdAt(Date createdAt) {
        return put("createdAt", createdAt);
    }

    public SearchService createdBefore(Date createdBefore) {
        return put("createdBefore", createdBefore);
    }

    public SearchService createdInLast(String createdInLast) {
        return put("createdInLast", createdInLast);
    }

    public SearchService cwe(String... cwe) {
        return putCsvParam("cwe", cwe);
    }

    public SearchService facets(String... facets) {
        return putCsvParam("facets", facets);
    }

    public SearchService issues(String... issues) {
        return putCsvParam("issues", issues);
    }

    public SearchService languages(String... languages) {
        return putCsvParam("languages", languages);
    }

    public SearchService onComponentOnly(Boolean onComponentOnly) {
        return put("onComponentOnly", onComponentOnly);
    }

    public SearchService owaspTop10(String... owaspTop10) {
        return putCsvParam("owaspTop10", owaspTop10);
    }

    public SearchService p(Integer p) {
        return put("p", p);
    }

    public SearchService ps(Integer ps) {
        return put("ps", ps);
    }

    public SearchService resolutions(String... resolutions) {
        return putCsvParam("resolutions", resolutions);
    }

    public SearchService resolved(Boolean resolved) {
        return put("resolved", resolved);
    }

    public SearchService rules(String... rules) {
        return putCsvParam("rules", rules);
    }

    public SearchService s(String s) {
        return put("s", s);
    }

    public SearchService sansTop25(String... sansTop25) {
        return putCsvParam("sansTop25", sansTop25);
    }

    public SearchService severities(String... severities) {
        return putCsvParam("severities", severities);
    }

    public SearchService sinceLeakPeriod(Boolean sinceLeakPeriod) {
        return put("sinceLeakPeriod", sinceLeakPeriod);
    }

    public SearchService sonarsourceSecurity(String... sonarsourceSecurity) {
        return putCsvParam("sonarsourceSecurity", sonarsourceSecurity);
    }

    public SearchService statuses(String... statuses) {
        return putCsvParam("statuses", statuses);
    }

    public SearchService tags(String... tags) {
        return putCsvParam("tags", tags);
    }

    public SearchService types(String... types) {
        return putCsvParam("types", types);
    }
}
