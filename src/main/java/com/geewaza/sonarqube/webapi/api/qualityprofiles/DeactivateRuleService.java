package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Deactivate a rule on a quality profile.
 * Requires one of the following permissions:
 * 'Administer Quality Profiles'
 * Edit right on the specified quality profile
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class DeactivateRuleService extends AbstractService<DeactivateRuleService, Boolean> {
    public DeactivateRuleService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"key", "rule"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/qualityprofiles/deactivate_rule");
        return true;
    }

    public DeactivateRuleService key(String key) {
        return put("key", key);
    }
    public DeactivateRuleService rule(String rule) {
        return put("params", rule);
    }

}
