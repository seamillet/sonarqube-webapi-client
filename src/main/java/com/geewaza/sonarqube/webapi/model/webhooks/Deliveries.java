package com.geewaza.sonarqube.webapi.model.webhooks;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 22:53
 **/
public class Deliveries extends Paging {


    private Delivery[] deliveries;

    public Delivery[] getDeliveries() {
        return deliveries;
    }

    public void setDeliveries(Delivery[] deliveries) {
        this.deliveries = deliveries;
    }
}
