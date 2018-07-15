package com.elearning.api.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.elearning.api.common.utils.FileUtils;
import com.elearning.api.web.controller.requestbean.WXUserInfo;

@Controller
@RequestMapping( "/recorder" )
public class RecordFileUploadController {
	
	public static String FILE_TMP_PATH = "\\resource\\tmp";
	// 访问路径为：http://ip:port/upload
    @RequestMapping(value = "/upload", method = RequestMethod.GET)
    public String upload() {
        return "/fileupload";
    }
    /**
     * 文件上传具体实现方法（单文件上传）
     *
     * @param file
     * @return
     * 
     * @author 
     * @create 
     */
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    @ResponseBody
    //public String upload(HttpServletRequest request , @RequestParam("file") MultipartFile file, @RequestParam("userInfo") String userInfo) {
    public String upload(HttpServletRequest request ,
    		@RequestParam("file") MultipartFile file, 
    		@RequestParam("openId") String openId, 
    		@RequestParam("nickname") String nickname,
    		@RequestParam("province") String province,
    		@RequestParam("city") String city,
    		@RequestParam("gender") String gender) {
    	try {
			return FileUtils.upload(file);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
}
