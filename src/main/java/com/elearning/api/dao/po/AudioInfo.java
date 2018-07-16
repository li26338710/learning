package com.elearning.api.dao.po;

import java.util.List;

public class AudioInfo {

	private Integer idAudio;

	private List<AudioTrack> audioTrackList;
	
	private List<AudioTrack> audioRecordList;

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

	public List<AudioTrack> getAudioRecordList() {
		return audioRecordList;
	}

	public void setAudioRecordList(List<AudioTrack> audioRecordList) {
		this.audioRecordList = audioRecordList;
	}
	
	
}
