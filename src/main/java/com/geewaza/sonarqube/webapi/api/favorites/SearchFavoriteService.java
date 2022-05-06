package com.geewaza.sonarqube.webapi.api.favorites;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;
import com.geewaza.sonarqube.webapi.model.favorite.Favorites;

import java.io.IOException;

/**
 * Search for the authenticated user favorites.
 * Requires authentication.
 *
 * @author : wangheng
 * @date : 2022-05-03 22:32
 **/
public class SearchFavoriteService extends AbstractService<SearchFavoriteService, Favorites> {
    public SearchFavoriteService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[] {"component"};
    }

    @Override
    protected Favorites doExecute() throws IOException {
        return doGet("api/favorites/search", Favorites.class);
    }

    public SearchFavoriteService p(Integer p) {
        return put("p", p);
    }
    public SearchFavoriteService ps(Integer ps) {
        return put("ps", ps);
    }

}
