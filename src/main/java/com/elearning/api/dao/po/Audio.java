package com.elearning.api.dao.po;

import java.util.Date;

public class Audio extends AudioKey {
    private Integer idCategory;

    private Integer idAuthor;

    private Integer idSource;

    private String aName;

    private String aEName;

    private String aFilePath;

    private Double aSize;

    private String aRecommend;

    private Date createtime;

    private String createuser;

    private Date updatetime;

    private String updateuser;

    public Integer getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(Integer idCategory) {
        this.idCategory = idCategory;
    }

    public Integer getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    public Integer getIdSource() {
        return idSource;
    }

    public void setIdSource(Integer idSource) {
        this.idSource = idSource;
    }

    public String getaName() {
        return aName;
    }

    public void setaName(String aName) {
        this.aName = aName;
    }

    public String getaEName() {
        return aEName;
    }

    public void setaEName(String aEName) {
        this.aEName = aEName;
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
}