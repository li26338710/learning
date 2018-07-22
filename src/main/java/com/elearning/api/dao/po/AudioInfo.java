package com.elearning.api.dao.po;

import java.util.List;
import java.util.Map;

public class AudioInfo {

	private Integer idAudio;
	
	private Integer seqNo;
	
	private Map<String, Long> audioRole;

	private List<AudioTrack> audioTrackList;
	
	//private List<AudioTrack> audioRecordList;
	private Map<Integer ,List<AudioTrack>> audioRecordList;

	public Integer getIdAudio() {
		return idAudio;
	}

	public void setIdAudio(Integer idAudio) {
		this.idAudio = idAudio;
	}

	public List<AudioTrack> getAudioTrackList() {
		return audioTrackList;
	}

	public void setAudioTrackList(List<AudioTrack> audioTrackList) {
		this.audioTrackList = audioTrackList;
	}

	public Map<Integer, List<AudioTrack>> getAudioRecordList() {
		return audioRecordList;
	}

	public void setAudioRecordList(Map<Integer, List<AudioTrack>> audioRecordList) {
		this.audioRecordList = audioRecordList;
	}

	public Integer getSeqNo() {
		return seqNo;
	}

	public void setSeqNo(Integer seqNo) {
		this.seqNo = seqNo;
	}

	public Map<String, Long> getAudioRole() {
		return audioRole;
	}

	public void setAudioRole(Map<String, Long> audioRole) {
		this.audioRole = audioRole;
	}

}
