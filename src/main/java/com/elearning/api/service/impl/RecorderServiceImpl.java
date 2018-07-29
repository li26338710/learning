package com.elearning.api.service.impl;

import java.util.Date;

import org.h2.util.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.elearning.api.common.constatns.CommonConstant;
import com.elearning.api.common.utils.FileUtils;
import com.elearning.api.dao.RecordingMapper;
import com.elearning.api.dao.WxUserMapper;
import com.elearning.api.dao.po.Recording;
import com.elearning.api.dao.po.WxUser;
import com.elearning.api.service.RecorderService;
import com.elearning.api.web.controller.requestbean.RecorderRequestBean;

@Service
public class RecorderServiceImpl implements RecorderService{

	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
	@Autowired
	private RecordingMapper recordingDao;
	
	@Autowired
	private WxUserMapper wxUserDao;
	
	@Override
	public int uploadRecordingFiles(MultipartFile file, RecorderRequestBean requestBean) throws Exception {
		
		int updateResult = 0;
		
		String result = FileUtils.upload(file);
		
		logger.debug("Upload result. {} ", result);
		
		if(StringUtils.isNullOrEmpty(result)) {
			return updateResult;
		}
		
		int existed = wxUserDao.checkExisted(requestBean.getOpenId());
		WxUser user = createWxUserBean(requestBean);
		
		logger.debug("User is existed. {} ", existed);
		
		if(existed > 0) {
			updateResult = wxUserDao.updateUser(user);
		}else {
			updateResult = wxUserDao.insertSelective(user);
		}
		
		logger.debug("User update result. {} ", updateResult);
		
		//TODO: update login history
		
		//TODO: Update recording info to DB
		Recording record = createRecordBean(requestBean , user , result);
		updateResult = recordingDao.insertSelective(record);
		
		logger.debug("File info save to DB result. {} ,nickname:{} , seqno:{}", updateResult , requestBean.getNickname() , requestBean.getSeqNo());
		
		return updateResult;
	}
	
	@Override
	public int deleteRecorder(Integer seqno, String openid) {
		int result = recordingDao.deleteRecorderBySeqno(seqno , openid, new Date(), CommonConstant.USER_NAME);
		return result;
	}
	
	private Recording createRecordBean(RecorderRequestBean requestBean, WxUser user, String result) {
		Recording record = new Recording();
		
		record.setrSeqNo(Integer.parseInt(requestBean.getSeqNo()));
		record.setIdSubAudio(Integer.parseInt(requestBean.getIdSubAudio()));
		record.setIdWxuser(user.getIdWxuser());
		record.setrFilePath(result);
		record.setrRecordTime(new Date());
		record.setCreatetime(new Date());
		record.setUpdatetime(new Date());
		record.setCreateuser(CommonConstant.USER_NAME);
		record.setUpdateuser(CommonConstant.USER_NAME);
		record.setIsActive(1);
		
		return record;
	}

	private WxUser createWxUserBean(RecorderRequestBean requestBean) {
		
		WxUser user = new WxUser();
		user.setuOpenid(requestBean.getOpenId());
		
		user.setuCity(requestBean.getCity());
		user.setuGender(Integer.parseInt(requestBean.getGender()));
		user.setuNickname(requestBean.getNickname());
		user.setuProvince(requestBean.getProvince());
		
		user.setCreatetime(new Date());
		user.setUpdatetime(new Date());
		
		user.setCreateuser(CommonConstant.USER_NAME);
		user.setUpdateuser(CommonConstant.USER_NAME);
		user.setIsActive(1);
		return user;
	}


}
