package com.geewaza.sonarqube.webapi.model.project;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:28
 **/
public class QualityGateEvent {
    private String status;
    private Boolean stillFailing;
    private Failing[] failing;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getStillFailing() {
        return stillFailing;
    }

    public void setStillFailing(Boolean stillFailing) {
        this.stillFailing = stillFailing;
    }

    public Failing[] getFailing() {
        return failing;
    }

    public void setFailing(Failing[] failing) {
        this.failing = failing;
    }
}
