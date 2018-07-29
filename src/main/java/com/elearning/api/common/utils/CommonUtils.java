package com.elearning.api.common.utils;

import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;

import org.springframework.util.ResourceUtils;

import com.elearning.api.common.constatns.CommonConstant;

public class CommonUtils {
	

	public static String getTempFilePath(String filename) throws Exception {
		
		String nowdate = DateUtils.dateToString(new Date());
		
		FileUtils.newDir(CommonConstant.STATIC_RESOURCE_PATH + CommonConstant.RECORDING_FILE_PATH + CommonConstant.SLASH + nowdate);
		
		// return CommonConstant.RECORDING_FILE_PATH + nowdate + CommonConstant.SLASH + filename;
		return CommonConstant.RECORDING_FILE_PATH + CommonConstant.SLASH + nowdate + CommonConstant.SLASH + filename;
	}
	
	public static String getContextPath(){
		
		String result = "";
		try {
			result = ResourceUtils.getURL("classpath:").getPath();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return result;
		}
		
		return result;
	}
	
	/** 产生一个随机的字符串*/  
	public static String randomString(int length) {  
	    String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";  
	    Random random = new Random();  
	    StringBuffer buf = new StringBuffer();  
	    for (int i = 0; i < length; i++) {  
	        int num = random.nextInt(62);  
	        buf.append(str.charAt(num));  
	    }  
	    return buf.toString();  
	} 

	
}
