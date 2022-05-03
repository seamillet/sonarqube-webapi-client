package com.geewaza.sonarqube.webapi.client.impl;

import com.alibaba.fastjson.JSONObject;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.FavoritesClient;
import com.geewaza.sonarqube.webapi.model.duplication.Duplications;
import com.geewaza.sonarqube.webapi.model.favorite.Favorites;

import java.io.IOException;
import java.util.Map;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 17:36
 **/
public class FavoritesClientImpl extends AbstractSonarClient implements FavoritesClient {
    public FavoritesClientImpl(BaseHttpClient httpClient) {
        super(httpClient);
    }

    /**
     * Add a component (project, file etc.) as favorite for the authenticated user.
     * Only 100 components by qualifier can be added as favorite.
     * Requires authentication and the following permission: 'Browse' on the project of the specified component.
     *
     * @param component Component key. Only components with qualifiers TRK, VW, SVW, APP, FIL, UTS are supported
     * @return Success or not
     * @throws IOException IOException
     */
    @Override
    public Boolean addFavorite(String component) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("component", component).build();
        this.httpClient.post("api/favorites/add", null, JSONObject.toJSONString(params));
        return true;
    }

    /**
     * Remove a component (project, directory, file etc.) as favorite for the authenticated user.
     * Requires authentication.
     *
     * @param component Component key
     * @return Success or not
     * @throws IOException IOException
     */
    @Override
    public Boolean removeFavorite(String component) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("component", component).build();
        this.httpClient.post("api/favorites/remove", null, JSONObject.toJSONString(params));
        return true;
    }

    /**
     * Search for the authenticated user favorites.
     * Requires authentication.
     *
     * @param p  1-based page number
     * @param ps Page size. Must be greater than 0 and less or equal than 500
     * @return Favorites
     * @throws IOException IOException
     */
    @Override
    public Favorites searchFavorites(Integer p, Integer ps) throws IOException {
        Map<String, Object> params = new ParamMapBuilder().put("p", p).put("ps", ps).build();
        return this.httpClient.get("api/favorites/search", params, Favorites.class);
    }
}
