package com.geewaza.sonarqube.webapi.model.qualityprofiles;

import com.geewaza.sonarqube.webapi.model.Paging;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 15:35
 **/
public class AssociationStatusResponse extends Paging {

    private AssociationStatus[] results;

    public AssociationStatus[] getResults() {
        return results;
    }

    public void setResults(AssociationStatus[] results) {
        this.results = results;
    }
}
