package com.elearning.api.dao.po;

public class AudioTrack {

	private int idAudio;
	private int idSubAudio;
	private int subAudioType;
	private String subAudioRole;
	private String subAudioRoleComment;
	private int subAudioIndex;
	private int subAudioLength;
	private String rFilePath;
	private String rFileSize;
	private int rSeqNo;
	
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
	public int getrSeqNo() {
		return rSeqNo;
	}
	public void setrSeqNo(int rSeqNo) {
		this.rSeqNo = rSeqNo;
	}
	public int getSubAudioType() {
		return subAudioType;
	}
	public void setSubAudioType(int subAudioType) {
		this.subAudioType = subAudioType;
	}
	public String getSubAudioRole() {
		return subAudioRole;
	}
	public void setSubAudioRole(String subAudioRole) {
		this.subAudioRole = subAudioRole;
	}
	public String getSubAudioRoleComment() {
		return subAudioRoleComment;
	}
	public void setSubAudioRoleComment(String subAudioRoleComment) {
		this.subAudioRoleComment = subAudioRoleComment;
	}
	public int getSubAudioIndex() {
		return subAudioIndex;
	}
	public void setSubAudioIndex(int subAudioIndex) {
		this.subAudioIndex = subAudioIndex;
	}
	public int getSubAudioLength() {
		return subAudioLength;
	}
	public void setSubAudioLength(int subAudioLength) {
		this.subAudioLength = subAudioLength;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idAudio;
		result = prime * result + subAudioIndex;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		AudioTrack other = (AudioTrack) obj;
		if (idAudio != other.idAudio)
			return false;
		if (subAudioIndex != other.subAudioIndex)
			return false;
		return true;
	}
	
	
}
