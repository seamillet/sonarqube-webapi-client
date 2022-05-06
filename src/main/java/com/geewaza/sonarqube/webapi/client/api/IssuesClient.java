package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.issues.*;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 19:31
 **/
public class IssuesClient extends AbstractSonarClient {

    public IssuesClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public AddCommentService addComment() {
        return new AddCommentService(this.httpClient);
    }

    public DeleteCommentService deleteComment() {
        return new DeleteCommentService(this.httpClient);
    }

    public DoTransitionService doTransition() {
        return new DoTransitionService(this.httpClient);
    }

    public EditCommentService editComment() {
        return new EditCommentService(this.httpClient);
    }

    public GetAuthorsService getAuthors() {
        return new GetAuthorsService(this.httpClient);
    }

    public GetChangelogService getChangelog() {
        return new GetChangelogService(this.httpClient);
    }

    public GetTagsService getTags() {
        return new GetTagsService(this.httpClient);
    }

    public PostAssignService postAssign() {
        return new PostAssignService(this.httpClient);
    }

    public PostBulkChangeService postBulkChange() {
        return new PostBulkChangeService(this.httpClient);
    }

    public SearchService search() {
        return new SearchService(this.httpClient);
    }

    public SetSeverityService setSeverity() {
        return new SetSeverityService(this.httpClient);
    }

    public SetTagsService setTags() {
        return new SetTagsService(this.httpClient);
    }

    public SetTypeService setType() {
        return new SetTypeService(this.httpClient);
    }
}
