package com.willc.sonarqube.webapi.client;

import java.io.IOException;

/**
 * Created by chengkeqian on 2017/6/20.
 */
public class ComponentClient {
    private BaseHttpClient httpClient;

    public ComponentClient(BaseHttpClient baseHttpClient) {
        this.httpClient = baseHttpClient;
    }

    /**
     * Returns a component (file, directory, project, view…) and its ancestors.
     * The ancestors are ordered from the parent to the root project. The 'id' or 'key' must be provided.
     *
     * @param id Component id
     * @return
     * @throws IOException
     */
    public String getComponentById(String id) throws IOException {
        return this.httpClient.get(String.format("api/components/show?id=%s", id));
    }

    /**
     * Returns a component (file, directory, project, view…) and its ancestors.
     * The ancestors are ordered from the parent to the root project. The 'id' or 'key' must be provided.
     *
     * @param key Component key
     * @return
     * @throws IOException
     */
    public String getComponentByKey(String key) throws IOException {
        return this.httpClient.get(String.format("api/components/show?key=%s", key));
    }

    /**
     * Navigate through components based on the chosen strategy.
     * The baseComponentId or the baseComponentKey parameter must be provided.
     *
     * @param baseComponentId
     * @return
     */
    public String getComponentTree(String baseComponentId) throws IOException {
        return this.httpClient.get(String.format("api/components/trees?baseComponentId=%s", baseComponentId));
    }
}
