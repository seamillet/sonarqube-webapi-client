package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;
import java.util.Date;

/**
 * Bulk deactivate rules on Quality profiles.
 * Requires one of the following permissions:
 * 'Administer Quality Profiles'
 * Edit right on the specified quality profile
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class DeactivateRulesService extends AbstractService<DeactivateRulesService, Boolean> {
    public DeactivateRulesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"targetKey"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualityprofiles/deactivate_rules");
        return true;
    }
    public DeactivateRulesService activation(Boolean activation) {
        return put("activation", activation);
    }
    public DeactivateRulesService activeSeverities(String activeSeverities) {
        return put("active_severities", activeSeverities);
    }
    public DeactivateRulesService asc(Boolean asc) {
        return put("asc", asc);
    }
    public DeactivateRulesService availableSince(Date availableSince) {
        return put("available_since", availableSince);
    }
    public DeactivateRulesService cwe(String... cwe) {
        return putCsvParam("cwe", cwe);
    }
    public DeactivateRulesService inheritance(String... inheritance) {
        return putCsvParam("inheritance", inheritance);
    }
    public DeactivateRulesService isTemplate(Boolean isTemplate) {
        return put("is_template", isTemplate);
    }
    public DeactivateRulesService languages(String... languages) {
        return putCsvParam("languages", languages);
    }
    public DeactivateRulesService owaspTop10(String... owaspTop10) {
        return putCsvParam("owaspTop10", owaspTop10);
    }
    public DeactivateRulesService q(String q) {
        return put("q", q);
    }
    public DeactivateRulesService qprofile(String qprofile) {
        return put("qprofile", qprofile);
    }
    public DeactivateRulesService repositories(String... repositories) {
        return putCsvParam("repositories", repositories);
    }
    public DeactivateRulesService ruleKey(String ruleKey) {
        return put("rule_key", ruleKey);
    }
    public DeactivateRulesService s(String s) {
        return put("s", s);
    }
    public DeactivateRulesService sansTop25(String... sansTop25) {
        return putCsvParam("sansTop25", sansTop25);
    }
    public DeactivateRulesService severities(String... severities) {
        return putCsvParam("severities", severities);
    }
    public DeactivateRulesService sonarsourceSecurity(String... sonarsourceSecurity) {
        return putCsvParam("sonarsourceSecurity", sonarsourceSecurity);
    }
    public DeactivateRulesService statuses(String... statuses) {
        return putCsvParam("statuses", statuses);
    }
    public DeactivateRulesService tags(String... tags) {
        return putCsvParam("tags", tags);
    }
    public DeactivateRulesService targetKey(String targetKey) {
        return put("targetKey", targetKey);
    }
    public DeactivateRulesService templateKey(String templateKey) {
        return put("template_key", templateKey);
    }
    public DeactivateRulesService types(String... types) {
        return putCsvParam("types", types);
    }

}
