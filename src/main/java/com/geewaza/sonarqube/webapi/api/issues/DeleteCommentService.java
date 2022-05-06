package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Issue;

import java.io.IOException;

/**
 * Delete a comment.
 * Requires authentication and the following permission: 'Browse' on the project of the specified issue.
 *
 * @author : wangheng
 * @date : 2022-05-03 19:53
 **/
public class DeleteCommentService extends AbstractService<DeleteCommentService, Issue> {
    public DeleteCommentService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"comment"};
    }

    @Override
    protected Issue doExecute() throws IOException {
        return doPost("api/issues/delete_comment", Issue.class);
    }

    /**
     * Comment key
     *
     * @param comment   Comment key
     * @return
     */
    public DeleteCommentService comment(String comment) {
        return put("comment", comment);
    }
}
