package com.geewaza.sonarqube.webapi.api.rules;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.rules.RuleResponse;
import com.geewaza.sonarqube.webapi.model.rules.Rules;

import java.io.IOException;
import java.util.Date;

/**
 * Get detailed information about a rule
 * Since 5.5, following fields in the response have been deprecated :
 * "effortToFixDescription" becomes "gapDescription"
 * "debtRemFnCoeff" becomes "remFnGapMultiplier"
 * "defaultDebtRemFnCoeff" becomes "defaultRemFnGapMultiplier"
 * "debtRemFnOffset" becomes "remFnBaseEffort"
 * "defaultDebtRemFnOffset" becomes "defaultRemFnBaseEffort"
 * "debtOverloaded" becomes "remFnOverloaded"
 * In 7.1, the field 'scope' has been added.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class ShowRulesService extends AbstractService<ShowRulesService, RuleResponse> {
    public ShowRulesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"key"};
    }

    @Override
    protected RuleResponse doExecute() throws IOException {
        return doGet("api/rules/show", RuleResponse.class);
    }
    public ShowRulesService actives(Boolean actives) {
        return put("actives", actives);
    }

    public ShowRulesService key(String key) {
        return put("key", key);
    }
}
