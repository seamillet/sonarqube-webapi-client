package com.geewaza.sonarqube.webapi;

import com.geewaza.sonarqube.webapi.client.api.*;

/**
 *
 * @author chengkeqian
 * @date 2017/6/20
 */
public interface SonarClient {
    /**
     * Get Ce API Client
     *
     * @return CeClient
     */
    CeClient getCeClient();

    /**
     * Get Component API Client
     *
     * @return ComponentClient
     */
    ComponentsClient getComponentsClient();

    /**
     * Get Duplications API Client
     *
     * @return DuplicationsClient
     */
    DuplicationsClient getDuplicationsClient();

    /**
     * Get User API Client
     *
     * @return UserClient
     */
    UserClient getUserClient();

    /**
     * Get Projects API Client
     *
     * @return ProjectClient
     */
    ProjectsClient getProjectsClient();

    /**
     * Get Issues API Client
     *
     * @return IssuesClient
     */
    IssuesClient getIssuesClient();

    /**
     * Get Notifications API Client
     *
     * @return NotificationsClient
     */
    NotificationsClient getNotificationsClient();

    /**
     * Get Webhooks API Client
     *
     * @return WebhooksClient
     */
    WebhooksClient getWebhooksClient();

    /**
     * Get UserToken API Client
     *
     * @return UserTokenClient
     */
    UserTokenClient getUserTokenClient();

    /**
     * Get Authentication API Client
     *
     * @return AuthenticationClient
     */
    AuthenticationClient getAuthenticationClient();

    /**
     * Get Permissions API Client
     *
     * @return PermissionsClient
     */
    PermissionsClient getPermissionsClient();

    /**
     * Get Plugins API Client
     *
     * @return PluginsClient
     */
    PluginsClient getPluginsClient();

    /**
     * Get Server API Client
     *
     * @return ServerClient
     */
    ServerClient getServerClient();

    /**
     * Get QualityGates API Client
     *
     * @return ServerClient
     */
    QualityGatesClient getQualityGatesClient();

    /**
     * Get QualityProfile API Client
     *
     * @return ServerClient
     */
    QualityProfileClient getQualityProfileClient();

    /**
     * Get ProjectAnalyses API Client
     *
     * @return ProjectAnalysesClient
     */
    ProjectAnalysesClient getProjectAnalysesClient();
    /**
     * Get ProjectBadges API Client
     *
     * @return ProjectBadgesClient
     */
    ProjectBadgesClient getProjectBadgesClient();

    /**
     * Get ProjectBranches API Client
     *
     * @return ProjectBranchesClient
     */
    ProjectBranchesClient getProjectBranchesClient();
    /**
     * Get ProjectLinks API Client
     *
     * @return ProjectLinksClient
     */
    ProjectLinksClient getProjectLinksClient();
    /**
     * Get ProjectPullRequest API Client
     *
     * @return ProjectPullRequestClient
     */
    ProjectPullRequestsClient getProjectPullRequestClient();
    /**
     * Get ProjectTags API Client
     *
     * @return ProjectTagsClient
     */
    ProjectTagsClient getProjectTagsClient();

    /**
     * Get UserGroups API Client
     *
     * @return UserGroupsClient
     */
    UserGroupsClient getUserGroupsClient();

    /**
     * Get UpdateCenter API Client
     *
     * @return UpdateCenterClient
     */
    UpdateCenterClient getUpdateCenterClient();

    /**
     * Get Rules API Client
     *
     * @return RulesClient
     */
    RulesClient getRulesClient();

    /**
     * Get Sources API Client
     *
     * @return SourcesClient
     */
    SourcesClient getSourcesClient();
    /**
     * Get Settings API Client
     *
     * @return SettingsClient
     */
    SettingsClient getSettingsClient();
    /**
     * Get Webservices API Client
     *
     * @return WebservicesClient
     */
    WebservicesClient getWebservicesClient();
    /**
     * Get Metrics API Client
     *
     * @return MetricsClient
     */
    MetricsClient getMetricsClient();

    /**
     * Get Measures API Client
     *
     * @return MeasuresClient
     */
    MeasuresClient getMeasuresClient();

    /**
     * Get Languages API Client
     *
     * @return LanguagesClient
     */
    LanguagesClient getLanguagesClient();

    /**
     * Get Favorite API Client
     *
     * @return FavoriteClient
     */
    FavoriteClient getFavoriteClient();
    /**
     * Get System API Client
     *
     * @return SystemClient
     */
    SystemClient getSystemClient();
}
