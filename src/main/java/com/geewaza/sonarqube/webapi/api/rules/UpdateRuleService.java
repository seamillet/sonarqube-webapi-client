package com.geewaza.sonarqube.webapi.api.rules;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.rules.RuleResponse;

import java.io.IOException;

/**
 * Update an existing rule.
 * Requires the 'Administer Quality Profiles' permission
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class UpdateRuleService extends AbstractService<UpdateRuleService, RuleResponse> {
    public UpdateRuleService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"key"};
    }

    @Override
    protected RuleResponse doExecute() throws IOException {
        return doPost("api/rules/update", RuleResponse.class);
    }
    public UpdateRuleService key(String key) {
        return put("key", key);
    }
    public UpdateRuleService markdownDescription(String markdownDescription) {
        return put("markdown_description", markdownDescription);
    }
    public UpdateRuleService markdownNote(String markdownNote) {
        return put("markdown_note", markdownNote);
    }
    public UpdateRuleService name(String name) {
        return put("name", name);
    }
    public UpdateRuleService params(String params) {
        return put("params", params);
    }
    public UpdateRuleService remediationFnBaseEffort(String remediationFnBaseEffort) {
        return put("remediation_fn_base_effort", remediationFnBaseEffort);
    }
    public UpdateRuleService remediationFnType(String remediationFnType) {
        return put("remediation_fn_type", remediationFnType);
    }
    public UpdateRuleService remediationFyGapMultiplier(String remediationFyGapMultiplier) {
        return put("remediation_fy_gap_multiplier", remediationFyGapMultiplier);
    }
    public UpdateRuleService severity(String severity) {
        return put("severity", severity);
    }
    public UpdateRuleService status(String status) {
        return put("status", status);
    }
    public UpdateRuleService tags(String... tags) {
        return putCsvParam("tags", tags);
    }

}
