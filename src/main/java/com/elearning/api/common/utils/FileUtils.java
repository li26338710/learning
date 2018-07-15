package com.elearning.api.common.utils;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public class FileUtils {
	
    public static String upload(
    		@RequestParam("file") MultipartFile file 
    		
    		) throws Exception {
    	String filePath = "";
        if (!file.isEmpty()) {
            try {
                // 这里只是简单例子，文件直接输出到项目路径下。
                // 实际项目中，文件需要输出到指定位置，需要在增加代码处理。
                // 还有关于文件格式限制、文件大小限制，详见：中配置。
            	filePath = CommonUtils.getTempFilePath(CommonUtils.randomString(16)+".mp3");
                BufferedOutputStream out = new BufferedOutputStream(
                        new FileOutputStream(new File(filePath)));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return filePath;
            } catch (IOException e) {
                e.printStackTrace();
                return filePath;
            }
            return filePath;
        } else {
            return filePath;
        }
    }
    
    /** 
     * 新建目录 
     */  
    public static boolean newDir(String path) throws Exception {  
    	File file = new File(path);
        
        return file.mkdirs();//创建目录  
    }  
      
    /** 
     * 删除目录 
     */  
    public static boolean deleteDir(String path) throws Exception {  
        File file = new File(path);  
        if (!file.exists())  
            return false;// 目录不存在退出  
        if (file.isFile()) // 如果是文件删除  
        {  
            file.delete();  
            return false;  
        }  
        File[] files = file.listFiles();// 如果目录中有文件递归删除文件  
        for (int i = 0; i < files.length; i++) {  
            deleteDir(files[i].getAbsolutePath());  
        }  
        file.delete();  
          
        return file.delete();//删除目录  
    }  
  
    /** 
     * 更新目录 
     */  
    public static boolean updateDir(String path, String newPath) throws Exception {  
        File file = new File(path);  
        File newFile = new File(newPath);  
        return file.renameTo(newFile);  
    }  
    
}
