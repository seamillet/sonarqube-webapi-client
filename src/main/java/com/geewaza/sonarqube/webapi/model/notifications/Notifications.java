package com.geewaza.sonarqube.webapi.model.notifications;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 22:36
 **/
public class Notifications {
    private Notification[] notifications;

    private String[] channels;

    private String[] globalTypes;

    private String[] perProjectTypes;

    public Notification[] getNotifications() {
        return notifications;
    }

    public void setNotifications(Notification[] notifications) {
        this.notifications = notifications;
    }

    public String[] getChannels() {
        return channels;
    }

    public void setChannels(String[] channels) {
        this.channels = channels;
    }

    public String[] getGlobalTypes() {
        return globalTypes;
    }

    public void setGlobalTypes(String[] globalTypes) {
        this.globalTypes = globalTypes;
    }

    public String[] getPerProjectTypes() {
        return perProjectTypes;
    }

    public void setPerProjectTypes(String[] perProjectTypes) {
        this.perProjectTypes = perProjectTypes;
    }
}
