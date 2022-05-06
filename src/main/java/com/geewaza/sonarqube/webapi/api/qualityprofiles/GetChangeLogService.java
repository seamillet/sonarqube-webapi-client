package com.geewaza.sonarqube.webapi.api.qualityprofiles;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.qualityprofiles.ChangeLog;

import java.io.IOException;
import java.util.Date;

/**
 * Get the history of changes on a quality profile: rule activation/deactivation, change in parameters/severity. Events are ordered by date in descending order (most recent first).
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class GetChangeLogService extends AbstractService<GetChangeLogService, ChangeLog> {
    public GetChangeLogService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[0];
    }

    @Override
    protected ChangeLog doExecute() throws IOException {
        return doGet("api/qualityprofiles/changelog", ChangeLog.class);
    }
    public GetChangeLogService language(String language) {
        return put("language", language);
    }
    public GetChangeLogService p(Integer p) {
        return put("p", p);
    }
    public GetChangeLogService ps(Integer ps) {
        return put("ps", ps);
    }
    public GetChangeLogService qualityProfile(String qualityProfile) {
        return put("qualityProfile", qualityProfile);
    }
    public GetChangeLogService since(Date since) {
        return put("since", since);
    }
    public GetChangeLogService to(Date to) {
        return put("to", to);
    }


}
