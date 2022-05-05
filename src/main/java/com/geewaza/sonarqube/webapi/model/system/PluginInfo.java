package com.geewaza.sonarqube.webapi.model.system;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 01:12
 **/
public class PluginInfo {

    private Plugin[] requireUpdate;
    private Plugin[] incompatible;
    private Plugin[] installing;
    private Plugin[] updating;
    private Plugin[] removing;

    public Plugin[] getRequireUpdate() {
        return requireUpdate;
    }

    public void setRequireUpdate(Plugin[] requireUpdate) {
        this.requireUpdate = requireUpdate;
    }

    public Plugin[] getIncompatible() {
        return incompatible;
    }

    public void setIncompatible(Plugin[] incompatible) {
        this.incompatible = incompatible;
    }

    public Plugin[] getInstalling() {
        return installing;
    }

    public void setInstalling(Plugin[] installing) {
        this.installing = installing;
    }

    public Plugin[] getUpdating() {
        return updating;
    }

    public void setUpdating(Plugin[] updating) {
        this.updating = updating;
    }

    public Plugin[] getRemoving() {
        return removing;
    }

    public void setRemoving(Plugin[] removing) {
        this.removing = removing;
    }
}
