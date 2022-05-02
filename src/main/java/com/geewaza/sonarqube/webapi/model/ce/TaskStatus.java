package com.geewaza.sonarqube.webapi.model.ce;

/**
 * Compute Engine task status
 *
 * @author wangheng
 * @since 2017-06-20
 */
public class TaskStatus {
    private Integer pending;
    private Integer inProgress;
    private Integer failing;
    private Long pendingTime;

    public Integer getPending() {
        return pending;
    }

    public void setPending(Integer pending) {
        this.pending = pending;
    }

    public Integer getInProgress() {
        return inProgress;
    }

    public void setInProgress(Integer inProgress) {
        this.inProgress = inProgress;
    }

    public Integer getFailing() {
        return failing;
    }

    public void setFailing(Integer failing) {
        this.failing = failing;
    }

    public Long getPendingTime() {
        return pendingTime;
    }

    public void setPendingTime(Long pendingTime) {
        this.pendingTime = pendingTime;
    }
}
