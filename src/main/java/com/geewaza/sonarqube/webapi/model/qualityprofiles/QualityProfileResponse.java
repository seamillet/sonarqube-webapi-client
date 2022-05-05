package com.geewaza.sonarqube.webapi.model.qualityprofiles;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 15:13
 **/
public class QualityProfileResponse {

    private QualityProfile profile;

    private String[] warnings;

    public QualityProfile getProfile() {
        return profile;
    }

    public void setProfile(QualityProfile profile) {
        this.profile = profile;
    }

    public String[] getWarnings() {
        return warnings;
    }

    public void setWarnings(String[] warnings) {
        this.warnings = warnings;
    }
}
