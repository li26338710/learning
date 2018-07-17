package com.elearning.api.dao.po;

import java.util.Date;

public class Recording {
    private Integer idRecording;

    private Integer idSubAudio;

    private Integer idWxuser;

    private Integer rSeqNo;

    private Date rRecordTime;

    private String rFilePath;

    private String rFileSize;

    private String rClientip;

    private String rClientapp;

    private Date createtime;

    private String createuser;

    private Date updatetime;

    private String updateuser;

    private Integer isActive;

    public Integer getIdRecording() {
        return idRecording;
    }

    public void setIdRecording(Integer idRecording) {
        this.idRecording = idRecording;
    }

    public Integer getIdSubAudio() {
        return idSubAudio;
    }

    public void setIdSubAudio(Integer idSubAudio) {
        this.idSubAudio = idSubAudio;
    }

    public Integer getIdWxuser() {
        return idWxuser;
    }

    public void setIdWxuser(Integer idWxuser) {
        this.idWxuser = idWxuser;
    }

    public Integer getrSeqNo() {
        return rSeqNo;
    }

    public void setrSeqNo(Integer rSeqNo) {
        this.rSeqNo = rSeqNo;
    }

    public Date getrRecordTime() {
        return rRecordTime;
    }

    public void setrRecordTime(Date rRecordTime) {
        this.rRecordTime = rRecordTime;
    }

    public String getrFilePath() {
        return rFilePath;
    }

    public void setrFilePath(String rFilePath) {
        this.rFilePath = rFilePath;
    }

    public String getrFileSize() {
        return rFileSize;
    }

    public void setrFileSize(String rFileSize) {
        this.rFileSize = rFileSize;
    }

    public String getrClientip() {
        return rClientip;
    }

    public void setrClientip(String rClientip) {
        this.rClientip = rClientip;
    }

    public String getrClientapp() {
        return rClientapp;
    }

    public void setrClientapp(String rClientapp) {
        this.rClientapp = rClientapp;
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