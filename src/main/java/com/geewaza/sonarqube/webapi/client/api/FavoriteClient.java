package com.geewaza.sonarqube.webapi.client.api;

import com.geewaza.sonarqube.webapi.api.favorites.AddFavoriteService;
import com.geewaza.sonarqube.webapi.api.favorites.RemoveFavoriteService;
import com.geewaza.sonarqube.webapi.api.favorites.SearchFavoriteService;
import com.geewaza.sonarqube.webapi.client.AbstractSonarClient;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-06 10:25
 **/
public class FavoriteClient extends AbstractSonarClient {
    public FavoriteClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public AddFavoriteService addFavorite() {
        return new AddFavoriteService(this.httpClient);
    }
    public RemoveFavoriteService removeFavorite() {
        return new RemoveFavoriteService(this.httpClient);
    }
    public SearchFavoriteService searchFavorite() {
        return new SearchFavoriteService(this.httpClient);
    }
}
