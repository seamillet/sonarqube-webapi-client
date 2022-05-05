package com.geewaza.sonarqube.webapi.api.rules;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.rules.RuleRepositories;
import com.geewaza.sonarqube.webapi.model.rules.RuleResponse;

import java.io.IOException;

/**
 * List available rule repositories
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetRuleRepositoriesService extends AbstractService<GetRuleRepositoriesService, RuleRepositories> {
    public GetRuleRepositoriesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected RuleRepositories doExecute() throws IOException {
        return doGet("api/rules/repositories", RuleRepositories.class);
    }
    public GetRuleRepositoriesService language(String language) {
        return put("language", language);
    }
    public GetRuleRepositoriesService q(String q) {
        return put("q", q);
    }
}
