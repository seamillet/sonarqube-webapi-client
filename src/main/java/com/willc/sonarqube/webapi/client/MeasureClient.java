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
     * Return specified metric for a given component (referenced by key).
     * 
     * @param componentKey The component key
     * @param metricKeys The metric key(s) - comma-separated list. Example: "complexity,violations"
     * @return the specified metric(s) value(s) in JSON format
     * @throws IOException
     */
    public String getComponentMeasuresByKey(String componentKey, String metricKeys) throws IOException {
        return this.httpClient.get(String.format("api/measures/component?componentKey=%s&metricKeys=%s", componentKey, metricKeys));
    }

    /**
     * Return specified metric for a given component (referenced by ID).
     *
     * @param componentId The component ID
     * @param metricKeys The metric key(s) - comma-separated list. Example: "complexity,violations"
     * @return the specified metric(s) value(s) in JSON format
     * @throws IOException
     */
    public String getComponentMeasuresById(String componentId, String metricKeys) throws IOException {
        return this.httpClient.get(String.format("api/measures/component?componentId=%s&metricKeys=%s", componentId, metricKeys));
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
