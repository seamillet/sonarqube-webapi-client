package com.geewaza.sonarqube.webapi.model.favorite;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 17:34
 **/
public class Favorites extends Paging {

    private Favorite[] favorites;

    public Favorite[] getFavorites() {
        return favorites;
    }

    public void setFavorites(Favorite[] favorites) {
        this.favorites = favorites;
    }
}
