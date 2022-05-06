package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.qualitygates.*;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 *
 * @author : wangheng
 * @date : 2022-05-05 11:53
 **/
public class QualityGatesClient extends AbstractSonarClient {

    public QualityGatesClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public CopyQualityGatesService copyQualityGates() {
        return new CopyQualityGatesService(this.httpClient);
    }

    public CreateConditionService createCondition() {
        return new CreateConditionService(this.httpClient);
    }

    public CreateQualityGatesService createQualityGates() {
        return new CreateQualityGatesService(this.httpClient);
    }

    public DeleteConditionService deleteCondition() {
        return new DeleteConditionService(this.httpClient);
    }

    public DeselectService deselect() {
        return new DeselectService(this.httpClient);
    }

    public DestroyService destroy() {
        return new DestroyService(this.httpClient);
    }
    public GetByProjectService getByProject() {
        return new GetByProjectService(this.httpClient);
    }
    public GetProjectStatusService getProjectStatus() {
        return new GetProjectStatusService(this.httpClient);
    }
    public ListQualityGatesService listQualityGates() {
        return new ListQualityGatesService(this.httpClient);
    }
    public RenameQualityGatesService renameQualityGates() {
        return new RenameQualityGatesService(this.httpClient);
    }
    public SearchQualityGatesService searchQualityGates() {
        return new SearchQualityGatesService(this.httpClient);
    }
    public SelectService select() {
        return new SelectService(this.httpClient);
    }
    public SetAsDefaultService setAsDefault() {
        return new SetAsDefaultService(this.httpClient);
    }
    public ShowConditionService showCondition() {
        return new ShowConditionService(this.httpClient);
    }
    public UpdateConditionService updateCondition() {
        return new UpdateConditionService(this.httpClient);
    }
}
