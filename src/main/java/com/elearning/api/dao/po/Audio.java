package com.elearning.api.dao.po;

import java.util.Date;

public class Audio {
    private Integer idAudio;

    private Integer idCategory;

    private Integer idAuthor;

    private Integer idSource;

    private String aName;

    private String aEName;

    private Integer aTracks;

    private Double aSize;

    private String aRecommend;

    private Date createtime;

    private String createuser;

    private Date updatetime;

    private String updateuser;
    private String aCover;
    private String cName;
    private String cType;
    private String auName;
    private String sName;
    private String sType;
    private String sYear;

    private Integer isActive;

    public Integer getIdAudio() {
        return idAudio;
    }

    public void setIdAudio(Integer idAudio) {
        this.idAudio = idAudio;
    }

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

    public Integer getaTracks() {
        return aTracks;
    }

    public void setaTracks(Integer aTracks) {
        this.aTracks = aTracks;
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

	public String getaCover() {
		return aCover;
	}

	public void setaCover(String aCover) {
		this.aCover = aCover;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getcType() {
		return cType;
	}

	public void setcType(String cType) {
		this.cType = cType;
	}

	public String getAuName() {
		return auName;
	}

	public void setAuName(String auName) {
		this.auName = auName;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public String getsType() {
		return sType;
	}

	public void setsType(String sType) {
		this.sType = sType;
	}

	public String getsYear() {
		return sYear;
	}

	public void setsYear(String sYear) {
		this.sYear = sYear;
	}
    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }   
}