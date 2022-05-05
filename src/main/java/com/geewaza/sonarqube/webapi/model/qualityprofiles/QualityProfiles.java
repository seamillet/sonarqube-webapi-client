package com.geewaza.sonarqube.webapi.model.qualityprofiles;

import com.geewaza.sonarqube.webapi.model.qualitygates.Action;
import com.geewaza.sonarqube.webapi.model.qualitygates.Actions;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 15:13
 **/
public class QualityProfiles {

    private QualityProfile[] profiles;
    private Actions actions;

    public QualityProfile[] getProfiles() {
        return profiles;
    }

    public void setProfiles(QualityProfile[] profiles) {
        this.profiles = profiles;
    }

    public Actions getActions() {
        return actions;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }
}
