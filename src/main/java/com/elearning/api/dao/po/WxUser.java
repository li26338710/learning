package com.elearning.api.dao.po;

import java.util.Date;

public class WxUser {
    private Integer idWxuser;

    private String uOpenid;

    private String uNickname;

    private String uProvince;

    private String uCountry;

    private String uCity;

    private String uAvatarurl;

    private Integer uGender;

    private Date createtime;

    private String createuser;

    private Date updatetime;

    private String updateuser;

    private Integer isActive;

    public Integer getIdWxuser() {
        return idWxuser;
    }

    public void setIdWxuser(Integer idWxuser) {
        this.idWxuser = idWxuser;
    }

    public String getuOpenid() {
        return uOpenid;
    }

    public void setuOpenid(String uOpenid) {
        this.uOpenid = uOpenid;
    }

    public String getuNickname() {
        return uNickname;
    }

    public void setuNickname(String uNickname) {
        this.uNickname = uNickname;
    }

    public String getuProvince() {
        return uProvince;
    }

    public void setuProvince(String uProvince) {
        this.uProvince = uProvince;
    }

    public String getuCountry() {
        return uCountry;
    }

    public void setuCountry(String uCountry) {
        this.uCountry = uCountry;
    }

    public String getuCity() {
        return uCity;
    }

    public void setuCity(String uCity) {
        this.uCity = uCity;
    }

    public String getuAvatarurl() {
        return uAvatarurl;
    }

    public void setuAvatarurl(String uAvatarurl) {
        this.uAvatarurl = uAvatarurl;
    }

    public Integer getuGender() {
        return uGender;
    }

    public void setuGender(Integer uGender) {
        this.uGender = uGender;
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