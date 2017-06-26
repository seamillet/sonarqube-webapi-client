package com.willc.sonarqube.webapi.model.user;

import com.willc.sonarqube.webapi.model.BaseModel;

/**
 * Created by chengkeqian on 2017/6/20.
 */
public class User extends BaseModel{
    private String login;
    private String name;
    private String email;
    private boolean active;
    private boolean local;
    private String externalIdentity;
    private String externalProvider;
    private String[] groups;
    private String[] scmAccounts;
    private int tokensCount;


}
