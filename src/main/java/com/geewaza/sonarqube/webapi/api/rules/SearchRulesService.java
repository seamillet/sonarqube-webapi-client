package com.geewaza.sonarqube.webapi.api.rules;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.rules.Rules;

import java.io.IOException;
import java.util.Date;

/**
 * Search for a collection of relevant rules matching a specified query.
 * Since 5.5, following fields in the response have been deprecated :
 * "effortToFixDescription" becomes "gapDescription"
 * "debtRemFnCoeff" becomes "remFnGapMultiplier"
 * "defaultDebtRemFnCoeff" becomes "defaultRemFnGapMultiplier"
 * "debtRemFnOffset" becomes "remFnBaseEffort"
 * "defaultDebtRemFnOffset" becomes "defaultRemFnBaseEffort"
 * "debtOverloaded" becomes "remFnOverloaded"
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class SearchRulesService extends AbstractService<SearchRulesService, Rules> {
    public SearchRulesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Rules doExecute() throws IOException {
        return doGet("api/rules/search", Rules.class);
    }
    public SearchRulesService activation(Boolean activation) {
        return put("activation", activation);
    }

    public SearchRulesService activeSeverities(String... activeSeverities) {
        return putCsvParam("active_severities", activeSeverities);
    }
    public SearchRulesService asc(Boolean asc) {
        return put("asc", asc);
    }
    public SearchRulesService availableSince(Date availableSince) {
        return put("available_since", availableSince);
    }
    public SearchRulesService cwe(String... cwe) {
        return putCsvParam("cwe", cwe);
    }
    public SearchRulesService f(String... f) {
        return putCsvParam("f", f);
    }
    public SearchRulesService facets(String... facets) {
        return putCsvParam("facets", facets);
    }
    public SearchRulesService includeExternal(Boolean includeExternal) {
        return put("include_external", includeExternal);
    }
    public SearchRulesService inheritance(String... inheritance) {
        return putCsvParam("inheritance", inheritance);
    }
    public SearchRulesService isTemplate(Boolean isTemplate) {
        return put("is_template", isTemplate);
    }
    public SearchRulesService languages(String... languages) {
        return putCsvParam("languages", languages);
    }
    public SearchRulesService owaspTop10(String... owaspTop10) {
        return putCsvParam("owaspTop10", owaspTop10);
    }
    public SearchRulesService p(Integer p) {
        return put("p", p);
    }
    public SearchRulesService ps(Integer ps) {
        return put("ps", ps);
    }
    public SearchRulesService q(String q) {
        return put("q", q);
    }
    public SearchRulesService qprofile(String qprofile) {
        return put("qprofile", qprofile);
    }
    public SearchRulesService repositories(String... repositories) {
        return putCsvParam("repositories", repositories);
    }
    public SearchRulesService ruleKey(String ruleKey) {
        return put("rule_key", ruleKey);
    }
    public SearchRulesService s(String s) {
        return put("s", s);
    }
    public SearchRulesService sansTop25(String... sansTop25) {
        return putCsvParam("sansTop25", sansTop25);
    }
    public SearchRulesService severities(String... severities) {
        return putCsvParam("severities", severities);
    }
    public SearchRulesService sonarsourceSecurity(String... sonarsourceSecurity) {
        return putCsvParam("sonarsourceSecurity", sonarsourceSecurity);
    }
    public SearchRulesService statuses(String... statuses) {
        return putCsvParam("statuses", statuses);
    }
    public SearchRulesService tags(String... tags) {
        return putCsvParam("tags", tags);
    }
    public SearchRulesService templateKey(String templateKey) {
        return put("template_key", templateKey);
    }
    public SearchRulesService types(String... types) {
        return putCsvParam("types", types);
    }
}
