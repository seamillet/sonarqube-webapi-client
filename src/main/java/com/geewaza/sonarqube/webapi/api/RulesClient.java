package com.geewaza.sonarqube.webapi.api;

import com.geewaza.sonarqube.webapi.api.rules.*;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.impl.AbstractSonarClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 23:16
 **/
public class RulesClient extends AbstractSonarClient {
    public RulesClient(BaseHttpClient httpClient) {
        super(httpClient);
    }


    public CreateRuleService createRule() {
        return new CreateRuleService(this.httpClient);
    }

    public DeleteRuleService deleteRule() {
        return new DeleteRuleService(this.httpClient);
    }

    public GetRuleRepositoriesService getRuleRepositories() {
        return new GetRuleRepositoriesService(this.httpClient);
    }

    public GetRuleTagsService getRuleTags() {
        return new GetRuleTagsService(this.httpClient);
    }
    public SearchRulesService searchRules() {
        return new SearchRulesService(this.httpClient);
    }
    public ShowRulesService showRules() {
        return new ShowRulesService(this.httpClient);
    }
    public UpdateRuleService updateRule() {
        return new UpdateRuleService(this.httpClient);
    }
}
