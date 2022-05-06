package com.geewaza.sonarqube.webapi;

import com.geewaza.sonarqube.webapi.client.api.*;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

import java.net.URI;

/**
 * @author chengkeqian, wangheng
 * @date 2017/6/20
 */
public class SonarClient {
    private final AuthenticationClient authenticationClient;
    private final CeClient ceClient;
    private final ComponentsClient componentsClient;
    private final DuplicationsClient duplicationsClient;
    private final UserClient userClient;
    private final ProjectsClient projectsClient;
    private final SystemClient systemClient;
    private final IssuesClient issuesClient;
    private final NotificationsClient notificationsClient;
    private final WebhooksClient webhooksClient;
    private final UserTokenClient userTokenClient;
    private final PermissionsClient permissionsClient;
    private final PluginsClient pluginsClient;
    private final ServerClient serverClient;
    private final QualityGatesClient qualityGatesClient;
    private final QualityProfileClient qualityProfileClient;
    private final ProjectAnalysesClient projectAnalysesClient;
    private final ProjectBadgesClient projectBadgesClient;
    private final ProjectBranchesClient projectBranchesClient;
    private final ProjectLinksClient projectLinksClient;
    private final ProjectPullRequestsClient projectPullRequestsClient;
    private final ProjectTagsClient projectTagsClient;
    private final UserGroupsClient userGroupsClient;
    private final UpdateCenterClient updateCenterClient;
    private final RulesClient rulesClient;
    private final SourcesClient sourcesClient;
    private final SettingsClient settingsClient;
    private final WebservicesClient webservicesClient;
    private final MetricsClient metricsClient;
    private final MeasuresClient measuresClient;
    private final LanguagesClient languagesClient;
    private final FavoriteClient favoriteClient;

    /**
     * SonarClientImpl constructor with token
     *
     * @param uri   Sonarqube host url
     * @param token Access token
     */
    public SonarClient(URI uri, String token) {
        this(uri, token, "");
    }

    /**
     * SonarClientImpl constructor with username and password
     *
     * @param uri      Sonarqube host url
     * @param username User login name
     * @param password Password
     */
    public SonarClient(URI uri, String username, String password) {
        BaseHttpClient baseHttpClient = new BaseHttpClient(uri, username, password);

        this.authenticationClient = new AuthenticationClient(baseHttpClient);
        this.ceClient = new CeClient(baseHttpClient);
        this.componentsClient = new ComponentsClient(baseHttpClient);
        this.duplicationsClient = new DuplicationsClient(baseHttpClient);
        this.userClient = new UserClient(baseHttpClient);
        this.projectsClient = new ProjectsClient(baseHttpClient);
        this.systemClient = new SystemClient(baseHttpClient);
        this.issuesClient = new IssuesClient(baseHttpClient);
        this.notificationsClient = new NotificationsClient(baseHttpClient);
        this.webhooksClient = new WebhooksClient(baseHttpClient);
        this.userTokenClient = new UserTokenClient(baseHttpClient);
        this.permissionsClient = new PermissionsClient(baseHttpClient);
        this.pluginsClient = new PluginsClient(baseHttpClient);
        this.serverClient = new ServerClient(baseHttpClient);
        this.qualityGatesClient = new QualityGatesClient(baseHttpClient);
        this.qualityProfileClient = new QualityProfileClient(baseHttpClient);
        this.projectAnalysesClient = new ProjectAnalysesClient(baseHttpClient);
        this.projectBadgesClient = new ProjectBadgesClient(baseHttpClient);
        this.projectBranchesClient = new ProjectBranchesClient(baseHttpClient);
        this.projectLinksClient = new ProjectLinksClient(baseHttpClient);
        this.projectPullRequestsClient = new ProjectPullRequestsClient(baseHttpClient);
        this.projectTagsClient = new ProjectTagsClient(baseHttpClient);
        this.userGroupsClient = new UserGroupsClient(baseHttpClient);
        this.updateCenterClient = new UpdateCenterClient(baseHttpClient);
        this.rulesClient = new RulesClient(baseHttpClient);
        this.sourcesClient = new SourcesClient(baseHttpClient);
        this.settingsClient = new SettingsClient(baseHttpClient);
        this.webservicesClient = new WebservicesClient(baseHttpClient);
        this.metricsClient = new MetricsClient(baseHttpClient);
        this.measuresClient = new MeasuresClient(baseHttpClient);
        this.languagesClient = new LanguagesClient(baseHttpClient);
        this.favoriteClient = new FavoriteClient(baseHttpClient);
    }


    /**
     * Get Ce API Client
     *
     * @return CeClient
     */
    public CeClient getCeClient() {
        return this.ceClient;
    }

    /**
     * Get Component API Client
     *
     * @return ComponentClient
     */
    public ComponentsClient getComponentsClient() {
        return this.componentsClient;
    }

    /**
     * Get Duplications API Client
     *
     * @return DuplicationsClient
     */
    public DuplicationsClient getDuplicationsClient() {
        return this.duplicationsClient;
    }

    /**
     * Get User API Client
     *
     * @return UserClient
     */
    public UserClient getUserClient() {
        return this.userClient;
    }

    /**
     * Get Projects API Client
     *
     * @return ProjectClient
     */
    public ProjectsClient getProjectsClient() {
        return this.projectsClient;
    }

    /**
     * Get System API Client
     *
     * @return SystemClient
     */
    public SystemClient getSystemClient() {
        return this.systemClient;
    }

    /**
     * Get Issues API Client
     *
     * @return IssuesClient
     */
    public IssuesClient getIssuesClient() {
        return this.issuesClient;
    }

    /**
     * Get Notifications API Client
     *
     * @return NotificationsClient
     */
    public NotificationsClient getNotificationsClient() {
        return this.notificationsClient;
    }

    /**
     * Get Webhooks API Client
     *
     * @return WebhooksClient
     */
    public WebhooksClient getWebhooksClient() {
        return this.webhooksClient;
    }

    /**
     * Get UserToken API Client
     *
     * @return WebhooksClient
     */
    public UserTokenClient getUserTokenClient() {
        return this.userTokenClient;
    }

    /**
     * Get Authentication API Client
     *
     * @return AuthenticationClient
     */
    public AuthenticationClient getAuthenticationClient() {
        return this.authenticationClient;
    }

    /**
     * Get Permissions API Client
     *
     * @return PermissionsClient
     */
    public PermissionsClient getPermissionsClient() {
        return this.permissionsClient;
    }

    /**
     * Get Plugins API Client
     *
     * @return PluginsClient
     */
    public PluginsClient getPluginsClient() {
        return this.pluginsClient;
    }

    /**
     * Get Server API Client
     *
     * @return ServerClient
     */
    public ServerClient getServerClient() {
        return this.serverClient;
    }

    /**
     * Get QualityGates API Client
     *
     * @return ServerClient
     */
    public QualityGatesClient getQualityGatesClient() {
        return this.qualityGatesClient;
    }

    /**
     * Get QualityProfile API Client
     *
     * @return ServerClient
     */
    public QualityProfileClient getQualityProfileClient() {
        return this.qualityProfileClient;
    }

    /**
     * Get ProjectAnalyses API Client
     *
     * @return ProjectAnalysesClient
     */
    public ProjectAnalysesClient getProjectAnalysesClient() {
        return this.projectAnalysesClient;
    }

    /**
     * Get ProjectBadges API Client
     *
     * @return ProjectBadgesClient
     */
    public ProjectBadgesClient getProjectBadgesClient() {
        return this.projectBadgesClient;
    }

    /**
     * Get ProjectBranches API Client
     *
     * @return ProjectBranchesClient
     */
    public ProjectBranchesClient getProjectBranchesClient() {
        return this.projectBranchesClient;
    }

    /**
     * Get ProjectLinks API Client
     *
     * @return ProjectLinksClient
     */
    public ProjectLinksClient getProjectLinksClient() {
        return this.projectLinksClient;
    }

    /**
     * Get ProjectPullRequest API Client
     *
     * @return ProjectPullRequestClient
     */
    public ProjectPullRequestsClient getProjectPullRequestClient() {
        return this.projectPullRequestsClient;
    }

    /**
     * Get ProjectTags API Client
     *
     * @return ProjectTagsClient
     */
    public ProjectTagsClient getProjectTagsClient() {
        return this.projectTagsClient;
    }

    /**
     * Get UserGroups API Client
     *
     * @return UserGroupsClient
     */
    public UserGroupsClient getUserGroupsClient() {
        return this.userGroupsClient;
    }

    /**
     * Get UpdateCenter API Client
     *
     * @return UpdateCenterClient
     */
    public UpdateCenterClient getUpdateCenterClient() {
        return this.updateCenterClient;
    }

    /**
     * Get Rules API Client
     *
     * @return RulesClient
     */
    public RulesClient getRulesClient() {
        return this.rulesClient;
    }

    /**
     * Get Sources API Client
     *
     * @return SourcesClient
     */
    public SourcesClient getSourcesClient() {
        return this.sourcesClient;
    }

    /**
     * Get Settings API Client
     *
     * @return SettingsClient
     */
    public SettingsClient getSettingsClient() {
        return this.settingsClient;
    }

    /**
     * Get Webservices API Client
     *
     * @return WebservicesClient
     */
    public WebservicesClient getWebservicesClient() {
        return this.webservicesClient;
    }

    /**
     * Get Metrics API Client
     *
     * @return MetricsClient
     */
    public MetricsClient getMetricsClient() {
        return this.metricsClient;
    }

    /**
     * Get Measures API Client
     *
     * @return MeasuresClient
     */
    public MeasuresClient getMeasuresClient() {
        return this.measuresClient;
    }

    /**
     * Get Languages API Client
     *
     * @return LanguagesClient
     */
    public LanguagesClient getLanguagesClient() {
        return this.languagesClient;
    }

    /**
     * Get Favorite API Client
     *
     * @return FavoriteClient
     */
    public FavoriteClient getFavoriteClient() {
        return this.favoriteClient;
    }
}
