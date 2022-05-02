package com.geewaza.sonarqube.webapi.model.system;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 01:09
 **/
public class Upgrades {

    private Upgrade[] upgrades;
    private Date updateCenterRefresh;

    public Upgrade[] getUpgrades() {
        return upgrades;
    }

    public void setUpgrades(Upgrade[] upgrades) {
        this.upgrades = upgrades;
    }

    public Date getUpdateCenterRefresh() {
        return updateCenterRefresh;
    }

    public void setUpdateCenterRefresh(Date updateCenterRefresh) {
        this.updateCenterRefresh = updateCenterRefresh;
    }
}
