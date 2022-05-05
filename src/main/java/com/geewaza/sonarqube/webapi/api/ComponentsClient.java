package com.geewaza.sonarqube.webapi.api;

import com.geewaza.sonarqube.webapi.api.components.GetComponentTreeService;
import com.geewaza.sonarqube.webapi.api.components.SearchComponentsService;
import com.geewaza.sonarqube.webapi.api.components.ShowComponentsService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.impl.AbstractSonarClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:31
 **/
public class ComponentsClient extends AbstractSonarClient {
    public ComponentsClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Search for components
     *
     * @return
     */
    public SearchComponentsService searchComponents() {
        return new SearchComponentsService(this.httpClient);
    }

    /**
     * Returns a component (file, directory, project, view…) and its ancestors. The ancestors are ordered from the parent to the root project. The 'componentId' or 'component' parameter must be provided.
     * Requires the following permission: 'Browse' on the project of the specified component.
     *
     * @return
     */
    public ShowComponentsService showComponents() {
        return new ShowComponentsService(this.httpClient);
    }

    /**
     * Navigate through components based on the chosen strategy. The componentId or the component parameter must be provided.
     * Requires the following permission: 'Browse' on the specified project.
     * When limiting search with the q parameter, directories are not returned.
     *
     * @return
     */
    public GetComponentTreeService getComponentTree() {
        return new GetComponentTreeService(this.httpClient);
    }
}
