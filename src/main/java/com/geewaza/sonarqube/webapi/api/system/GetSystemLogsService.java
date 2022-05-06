package com.geewaza.sonarqube.webapi.api.system;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.NodeHealth;

import java.io.IOException;

/**
 * Get system logs in plain-text format. Requires system administration permission.
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetSystemLogsService extends AbstractService<GetSystemLogsService, String> {
    public GetSystemLogsService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/system/logs", String.class);
    }

    public GetSystemLogsService process(String process) {
        return put("process", process);
    }
}
