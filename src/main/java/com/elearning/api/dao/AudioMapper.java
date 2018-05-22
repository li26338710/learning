package com.elearning.api.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.elearning.api.dao.po.Audio;
import com.elearning.api.dao.po.AudioExample;
import com.elearning.api.dao.po.AudioKey;

@Mapper
public interface AudioMapper {
    int countByExample(AudioExample example);

    int deleteByExample(AudioExample example);

    int deleteByPrimaryKey(AudioKey key);

    int insert(Audio record);

    int insertSelective(Audio record);

    List<Audio> selectByExample(AudioExample example);

    Audio selectByPrimaryKey(AudioKey key);

    int updateByExampleSelective(@Param("record") Audio record, @Param("example") AudioExample example);

    int updateByExample(@Param("record") Audio record, @Param("example") AudioExample example);

    int updateByPrimaryKeySelective(Audio record);

    int updateByPrimaryKey(Audio record);
    
    List<Audio> getAudioList(@Param("idCategory") Integer idCategory,@Param("idAuthor") Integer idAuthor,@Param("idSource") Integer idSource);
}