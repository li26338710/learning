package com.elearning.api.common.utils;

import java.io.FileNotFoundException;
import java.util.Date;

import org.springframework.util.ResourceUtils;

public class CommonUtils {
	
	public static String SLASH = "/";

	public static String getTempFilePath(String filename) {
		
		String nowdate = DateUtils.dateToString(new Date());
		
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
	
}
