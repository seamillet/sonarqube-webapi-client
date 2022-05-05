package com.geewaza.sonarqube.webapi.model.plugins;

import com.geewaza.sonarqube.webapi.model.system.PluginUpdate;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 10:57
 **/
public class PluginUpdates {
    private PluginUpdate[] plugins;

    public PluginUpdate[] getPlugins() {
        return plugins;
    }

    public void setPlugins(PluginUpdate[] plugins) {
        this.plugins = plugins;
    }
}
