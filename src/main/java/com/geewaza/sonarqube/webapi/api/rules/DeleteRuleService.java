package com.geewaza.sonarqube.webapi.api.rules;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Delete custom rule.
 * Requires the 'Administer Quality Profiles' permission
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class DeleteRuleService extends AbstractService<DeleteRuleService, Boolean> {
    public DeleteRuleService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"key"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/rules/delete");
        return true;
    }
    public DeleteRuleService key(String key) {
        return put("key", key);
    }

}
