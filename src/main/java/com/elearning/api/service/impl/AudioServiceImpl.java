package com.elearning.api.service.impl;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.api.dao.AudioMapper;
import com.elearning.api.dao.po.Audio;
import com.elearning.api.dao.po.AudioInfo;
import com.elearning.api.dao.po.AudioTrack;
import com.elearning.api.service.AudioService;

@Service
public class AudioServiceImpl implements AudioService{

	@Autowired
	private AudioMapper audioDao;

	@Override
	public List<Audio> getAudio(Integer idCategory,Integer idAuthor,Integer idSource) {
		
		List<Audio> audioList = audioDao.getAudioList(idCategory, idAuthor, idSource);
		
		return audioList;
	}

	@Override
	public List<Audio>  getAudio(Integer categoryId) {
		List<Audio> audioList = audioDao.getAudioList(categoryId, null, null);
		
		return audioList;
	}

	@Override
	public AudioInfo getAudioInfo(Integer id, Integer mode, String openid) {
		
		AudioInfo audioInfo = new AudioInfo();
		
		// Get all sub audio for this audio.
		List<AudioTrack> audioTrackList = audioDao.getAudioInfo(id);
		
		// Get all recording for this user audio.
		List<AudioTrack> audioRecordList = audioDao.getRecordingInfo(id , openid);
		
		Map<Integer, List<AudioTrack>> audioRecordLists = audioRecordList.stream().collect(Collectors.groupingBy(AudioTrack::getrSeqNo));
		
		for (List<AudioTrack> tmpList : audioRecordLists.values()) {

			audioTrackList.stream().forEach(p -> {
				if (!tmpList.contains(p)) {
					tmpList.add(p.getSubAudioIndex(), p);
				}
			});
		}
		Map<String, Long> roleInfo = audioTrackList.stream().collect(Collectors.groupingBy(AudioTrack::getSubAudioRole,Collectors.counting()));
		Optional<AudioTrack> seqNoMaxTrack=audioRecordList.stream().collect(Collectors.maxBy(Comparator.comparing(AudioTrack::getrSeqNo)));
		
		audioInfo.setIdAudio(id);
		audioInfo.setAudioRole(roleInfo);
		audioInfo.setSeqNo(seqNoMaxTrack.get().getrSeqNo());
		audioInfo.setAudioTrackList(audioTrackList);
		audioInfo.setAudioRecordList(audioRecordLists);
		
		return audioInfo;
	}

}
