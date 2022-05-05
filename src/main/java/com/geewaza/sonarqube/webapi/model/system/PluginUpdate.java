package com.geewaza.sonarqube.webapi.model.system;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 01:12
 **/
public class PluginUpdate {

    private String key;
    private String name;
    private String category;
    private String description;
    private String license;
    private String organizationName;
    private String organizationUrl;
    private String homepageUrl;
    private String issueTrackerUrl;
    private String implementationBuild;
    private Boolean editionBundled;
    private String termsAndConditionsUrl;
    private Update[] updates;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }

    public String getOrganizationUrl() {
        return organizationUrl;
    }

    public void setOrganizationUrl(String organizationUrl) {
        this.organizationUrl = organizationUrl;
    }

    public Boolean getEditionBundled() {
        return editionBundled;
    }

    public void setEditionBundled(Boolean editionBundled) {
        this.editionBundled = editionBundled;
    }

    public String getTermsAndConditionsUrl() {
        return termsAndConditionsUrl;
    }

    public void setTermsAndConditionsUrl(String termsAndConditionsUrl) {
        this.termsAndConditionsUrl = termsAndConditionsUrl;
    }

    public String getHomepageUrl() {
        return homepageUrl;
    }

    public void setHomepageUrl(String homepageUrl) {
        this.homepageUrl = homepageUrl;
    }

    public String getIssueTrackerUrl() {
        return issueTrackerUrl;
    }

    public void setIssueTrackerUrl(String issueTrackerUrl) {
        this.issueTrackerUrl = issueTrackerUrl;
    }

    public String getImplementationBuild() {
        return implementationBuild;
    }

    public void setImplementationBuild(String implementationBuild) {
        this.implementationBuild = implementationBuild;
    }

    public Update[] getUpdates() {
        return updates;
    }

    public void setUpdates(Update[] updates) {
        this.updates = updates;
    }
}
