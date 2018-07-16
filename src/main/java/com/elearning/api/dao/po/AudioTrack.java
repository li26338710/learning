package com.elearning.api.dao.po;

public class AudioTrack {

	private int idAudio;
	private int idSubAudio;
	private int idSubType;
	private String idSubRole;
	private int idSubIndex;
	private int idSubLength;
	private String rFilePath;
	private String rFileSize;
	
	public int getIdAudio() {
		return idAudio;
	}
	public void setIdAudio(int idAudio) {
		this.idAudio = idAudio;
	}
	public int getIdSubAudio() {
		return idSubAudio;
	}
	public void setIdSubAudio(int idSubAudio) {
		this.idSubAudio = idSubAudio;
	}
	public int getIdSubType() {
		return idSubType;
	}
	public void setIdSubType(int idSubType) {
		this.idSubType = idSubType;
	}
	public String getIdSubRole() {
		return idSubRole;
	}
	public void setIdSubRole(String idSubRole) {
		this.idSubRole = idSubRole;
	}
	public int getIdSubIndex() {
		return idSubIndex;
	}
	public void setIdSubIndex(int idSubIndex) {
		this.idSubIndex = idSubIndex;
	}
	public int getIdSubLength() {
		return idSubLength;
	}
	public void setIdSubLength(int idSubLength) {
		this.idSubLength = idSubLength;
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
	
	
}
