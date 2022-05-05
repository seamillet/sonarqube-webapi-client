package com.geewaza.sonarqube.webapi.api;

import com.geewaza.sonarqube.webapi.api.projectanalyses.*;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.impl.AbstractSonarClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:41
 **/
public class ProjectAnalysesClient extends AbstractSonarClient {
    public ProjectAnalysesClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public CreateEventService createEvent() {
        return new CreateEventService(this.httpClient);
    }

    public DeleteAnalysisService deleteAnalysis() {
        return new DeleteAnalysisService(this.httpClient);
    }
    public SearchAnalysisService searchAnalysis() {
        return new SearchAnalysisService(this.httpClient);
    }
    public SetBaselineService setBaseline() {
        return new SetBaselineService(this.httpClient);
    }
    public UnsetBaselineService unsetBaseline() {
        return new UnsetBaselineService(this.httpClient);
    }
    public UpdateEventService updateEvent() {
        return new UpdateEventService(this.httpClient);
    }

}
