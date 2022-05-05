package com.geewaza.sonarqube.webapi.model.qualityprofiles;

import com.geewaza.sonarqube.webapi.model.PageModel;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 15:09
 **/
public class ChangeLog extends PageModel {

    private Event[] events;

    public Event[] getEvents() {
        return events;
    }

    public void setEvents(Event[] events) {
        this.events = events;
    }
}
