package com.elearning.api.service.impl;

import org.h2.util.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.elearning.api.common.utils.FileUtils;
import com.elearning.api.service.RecorderService;
import com.elearning.api.web.controller.requestbean.RecorderRequestBean;

@Service
public class RecorderServiceImpl implements RecorderService{

	@Override
	public String uploadRecordingFiles(MultipartFile file, RecorderRequestBean requestBean) throws Exception {
		
		String result = FileUtils.upload(file);
		
		if(StringUtils.isNullOrEmpty(result)) {
			//TODO: Upload Failed
		}
		
		//TODO: insert or update Customer.
		
		//TODO: update login history
		
		//TODO: Update recording info to DB
		
		// TODO Auto-generated method stub
		return null;
	}

}
