package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.sources.GetSourceLinesService;
import com.geewaza.sonarqube.webapi.api.sources.GetSourceRawService;
import com.geewaza.sonarqube.webapi.api.sources.GetSourceScmService;
import com.geewaza.sonarqube.webapi.api.sources.ShowSourceService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 09:22
 **/
public class SourcesClient extends AbstractSonarClient {
    public SourcesClient(BaseHttpClient httpClient) {
        super(httpClient);
    }
    public GetSourceRawService getSourceRaw() {
        return new GetSourceRawService(this.httpClient);
    }
    public GetSourceScmService getSourceScm() {
        return new GetSourceScmService(this.httpClient);
    }
    public ShowSourceService showSource() {
        return new ShowSourceService(this.httpClient);
    }
    public GetSourceLinesService getSourceLines() {
        return new GetSourceLinesService(this.httpClient);
    }
}
