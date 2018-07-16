package com.elearning.api.service;

import java.util.List;

import com.elearning.api.dao.po.Audio;
import com.elearning.api.dao.po.AudioInfo;

public interface AudioService {

	List<Audio> getAudio(Integer idCategory,Integer idAuthor,Integer idSource);


	List<Audio> getAudio(Integer categoryId);


	AudioInfo getAudioInfo(Integer id, Integer mode, String openid);

}
