package com.elearning.api.service.impl;

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
	public Audio getAudio() {
		
		Audio a = new Audio();
		a.setIdAudio(1);
		a.setIsActive(1);
		
		a = audioDao.selectByPrimaryKey(a);
		return a;
	}

	@Override
	public Audio getAudio(String categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
