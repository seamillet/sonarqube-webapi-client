package com.geewaza.sonarqube.webapi.model.project;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 16:23
 **/
public class AnalysisEventResponse {
    private AnalysisEvent event;

    public AnalysisEvent getEvent() {
        return event;
    }

    public void setEvent(AnalysisEvent event) {
        this.event = event;
    }
}
