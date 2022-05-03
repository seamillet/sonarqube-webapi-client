package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Issue;

import java.io.IOException;

/**
 * Add a comment.
 * Requires authentication and the following permission: 'Browse' on the project of the specified issue.
 *
 * @author : wangheng
 * @date : 2022-05-03 19:32
 **/
public class AddCommentService extends AbstractService<AddCommentService, Issue> {
    public AddCommentService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"issue", "text"};
    }

    @Override
    protected Issue doExecute() throws IOException {
        return doPost("api/issues/add_comment", Issue.class);
    }

    /**
     * Issue key
     * @param issue Issue key
     * @return
     */
    public AddCommentService issue(String issue) {
        return put("issue", issue);
    }

    /**
     * Comment text
     * @param text  Comment text
     * @return
     */
    public AddCommentService text(String text) {
        return put("text", text);
    }
}
