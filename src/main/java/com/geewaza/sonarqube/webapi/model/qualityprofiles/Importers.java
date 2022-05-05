package com.geewaza.sonarqube.webapi.model.qualityprofiles;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-05 15:26
 **/
public class Importers {

    private Loader[] importers;

    public Loader[] getImporters() {
        return importers;
    }

    public void setImporters(Loader[] importers) {
        this.importers = importers;
    }
}
