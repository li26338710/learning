package com.elearning.api.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.elearning.api.service.RecorderService;
import com.elearning.api.web.controller.requestbean.RecorderRequestBean;

@Controller
@RequestMapping( "/recorder" )
public class RecordFileUploadController {
	
	public static String FILE_TMP_PATH = "\\resource\\tmp";
	
    @Autowired
    private RecorderService recorderService ;
	
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
    		@RequestParam("gender") String gender,
    		@RequestParam("seqno") String seqNo,
    		@RequestParam("idsubaudio") String idSubAudio) {
    	try {
    		
    		RecorderRequestBean requestBean = new RecorderRequestBean(openId , nickname , province,city , gender , seqNo , idSubAudio);
    		
    		String result = recorderService.uploadRecordingFiles(file , requestBean);
    		
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
    
//    @RequestMapping(value = "/upload", method = RequestMethod.POST)
//    @ResponseBody
//    //public String upload(HttpServletRequest request , @RequestParam("file") MultipartFile file, @RequestParam("userInfo") String userInfo) {
//    public String upload(HttpServletRequest request ,
//    		@RequestParam("file") MultipartFile file, 
//    		@RequestBody RecorderRequestBean recorderInfo) {
//    	try {
//    		
//    		
//    		String result = recorderService.uploadRecordingFiles(file , recorderInfo);
//    		
//			return result;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return null;
//    }
}
