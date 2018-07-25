package com.elearning.api.service;

import org.springframework.web.multipart.MultipartFile;

import com.elearning.api.web.controller.requestbean.RecorderRequestBean;

public interface RecorderService {

	int uploadRecordingFiles(MultipartFile file, RecorderRequestBean requestBean) throws Exception;

	int deleteRecorder(Integer seqno, String openid);

}
