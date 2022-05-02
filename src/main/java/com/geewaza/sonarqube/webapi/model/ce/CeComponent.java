package com.geewaza.sonarqube.webapi.model.ce;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-02 21:02
 **/
public class CeComponent {

    private Task[] queue;

    private Task current;

    public Task[] getQueue() {
        return queue;
    }

    public void setQueue(Task[] queue) {
        this.queue = queue;
    }

    public Task getCurrent() {
        return current;
    }

    public void setCurrent(Task current) {
        this.current = current;
    }
}
