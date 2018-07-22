package com.elearning.api.dao.po;

import java.util.Date;

public class SubAudio {
    private Integer idSubAudio;

    private Integer idAudio;

    private Integer subAudioType;

    private Integer subAudioRole;

    private String subAudioRoleComment;

    private Integer subAudioIndex;

    private Integer subAudioLength;

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

    public Integer getIdAudio() {
        return idAudio;
    }

    public void setIdAudio(Integer idAudio) {
        this.idAudio = idAudio;
    }

    public Integer getSubAudioType() {
        return subAudioType;
    }

    public void setSubAudioType(Integer subAudioType) {
        this.subAudioType = subAudioType;
    }

    public Integer getSubAudioRole() {
        return subAudioRole;
    }

    public void setSubAudioRole(Integer subAudioRole) {
        this.subAudioRole = subAudioRole;
    }

    public String getSubAudioRoleComment() {
        return subAudioRoleComment;
    }

    public void setSubAudioRoleComment(String subAudioRoleComment) {
        this.subAudioRoleComment = subAudioRoleComment;
    }

    public Integer getSubAudioIndex() {
        return subAudioIndex;
    }

    public void setSubAudioIndex(Integer subAudioIndex) {
        this.subAudioIndex = subAudioIndex;
    }

    public Integer getSubAudioLength() {
        return subAudioLength;
    }

    public void setSubAudioLength(Integer subAudioLength) {
        this.subAudioLength = subAudioLength;
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