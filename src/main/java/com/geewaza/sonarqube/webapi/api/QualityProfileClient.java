package com.geewaza.sonarqube.webapi.api;

import com.geewaza.sonarqube.webapi.api.qualityprofiles.*;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;
import com.geewaza.sonarqube.webapi.client.impl.AbstractSonarClient;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 15:53
 **/
public class QualityProfileClient extends AbstractSonarClient {

    public QualityProfileClient(BaseHttpClient httpClient) {
        super(httpClient);
    }

    public ActivateRuleService activateRule() {
        return new ActivateRuleService(this.httpClient);
    }
    public ActivateRulesService activateRules() {
        return new ActivateRulesService(this.httpClient);
    }
    public AddProjectService addProject() {
        return new AddProjectService(this.httpClient);
    }
    public ChangeParentService changeParent() {
        return new ChangeParentService(this.httpClient);
    }
    public CopyQualityProfileService copyQualityProfile() {
        return new CopyQualityProfileService(this.httpClient);
    }
    public CreateQualityProfileService createQualityProfile() {
        return new CreateQualityProfileService(this.httpClient);
    }
    public DeactivateRuleService deactivateRule() {
        return new DeactivateRuleService(this.httpClient);
    }
    public DeactivateRulesService deactivateRules() {
        return new DeactivateRulesService(this.httpClient);
    }
    public DeleteQualityProfileService deleteQualityProfile() {
        return new DeleteQualityProfileService(this.httpClient);
    }
    public GetBackupService getBackup() {
        return new GetBackupService(this.httpClient);
    }
    public GetChangeLogService getChangeLog() {
        return new GetChangeLogService(this.httpClient);
    }
    public GetExportersService getExporters() {
        return new GetExportersService(this.httpClient);
    }
    public GetExportService getExport() {
        return new GetExportService(this.httpClient);
    }
    public GetImportersService getImporters() {
        return new GetImportersService(this.httpClient);
    }
    public GetInheritanceService getInheritance() {
        return new GetInheritanceService(this.httpClient);
    }
    public GetProjectQualityProfileService getProjectQualityProfile() {
        return new GetProjectQualityProfileService(this.httpClient);
    }
    public RemoveProjectQualityProfileService removeProjectQualityProfile() {
        return new RemoveProjectQualityProfileService(this.httpClient);
    }
    public RenameQualityProfileService renameQualityProfile() {
        return new RenameQualityProfileService(this.httpClient);
    }
    public RestoreQualityProfileService restoreQualityProfile() {
        return new RestoreQualityProfileService(this.httpClient);
    }
    public SearchQualityProfileService searchQualityProfile() {
        return new SearchQualityProfileService(this.httpClient);
    }
    public SetDefaultProfileService setDefaultProfile() {
        return new SetDefaultProfileService(this.httpClient);
    }

}
