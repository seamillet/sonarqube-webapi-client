package com.geewaza.sonarqube.webapi.api.system;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.rules.RuleResponse;

import java.io.IOException;

/**
 * Temporarily changes level of logs. New level is not persistent and is lost when restarting server. Requires system administration permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class ChangeLogLevelService extends AbstractService<ChangeLogLevelService, Boolean> {
    public ChangeLogLevelService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"level"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/system/change_log_level");
        return true;
    }
    public ChangeLogLevelService level(String level) {
        return put("level", level);
    }

}
