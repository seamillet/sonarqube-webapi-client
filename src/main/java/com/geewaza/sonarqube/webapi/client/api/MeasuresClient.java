package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.measures.GetComponentMeasuresTreeService;
import com.geewaza.sonarqube.webapi.api.measures.GetComponentService;
import com.geewaza.sonarqube.webapi.api.measures.SearchMeasuresHistoryService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 09:22
 **/
public class MeasuresClient extends AbstractSonarClient {
    public MeasuresClient(BaseHttpClient httpClient) {
        super(httpClient);
    }
    public GetComponentService getComponent() {
        return new GetComponentService(this.httpClient);
    }
    public GetComponentMeasuresTreeService getComponentMeasuresTree() {
        return new GetComponentMeasuresTreeService(this.httpClient);
    }
    public SearchMeasuresHistoryService searchMeasuresHistory() {
        return new SearchMeasuresHistoryService(this.httpClient);
    }
}
