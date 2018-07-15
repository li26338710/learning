package com.elearning.api.dao.po;

import java.util.Date;

public class SubAudio {
    private Integer idSubAudio;

    private Integer idSubType;

    private String idSubRole;

    private Integer idAudio;

    private Integer idSubIndex;

    private Integer idSubLength;

    private String aFilePath;

    private Double aSize;

    private String aRecommend;

    private Date createtime;

    private String createuser;

    private Date updatetime;

    private String updateuser;

    private Integer isActive;

    public Integer getIdSubAudio() {
        return idSubAudio;
    }

    public void setIdSubAudio(Integer idSubAudio) {
        this.idSubAudio = idSubAudio;
    }

    public Integer getIdSubType() {
        return idSubType;
    }

    public void setIdSubType(Integer idSubType) {
        this.idSubType = idSubType;
    }

    public String getIdSubRole() {
        return idSubRole;
    }

    public void setIdSubRole(String idSubRole) {
        this.idSubRole = idSubRole;
    }

    public Integer getIdAudio() {
        return idAudio;
    }

    public void setIdAudio(Integer idAudio) {
        this.idAudio = idAudio;
    }

    public Integer getIdSubIndex() {
        return idSubIndex;
    }

    public void setIdSubIndex(Integer idSubIndex) {
        this.idSubIndex = idSubIndex;
    }

    public Integer getIdSubLength() {
        return idSubLength;
    }

    public void setIdSubLength(Integer idSubLength) {
        this.idSubLength = idSubLength;
    }

    public String getaFilePath() {
        return aFilePath;
    }

    public void setaFilePath(String aFilePath) {
        this.aFilePath = aFilePath;
    }

    public Double getaSize() {
        return aSize;
    }

    public void setaSize(Double aSize) {
        this.aSize = aSize;
    }

    public String getaRecommend() {
        return aRecommend;
    }

    public void setaRecommend(String aRecommend) {
        this.aRecommend = aRecommend;
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