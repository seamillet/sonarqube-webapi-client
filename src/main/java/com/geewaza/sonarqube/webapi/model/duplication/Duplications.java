package com.geewaza.sonarqube.webapi.model.duplication;

import java.util.Map;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-05-03 11:35
 **/
public class Duplications {

    private Duplication[] duplications;
    private Map<String, DuplicationFile> files;

    public Duplication[] getDuplications() {
        return duplications;
    }

    public void setDuplications(Duplication[] duplications) {
        this.duplications = duplications;
    }

    public Map<String, DuplicationFile> getFiles() {
        return files;
    }

    public void setFiles(Map<String, DuplicationFile> files) {
        this.files = files;
    }
}
