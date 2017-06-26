package com.willc.sonarqube.webapi.client;

import java.io.IOException;

/**
 * Created by chengkeqian on 2017/6/20.
 */
public class MeasureClient {
    private BaseHttpClient httpClient;

    public MeasureClient(BaseHttpClient baseHttpClient) {
        this.httpClient = baseHttpClient;
    }

    /**
     * Return component with specified measures. The componentId or the componentKey parameter must be provided.
     *
     * @return
     * @throws IOException
     */
    public String getComponentMeasures(String componentId) throws IOException {
        return this.httpClient.get(String.format("api/measures/component?componentId=%s&metricKeys=ncloc,complexity,violations", componentId));
    }

    /**
     * Navigate through components based on the chosen strategy with specified measures.
     * The baseComponentId or the baseComponentKey parameter must be provided.
     *
     * @return
     * @throws IOException
     */
    public String getComponentMeasuresTree(String baseComponentId) throws IOException {
        return this.httpClient.get(String.format("api/measures/component_tree?baseComponentId=%s&metricKeys=ncloc,complexity,violations", baseComponentId));
    }

}
