package com.geewaza.sonarqube.webapi.api.settings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.BaseHttpClient;

import java.io.IOException;

/**
 * Update a setting value.
 * Either 'value' or 'values' must be provided.
 * The settings defined in conf/sonar.properties are read-only and can't be changed.
 * Requires one of the following permissions:
 * 'Administer System'
 * 'Administer' rights on the specified component
 *
 * @author : wangheng
 * @date : 2022-05-05 14:50
 **/
public class SetDefinitionService extends AbstractService<SetDefinitionService, Boolean> {
    public SetDefinitionService(BaseHttpClient httpClient) {
        super(httpClient);
    }

    @Override
    protected String[] requiredParam() {
        return new String[]{"key"};
    }

    @Override
    protected Boolean doExecute() throws IOException {
        doPost("api/settings/set");
        return true;
    }
    public SetDefinitionService key(String key) {
        return put("key", key);
    }
    public SetDefinitionService component(String component) {
        return put("component", component);
    }
    public SetDefinitionService fieldValues(String fieldValues) {
        return put("fieldValues", fieldValues);
    }
    public SetDefinitionService value(String value) {
        return put("value", value);
    }
    public SetDefinitionService values(String values) {
        return put("values", values);
    }


}
