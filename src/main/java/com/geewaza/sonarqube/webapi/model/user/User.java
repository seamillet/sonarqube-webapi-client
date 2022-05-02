package com.geewaza.sonarqube.webapi.model.user;

/**
 *
 * @author wangheng
 * @date 2017/6/20
 */
public class User {
    private String login;
    private String name;
    private String email;
    private Boolean active;
    private Boolean local;
    private String externalIdentity;
    private String externalProvider;
    private String[] groups;
    private String[] scmAccounts;
    private Integer tokensCount;
    private String password;
    private String previousPassword;
    private String avatar;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getLocal() {
        return local;
    }

    public void setLocal(Boolean local) {
        this.local = local;
    }

    public String getExternalIdentity() {
        return externalIdentity;
    }

    public void setExternalIdentity(String externalIdentity) {
        this.externalIdentity = externalIdentity;
    }

    public String getExternalProvider() {
        return externalProvider;
    }

    public void setExternalProvider(String externalProvider) {
        this.externalProvider = externalProvider;
    }

    public String[] getGroups() {
        return groups;
    }

    public void setGroups(String[] groups) {
        this.groups = groups;
    }

    public String[] getScmAccounts() {
        return scmAccounts;
    }

    public void setScmAccounts(String[] scmAccounts) {
        this.scmAccounts = scmAccounts;
    }

    public Integer getTokensCount() {
        return tokensCount;
    }

    public void setTokensCount(Integer tokensCount) {
        this.tokensCount = tokensCount;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPreviousPassword() {
        return previousPassword;
    }

    public void setPreviousPassword(String previousPassword) {
        this.previousPassword = previousPassword;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
}
