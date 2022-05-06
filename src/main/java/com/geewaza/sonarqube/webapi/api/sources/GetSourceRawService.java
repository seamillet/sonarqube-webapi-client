package com.geewaza.sonarqube.webapi.api.sources;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Get source code as raw text. Require 'See Source Code' permission on file
 *
 * @author : wangheng
 * @date : 2022-05-05 11:48
 **/
public class GetSourceRawService extends AbstractService<GetSourceRawService, String> {
    public GetSourceRawService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"key"};
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/sources/raw");
    }

    public GetSourceRawService key(String key) {
        return put("key", key);
    }
}
