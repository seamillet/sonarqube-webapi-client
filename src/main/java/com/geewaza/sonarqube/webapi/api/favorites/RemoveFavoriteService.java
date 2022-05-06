package com.geewaza.sonarqube.webapi.api.favorites;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Remove a component (project, directory, file etc.) as favorite for the authenticated user.
 * Requires authentication.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:32
 **/
public class RemoveFavoriteService extends AbstractService<RemoveFavoriteService, Boolean> {
    public RemoveFavoriteService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"component"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/favorites/remove");
        return true;
    }

    public RemoveFavoriteService component(String component) {
        return put("component", component);
    }

}
