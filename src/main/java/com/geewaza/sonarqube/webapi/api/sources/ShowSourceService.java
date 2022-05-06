package com.geewaza.sonarqube.webapi.api.sources;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.Scm;

import java.io.IOException;

/**
 * Get source code. Requires See Source Code permission on file's project
 * Each element of the result array is composed of:
 * Line number
 * Content of the line
 *
 * @author : wangheng
 * @date : 2022-05-05 11:48
 **/
public class ShowSourceService extends AbstractService<ShowSourceService, Scm> {
    public ShowSourceService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"key"};
    }

    @Override
    protected Scm doExecute() throws IOException {
        return doGet("api/sources/show", Scm.class);
    }

    public ShowSourceService from(Integer from) {
        return put("from", from);
    }

    public ShowSourceService to(Integer to) {
        return put("to", to);
    }

    public ShowSourceService key(String key) {
        return put("key", key);
    }
}
