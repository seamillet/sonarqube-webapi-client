package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;
import java.util.Date;

/**
 * Bulk-activate rules on one quality profile.
 * Requires one of the following permissions:
 * 'Administer Quality Profiles'
 * Edit right on the specified quality profile
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class ActivateRulesService extends AbstractService<ActivateRulesService, Boolean> {
    public ActivateRulesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"targetKey"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualityprofiles/activate_rules");
        return true;
    }
    public ActivateRulesService activation(Boolean activation) {
        return put("activation", activation);
    }
    public ActivateRulesService activeSeverities(String activeSeverities) {
        return put("active_severities", activeSeverities);
    }
    public ActivateRulesService asc(Boolean asc) {
        return put("asc", asc);
    }
    public ActivateRulesService availableSince(Date availableSince) {
        return put("available_since", availableSince);
    }
    public ActivateRulesService cwe(String... cwe) {
        return putCsvParam("cwe", cwe);
    }
    public ActivateRulesService inheritance(String... inheritance) {
        return putCsvParam("inheritance", inheritance);
    }
    public ActivateRulesService isTemplate(Boolean isTemplate) {
        return put("is_template", isTemplate);
    }
    public ActivateRulesService owaspTop10(String... owaspTop10) {
        return putCsvParam("owaspTop10", owaspTop10);
    }
    public ActivateRulesService q(String q) {
        return put("q", q);
    }
    public ActivateRulesService qprofile(String qprofile) {
        return put("qprofile", qprofile);
    }
    public ActivateRulesService repositories(String... repositories) {
        return putCsvParam("repositories", repositories);
    }
    public ActivateRulesService ruleKey(String ruleKey) {
        return put("rule_key", ruleKey);
    }
    public ActivateRulesService s(String s) {
        return put("s", s);
    }
    public ActivateRulesService sansTop25(String... sansTop25) {
        return putCsvParam("sansTop25", sansTop25);
    }
    public ActivateRulesService severities(String... severities) {
        return putCsvParam("severities", severities);
    }
    public ActivateRulesService sonarsourceSecurity(String... sonarsourceSecurity) {
        return putCsvParam("sonarsourceSecurity", sonarsourceSecurity);
    }
    public ActivateRulesService statuses(String... statuses) {
        return putCsvParam("statuses", statuses);
    }
    public ActivateRulesService tags(String... tags) {
        return putCsvParam("tags", tags);
    }
    public ActivateRulesService targetKey(String targetKey) {
        return put("targetKey", targetKey);
    }
    public ActivateRulesService targetSeverity(String targetSeverity) {
        return put("targetSeverity", targetSeverity);
    }
    public ActivateRulesService templateKey(String templateKey) {
        return put("template_key", templateKey);
    }
    public ActivateRulesService types(String... types) {
        return putCsvParam("types", types);
    }

}
