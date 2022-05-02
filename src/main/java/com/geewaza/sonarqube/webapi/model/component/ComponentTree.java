/**
 * Copyright 2022 bejson.com
 */
package com.geewaza.sonarqube.webapi.model.component;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * Auto-generated: 2022-04-29 9:30:58
 *
 * @author wangheng
 */
public class ComponentTree extends Paging {

    private Component baseComponent;

    private Component[] components;

    public Component getBaseComponent() {
        return baseComponent;
    }

    public void setBaseComponent(Component baseComponent) {
        this.baseComponent = baseComponent;
    }

    public Component[] getComponents() {
        return components;
    }

    public void setComponents(Component[] components) {
        this.components = components;
    }
}