package com.elearning.api.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.elearning.api.dao.AudioMapper;
import com.elearning.api.dao.po.Audio;
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

}
