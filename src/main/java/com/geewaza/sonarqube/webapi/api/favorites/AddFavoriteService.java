package com.geewaza.sonarqube.webapi.api.favorites;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.io.IOException;

/**
 * Add a component (project, file etc.) as favorite for the authenticated user.
 * Only 100 components by qualifier can be added as favorite.
 * Requires authentication and the following permission: 'Browse' on the project of the specified component.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:32
 **/
public class AddFavoriteService extends AbstractService<AddFavoriteService, Boolean> {
    public AddFavoriteService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"component"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/favorites/add");
        return true;
    }

    public AddFavoriteService component(String component) {
        return put("component", component);
    }

}
