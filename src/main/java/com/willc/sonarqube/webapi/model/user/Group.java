package com.willc.sonarqube.webapi.model.user;

import com.willc.sonarqube.webapi.model.BaseModel;

/**
 * Created by chengkeqian on 2017/6/20.
 */
public class Group extends BaseModel{
    private String id;
    private String name;
    private String description;
    private boolean selected;
}
