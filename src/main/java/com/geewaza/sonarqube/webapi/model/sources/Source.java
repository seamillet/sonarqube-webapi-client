package com.geewaza.sonarqube.webapi.model.sources;

import java.util.Date;

/**
 * <p></p>
 *
 * @author : wangheng
 * @date : 2022-06-06 10:14
 **/
public class Source {

    private Integer line;
    private String code;
    private String scmRevision;
    private String scmAuthor;
    private Date scmDate;
    private Boolean duplicated;
    private Boolean isNew;
    private Integer utLineHits;
    private Integer lineHits;

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getScmRevision() {
        return scmRevision;
    }

    public void setScmRevision(String scmRevision) {
        this.scmRevision = scmRevision;
    }

    public String getScmAuthor() {
        return scmAuthor;
    }

    public void setScmAuthor(String scmAuthor) {
        this.scmAuthor = scmAuthor;
    }

    public Date getScmDate() {
        return scmDate;
    }

    public void setScmDate(Date scmDate) {
        this.scmDate = scmDate;
    }

    public Boolean getDuplicated() {
        return duplicated;
    }

    public void setDuplicated(Boolean duplicated) {
        this.duplicated = duplicated;
    }

    public Boolean getNew() {
        return isNew;
    }

    public void setNew(Boolean aNew) {
        isNew = aNew;
    }
}
