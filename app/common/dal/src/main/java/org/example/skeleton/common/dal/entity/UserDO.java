package org.example.skeleton.common.dal.entity;

import java.util.Date;
import javax.annotation.Generated;

public class UserDO {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer id;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String jobNo;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String nickName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String loginName;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String passWord;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String salt;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String departmentCode;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer status;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date gmtCreate;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Date gmtModified;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getId() {
        return id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setId(Integer id) {
        this.id = id;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getJobNo() {
        return jobNo;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setJobNo(String jobNo) {
        this.jobNo = jobNo == null ? null : jobNo.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getNickName() {
        return nickName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getLoginName() {
        return loginName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setLoginName(String loginName) {
        this.loginName = loginName == null ? null : loginName.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getPassWord() {
        return passWord;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setPassWord(String passWord) {
        this.passWord = passWord == null ? null : passWord.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getSalt() {
        return salt;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getDepartmentCode() {
        return departmentCode;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setDepartmentCode(String departmentCode) {
        this.departmentCode = departmentCode == null ? null : departmentCode.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getStatus() {
        return status;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setStatus(Integer status) {
        this.status = status;
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