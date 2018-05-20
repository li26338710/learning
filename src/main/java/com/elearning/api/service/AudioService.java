package com.elearning.api.service;

import com.elearning.api.dao.po.Audio;

public interface AudioService {

	Audio getAudio();


	Audio getAudio(String categoryId);

}
