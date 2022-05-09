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
public class SearchIssuesService extends AbstractService<SearchIssuesService, Issues> {
    public SearchIssuesService(BaseHttpClient httpClient) {
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

    public SearchIssuesService additionalFields(String... additionalFields) {
        return putCsvParam("additionalFields", additionalFields);
    }

    public SearchIssuesService asc(Boolean asc) {
        return put("asc", asc);
    }

    public SearchIssuesService assigned(Boolean assigned) {
        return put("assigned", assigned);
    }

    public SearchIssuesService assignees(String... assignees) {
        return putCsvParam("assignees", assignees);
    }

    public SearchIssuesService author(String author) {
        return put("author", author);
    }

    public SearchIssuesService componentKeys(String... componentKeys) {
        return putCsvParam("componentKeys", componentKeys);
    }

    public SearchIssuesService createdAfter(Date createdAfter) {
        return put("createdAfter", createdAfter);
    }

    public SearchIssuesService createdAt(Date createdAt) {
        return put("createdAt", createdAt);
    }

    public SearchIssuesService createdBefore(Date createdBefore) {
        return put("createdBefore", createdBefore);
    }

    public SearchIssuesService createdInLast(String createdInLast) {
        return put("createdInLast", createdInLast);
    }

    public SearchIssuesService cwe(String... cwe) {
        return putCsvParam("cwe", cwe);
    }

    public SearchIssuesService facets(String... facets) {
        return putCsvParam("facets", facets);
    }

    public SearchIssuesService issues(String... issues) {
        return putCsvParam("issues", issues);
    }

    public SearchIssuesService languages(String... languages) {
        return putCsvParam("languages", languages);
    }

    public SearchIssuesService onComponentOnly(Boolean onComponentOnly) {
        return put("onComponentOnly", onComponentOnly);
    }

    public SearchIssuesService owaspTop10(String... owaspTop10) {
        return putCsvParam("owaspTop10", owaspTop10);
    }

    public SearchIssuesService p(Integer p) {
        return put("p", p);
    }

    public SearchIssuesService ps(Integer ps) {
        return put("ps", ps);
    }

    public SearchIssuesService resolutions(String... resolutions) {
        return putCsvParam("resolutions", resolutions);
    }

    public SearchIssuesService resolved(Boolean resolved) {
        return put("resolved", resolved);
    }

    public SearchIssuesService rules(String... rules) {
        return putCsvParam("rules", rules);
    }

    public SearchIssuesService s(String s) {
        return put("s", s);
    }

    public SearchIssuesService sansTop25(String... sansTop25) {
        return putCsvParam("sansTop25", sansTop25);
    }

    public SearchIssuesService severities(String... severities) {
        return putCsvParam("severities", severities);
    }

    public SearchIssuesService sinceLeakPeriod(Boolean sinceLeakPeriod) {
        return put("sinceLeakPeriod", sinceLeakPeriod);
    }

    public SearchIssuesService sonarsourceSecurity(String... sonarsourceSecurity) {
        return putCsvParam("sonarsourceSecurity", sonarsourceSecurity);
    }

    public SearchIssuesService statuses(String... statuses) {
        return putCsvParam("statuses", statuses);
    }

    public SearchIssuesService tags(String... tags) {
        return putCsvParam("tags", tags);
    }

    public SearchIssuesService types(String... types) {
        return putCsvParam("types", types);
    }
}
