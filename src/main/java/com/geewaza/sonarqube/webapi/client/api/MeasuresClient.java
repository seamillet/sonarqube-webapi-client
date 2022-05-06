package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.measures.GetComponentMeasuresTreeService;
import com.geewaza.sonarqube.webapi.api.measures.GetComponentMeasuresService;
import com.geewaza.sonarqube.webapi.api.measures.SearchMeasuresHistoryService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

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
    public GetComponentMeasuresService getComponentMeasures() {
        return new GetComponentMeasuresService(this.httpClient);
    }
    public GetComponentMeasuresTreeService getComponentMeasuresTree() {
        return new GetComponentMeasuresTreeService(this.httpClient);
    }
    public SearchMeasuresHistoryService searchMeasuresHistory() {
        return new SearchMeasuresHistoryService(this.httpClient);
    }
}
