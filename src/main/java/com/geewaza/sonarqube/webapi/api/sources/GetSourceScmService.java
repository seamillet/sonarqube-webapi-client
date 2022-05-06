package com.geewaza.sonarqube.webapi.api.sources;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.system.Scm;

import java.io.IOException;

/**
 * Get SCM information of source files. Require See Source Code permission on file's project
 * Each element of the result array is composed of:
 * Line number
 * Author of the commit
 * Datetime of the commit (before 5.2 it was only the Date)
 * Revision of the commit (added in 5.2)
 *
 * @author : wangheng
 * @date : 2022-05-05 11:48
 **/
public class GetSourceScmService extends AbstractService<GetSourceScmService, Scm> {
    public GetSourceScmService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"key"};
    }

    @Override
    protected Scm doExecute() throws IOException {
        return doGet("api/sources/scm", Scm.class);
    }

    public GetSourceScmService commitsByLine(Boolean commitsByLine) {
        return put("commits_by_line", commitsByLine);
    }

    public GetSourceScmService from(Integer from) {
        return put("from", from);
    }

    public GetSourceScmService to(Integer to) {
        return put("to", to);
    }

    public GetSourceScmService key(String key) {
        return put("key", key);
    }
}
