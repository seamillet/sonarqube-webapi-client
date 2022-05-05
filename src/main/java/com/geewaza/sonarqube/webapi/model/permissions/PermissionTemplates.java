package com.geewaza.sonarqube.webapi.model.permissions;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 10:18
 **/
public class PermissionTemplates extends Paging {
    private PermissionTemplate[] permissionTemplates;

    public PermissionTemplate[] getPermissionTemplates() {
        return permissionTemplates;
    }

    public void setPermissionTemplates(PermissionTemplate[] permissionTemplates) {
        this.permissionTemplates = permissionTemplates;
    }
}
