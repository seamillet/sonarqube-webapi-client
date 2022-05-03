package com.geewaza.sonarqube.webapi.client;

import com.geewaza.sonarqube.webapi.model.favorite.Favorites;

import java.io.IOException;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 17:31
 **/
public interface FavoritesClient {

    /**
     * Add a component (project, file etc.) as favorite for the authenticated user.
     * Only 100 components by qualifier can be added as favorite.
     * Requires authentication and the following permission: 'Browse' on the project of the specified component.
     *
     * @param component     Component key. Only components with qualifiers TRK, VW, SVW, APP, FIL, UTS are supported
     * @return              Success or not
     * @throws IOException  IOException
     */
    Boolean addFavorite(String component) throws IOException;

    /**
     * Remove a component (project, directory, file etc.) as favorite for the authenticated user.
     * Requires authentication.
     *
     * @param component     Component key
     * @return              Success or not
     * @throws IOException  IOException
     */
    Boolean removeFavorite(String component) throws IOException;

    /**
     * Search for the authenticated user favorites.
     * Requires authentication.
     *
     * @param p             1-based page number
     * @param ps            Page size. Must be greater than 0 and less or equal than 500
     * @return              Favorites
     * @throws IOException  IOException
     */
    Favorites searchFavorites(Integer p, Integer ps) throws IOException;
}
