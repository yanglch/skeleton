package org.example.skeleton.common.dal.entity;

import java.util.Date;
import javax.annotation.Generated;

public class DepartmentDO {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Long id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String code;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String name;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String parentCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date gmtCreate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date gmtModified;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Long getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Long id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getCode() {
        return code;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getName() {
        return name;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getParentCode() {
        return parentCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setParentCode(String parentCode) {
        this.parentCode = parentCode == null ? null : parentCode.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getGmtCreate() {
        return gmtCreate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Date getGmtModified() {
        return gmtModified;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }
}