package com.geewaza.sonarqube.webapi.api.sources;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Show source code with line oriented info. Requires See Source Code permission on file's project
 * Each element of the result array is an object which contains:
 * Line number
 * Content of the line
 * Author of the line (from SCM information)
 * Revision of the line (from SCM information)
 * Last commit date of the line (from SCM information)
 * Line hits from coverage
 * Number of conditions to cover in tests
 * Number of conditions covered by tests
 * Whether the line is new
 **/
public class GetSourceLinesService extends AbstractService<GetSourceLinesService, String> {
    public GetSourceLinesService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected String doExecute() throws IOException {
        return doGet("api/sources/lines");
    }

    /**
     * File key. Mandatory if param 'uuid' is not set. Available since 5.2
     *
     * @param key Example value: my_project:/src/foo/Bar.php
     * @return GetSourceLinesService
     */
    public GetSourceLinesService key(String key) {
        return put("key", key);
    }

    /**
     * Branch key
     *
     * @param branch Example value: feature/my_branch
     * @return GetSourceLinesService
     */
    public GetSourceLinesService branch(String branch) {
        return put("branch", branch);
    }

    /**
     * First line to return. Starts from 1
     *
     * @param from Default value: 1
     * @return GetSourceLinesService
     */
    public GetSourceLinesService from(Integer from) {
        return put("from", from);
    }

    /**
     * Optional last line to return (inclusive). It must be greater than or equal to parameter 'from'. If unset, then all the lines greater than or equal to 'from' are returned.
     *
     * @param to Example value: 20
     * @return GetSourceLinesService
     */
    public GetSourceLinesService to(Integer to) {
        return put("to", to);
    }

    /**
     * Pull request id
     *
     * @param pullRequest Example value: 5461
     * @return GetSourceLinesService
     */
    public GetSourceLinesService pullRequest(String pullRequest) {
        return put("pullRequest", pullRequest);
    }

    /**
     * File uuid. Mandatory if param 'key' is not set
     *
     * @param uuid Example value: f333aab4-7e3a-4d70-87e1-f4c491f05e5c
     * @return GetSourceLinesService
     */
    public GetSourceLinesService uuid(String uuid) {
        return put("uuid", uuid);
    }
}
