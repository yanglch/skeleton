package org.example.skeleton.core.model.entity;

import org.example.skeleton.core.model.enums.ApplicationStatusEnum;

import java.util.Date;

public class Application {

    private String name;

    private ApplicationStatusEnum status;

    private Integer ownerId;

    private String codeRepository;

    private Date gmtCreate;

    private Date gmtModified;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ApplicationStatusEnum getStatus() {
        return status;
    }

    public void setStatus(ApplicationStatusEnum status) {
        this.status = status;
    }

    public Integer getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    public String getCodeRepository() {
        return codeRepository;
    }

    public void setCodeRepository(String codeRepository) {
        this.codeRepository = codeRepository;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModified() {
        return gmtModified;
    }

    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}
