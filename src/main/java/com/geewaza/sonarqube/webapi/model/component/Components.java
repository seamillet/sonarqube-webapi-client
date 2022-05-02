package com.geewaza.sonarqube.webapi.model.component;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-02 21:44
 **/
public class Components extends Paging {

    private Component[] components;

    public Component[] getComponents() {
        return components;
    }

    public void setComponents(Component[] components) {
        this.components = components;
    }
}
