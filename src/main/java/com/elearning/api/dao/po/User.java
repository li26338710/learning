package com.elearning.api.dao.po;

import java.util.Date;

public class User {
    private Integer idUser;

    private String uName;

    private String uNickname;

    private String uLoginId;

    private String uPassword;

    private Integer uAge;

    private String uSex;

    private Date uRegistTime;

    private String uRegistIp;

    private String uEmail;

    private String uPhone;

    private Date createtime;

    private String createuser;

    private Date updatetime;

    private String updateuser;

    private Integer isActive;

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname;
    }

    public String getuLoginId() {
        return uLoginId;
    }

    public void setuLoginId(String uLoginId) {
        this.uLoginId = uLoginId;
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword;
    }

    public Integer getuAge() {
        return uAge;
    }

    public void setuAge(Integer uAge) {
        this.uAge = uAge;
    }

    public String getuSex() {
        return uSex;
    }

    public void setuSex(String uSex) {
        this.uSex = uSex;
    }

    public Date getuRegistTime() {
        return uRegistTime;
    }

    public void setuRegistTime(Date uRegistTime) {
        this.uRegistTime = uRegistTime;
    }

    public String getuRegistIp() {
        return uRegistIp;
    }

    public void setuRegistIp(String uRegistIp) {
        this.uRegistIp = uRegistIp;
    }

    public String getuEmail() {
        return uEmail;
    }

    public void setuEmail(String uEmail) {
        this.uEmail = uEmail;
    }

    public String getuPhone() {
        return uPhone;
    }

    public void setuPhone(String uPhone) {
        this.uPhone = uPhone;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getUpdateuser() {
        return updateuser;
    }

    public void setUpdateuser(String updateuser) {
        this.updateuser = updateuser;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }
}