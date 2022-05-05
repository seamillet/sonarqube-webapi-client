package com.geewaza.sonarqube.webapi.model.plugins;

import com.geewaza.sonarqube.webapi.model.system.Plugin;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 10:57
 **/
public class Plugins {
    private Plugin[] plugins;
    private Date updateCenterRefresh;

    public Plugin[] getPlugins() {
        return plugins;
    }

    public void setPlugins(Plugin[] plugins) {
        this.plugins = plugins;
    }

    public Date getUpdateCenterRefresh() {
        return updateCenterRefresh;
    }

    public void setUpdateCenterRefresh(Date updateCenterRefresh) {
        this.updateCenterRefresh = updateCenterRefresh;
    }
}
