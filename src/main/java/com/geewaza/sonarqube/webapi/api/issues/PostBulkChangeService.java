package com.geewaza.sonarqube.webapi.api.issues;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.issue.BulkChange;

import java.io.IOException;

/**
 * Bulk change on issues.
 * Requires authentication.
 *
 * @author : wangheng
 * @date : 2022-05-03 19:52
 **/
public class PostBulkChangeService extends AbstractService<PostBulkChangeService, BulkChange> {
    public PostBulkChangeService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"issues"};
    }

    @Override
    protected BulkChange doExecute() throws IOException {
        return doPost("api/issues/bulk_change", BulkChange.class);
    }

    public PostBulkChangeService addTags(String addTags) {
        return put("add_tags", addTags);
    }
    public PostBulkChangeService assign(String assign) {
        return put("assign", assign);
    }
    public PostBulkChangeService comment(String comment) {
        return put("comment", comment);
    }
    public PostBulkChangeService doTransition(String doTransition) {
        return put("do_transition", doTransition);
    }
    public PostBulkChangeService issues(String... issues) {
        return putCsvParam("issues", issues);
    }
    public PostBulkChangeService removeTags(String removeTags) {
        return put("remove_tags", removeTags);
    }
    public PostBulkChangeService sendNotifications(Boolean sendNotifications) {
        return put("sendNotifications", sendNotifications);
    }
    public PostBulkChangeService setSeverity(String setSeverity) {
        return put("set_severity", setSeverity);
    }
    public PostBulkChangeService setType(String setType) {
        return put("set_type", setType);
    }
}
