package com.geewaza.sonarqube.webapi.model.system;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 01:12
 **/
public class Plugins {

    private Plugin[] requireUpdate;
    private Plugin[] incompatible;

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
}
