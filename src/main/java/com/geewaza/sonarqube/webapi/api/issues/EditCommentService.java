package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.Issue;

import java.io.IOException;

/**
 * Edit a comment.
 * Requires authentication and the following permission: 'Browse' on the project of the specified issue.
 *
 * @author : wangheng
 * @date : 2022-05-03 19:54
 **/
public class EditCommentService extends AbstractService<EditCommentService, Issue> {
    public EditCommentService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"comment", "text"};
    }

    @Override
    protected Issue doExecute() throws IOException {
        return doPost("api/issues/edit_comment", Issue.class);
    }

    public EditCommentService comment(String comment) {
        return put("comment", comment);
    }

    public EditCommentService text(String text) {
        return put("text", text);
    }
}
