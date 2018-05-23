package com.elearning.api.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.elearning.api.dao.po.Audio;
import com.elearning.api.service.AudioService;

@RestController
@RequestMapping( "/audio" )
public class AudioController {

	private Logger logger = LoggerFactory.getLogger(this.getClass()); 
	
    @Autowired
    private AudioService audioService ;
    
	 @RequestMapping( "/list" )
     public List<Audio> getAudio(){
        return audioService.getAudio(null , null , null);
    }
	 
	 @RequestMapping( "/list/{categoryId}" )
     public Audio getAudioByCategory(@PathVariable String categoryId){
        return audioService.getAudio(categoryId);
    }
}
