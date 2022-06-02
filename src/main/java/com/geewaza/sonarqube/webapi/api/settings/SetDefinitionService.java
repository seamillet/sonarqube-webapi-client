package com.geewaza.sonarqube.webapi.api.settings;

import com.geewaza.sonarqube.webapi.api.AbstractService;
import com.geewaza.sonarqube.webapi.client.http.BaseHttpClient;

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

    /**
     * Setting key
     *
     * @param key Example value:sonar.links.scm
     * @return SetDefinitionService
     */
    public SetDefinitionService key(String key) {
        return put("key", key);
    }

    /**
     * Component key
     *
     * @param component Example value: my_project
     * @return GetDefinitionValuesService
     */
    public SetDefinitionService component(String component) {
        return put("component", component);
    }

    /**
     * Setting field values. To set several values, the parameter must be called once for each value.
     *
     * @param fieldValues Example value:fieldValues={"firstField":"first value", "secondField":"second value", "thirdField":"third value"}
     * @return SetDefinitionService
     */
    public SetDefinitionService fieldValues(String fieldValues) {
        return put("fieldValues", fieldValues);
    }

    /**
     * Setting value. To reset a value, please use the reset web service.
     *
     * @param value Example value:git@github.com:SonarSource/sonarqube.git Maximum length:4000
     * @return SetDefinitionService
     */
    public SetDefinitionService value(String value) {
        return put("value", value);
    }

    /**
     * Setting multi value. To set several values, the parameter must be called once for each value.
     *
     * @param values Example value:values=firstValue&values=secondValue&values=thirdValue
     * @return SetDefinitionService
     */
    public SetDefinitionService values(String values) {
        return put("values", values);
    }


}
