package com.geewaza.sonarqube.webapi.model.usertokens;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 09:10
 **/
public class UserTokens {

    private String login;
    private UserToken[] userTokens;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public UserToken[] getUserTokens() {
        return userTokens;
    }

    public void setUserTokens(UserToken[] userTokens) {
        this.userTokens = userTokens;
    }
}
