package com.geewaza.sonarqube.webapi.model.system;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 00:53
 **/
public class NodeHealth {

    private String name;
    private String type;
    private String host;
    private Integer port;
    private Date startedAt;
    private String health;
    private Causes[] causes;
    private NodeHealth[] nodes;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    public Date getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(Date startedAt) {
        this.startedAt = startedAt;
    }

    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public Causes[] getCauses() {
        return causes;
    }

    public void setCauses(Causes[] causes) {
        this.causes = causes;
    }

    public NodeHealth[] getNodes() {
        return nodes;
    }

    public void setNodes(NodeHealth[] nodes) {
        this.nodes = nodes;
    }
}
