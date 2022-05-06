package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Issue;

import java.io.IOException;

/**
 * Do workflow transition on an issue. Requires authentication and Browse permission on project.
 * The transitions 'wontfix' and 'falsepositive' require the permission 'Administer Issues'.
 * The transitions involving security hotspots require the permission 'Administer Security Hotspot'.
 *
 * @author : wangheng
 * @date : 2022-05-03 19:54
 **/
public class DoTransitionService extends AbstractService<DoTransitionService, Issue> {
    public DoTransitionService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"issue", "transition"};
    }

    @Override
    protected Issue doExecute() throws IOException {
        return doPost("api/issues/do_transition", Issue.class);
    }

    public DoTransitionService issue(String issue) {
        return put("issue", issue);
    }

    public DoTransitionService transition(String transition) {
        return put("transition", transition);
    }
}
