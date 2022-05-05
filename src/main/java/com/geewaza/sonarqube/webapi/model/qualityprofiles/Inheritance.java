package com.geewaza.sonarqube.webapi.model.qualityprofiles;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 15:32
 **/
public class Inheritance {
    private QualityProfile profile;
    private QualityProfile[] ancestors;
    private QualityProfile[] children;

    public QualityProfile getProfile() {
        return profile;
    }

    public void setProfile(QualityProfile profile) {
        this.profile = profile;
    }

    public QualityProfile[] getAncestors() {
        return ancestors;
    }

    public void setAncestors(QualityProfile[] ancestors) {
        this.ancestors = ancestors;
    }

    public QualityProfile[] getChildren() {
        return children;
    }

    public void setChildren(QualityProfile[] children) {
        this.children = children;
    }
}
