/**
 * Copyright 2022 bejson.com
 */
package com.geewaza.sonarqube.webapi.model.component;

/**
 * Auto-generated: 2022-04-29 9:30:58
 *
 * @author wangheng
 */
public class ComponentShow {

    private Component component;

    private Component[] ancestors;

    public Component getComponent() {
        return component;
    }

    public void setComponent(Component component) {
        this.component = component;
    }

    public Component[] getAncestors() {
        return ancestors;
    }

    public void setAncestors(Component[] ancestors) {
        this.ancestors = ancestors;
    }
}