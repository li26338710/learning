package com.elearning.api.web.controller;

import java.net.URLDecoder;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.elearning.api.service.RecorderService;
import com.elearning.api.web.controller.requestbean.RecorderRequestBean;

@Controller
@RequestMapping( "/recorder" )
public class RecorderController {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
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
    public int upload(HttpServletRequest request ,
    		@RequestParam("file") MultipartFile file, 
    		@RequestParam("openId") String openId, 
    		@RequestParam("nickname") String nickname,
    		@RequestParam("province") String province,
    		@RequestParam("city") String city,
    		@RequestParam("gender") String gender,
    		@RequestParam("seqno") String seqNo,
    		@RequestParam("idsubaudio") String idSubAudio) {
    	try {
    		openId = URLDecoder.decode(openId,"utf-8");
    		nickname  = URLDecoder.decode(nickname,"utf-8");
    		province = URLDecoder.decode(province,"utf-8");
    		city = URLDecoder.decode(city,"utf-8");
    		gender = URLDecoder.decode(gender,"utf-8");
    		seqNo = URLDecoder.decode(seqNo,"utf-8");
    		idSubAudio = URLDecoder.decode(idSubAudio,"utf-8");
    		
    		logger.debug("update Controller {} , {} ,{} ,{} ,{} ,{} ,{}", 
    				openId , nickname, province ,city , gender , seqNo , idSubAudio);
    		RecorderRequestBean requestBean = new RecorderRequestBean(openId , nickname , province ,city , gender , seqNo , idSubAudio);
    		
    		int result = recorderService.uploadRecordingFiles(file , requestBean);
    		
			return result;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
    }
    
    @RequestMapping(value = "/delete/{seqno}", method = RequestMethod.GET)
    public int delete(@PathVariable Integer seqno,@RequestParam("openid") String openid) {
    		
    	int result = recorderService.deleteRecorder(seqno , openid);
    		
		return result;
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
