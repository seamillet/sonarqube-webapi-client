package com.geewaza.sonarqube.webapi.api.rules;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Tags;
import com.geewaza.sonarqube.webapi.model.rules.RuleResponse;

import java.io.IOException;

/**
 * List rule tags
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetRuleTagsService extends AbstractService<GetRuleTagsService, Tags> {
    public GetRuleTagsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected Tags doExecute() throws IOException {
        return doGet("api/rules/tags", Tags.class);
    }
    public GetRuleTagsService ps(Integer ps) {
        return put("ps", ps);
    }

    public GetRuleTagsService q(String q) {
        return put("q", q);
    }
}
