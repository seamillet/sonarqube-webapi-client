package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Activate a rule on a Quality Profile.
 * Requires one of the following permissions:
 * 'Administer Quality Profiles'
 * Edit right on the specified quality profile
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class ActivateRuleService extends AbstractService<ActivateRuleService, Boolean> {
    public ActivateRuleService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"key", "rule"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualityprofiles/activate_rule");
        return true;
    }

    public ActivateRuleService key(String key) {
        return put("key", key);
    }

    public ActivateRuleService params(String params) {
        return put("params", params);
    }
    public ActivateRuleService reset(Boolean reset) {
        return put("reset", reset);
    }

    public ActivateRuleService rule(String rule) {
        return put("params", rule);
    }

    public ActivateRuleService severity(String severity) {
        return put("severity", severity);
    }


}
