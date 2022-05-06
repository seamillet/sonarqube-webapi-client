package com.geewaza.sonarqube.webapi.api.rules;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.rules.RuleResponse;

import java.io.IOException;

/**
 * Get and update some details of automatic rules, and manage custom rules.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class CreateRuleService extends AbstractService<CreateRuleService, RuleResponse> {
    public CreateRuleService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"custom_key", "markdown_description", "name"};
    }

    @Override
    protected RuleResponse doExecute() throws IOException {
        return doPost("api/rules/create", RuleResponse.class);
    }
    public CreateRuleService customKey(String customKey) {
        return put("custom_key", customKey);
    }
    public CreateRuleService markdownDescription(String markdownDescription) {
        return put("markdown_description", markdownDescription);
    }
    public CreateRuleService name(String name) {
        return put("name", name);
    }
    public CreateRuleService params(String params) {
        return put("params", params);
    }
    public CreateRuleService preventReactivation(Boolean preventReactivation) {
        return put("prevent_reactivation", preventReactivation);
    }
    public CreateRuleService severity(String severity) {
        return put("severity", severity);
    }
    public CreateRuleService status(String status) {
        return put("status", status);
    }
    public CreateRuleService templateKey(String templateKey) {
        return put("template_key", templateKey);
    }
    public CreateRuleService type(String type) {
        return put("type", type);
    }

}
