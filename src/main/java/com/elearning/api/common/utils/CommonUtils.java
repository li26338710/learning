package com.elearning.api.common.utils;

import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Random;

import org.springframework.util.ResourceUtils;

public class CommonUtils {
	
	public static String SLASH = "/";

	public static String getTempFilePath(String filename) throws Exception {
		
		String nowdate = DateUtils.dateToString(new Date());
		
		FileUtils.newDir(getContextPath() + SLASH + nowdate);
		
		return getContextPath() + SLASH + nowdate + SLASH + filename;
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
