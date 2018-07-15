package com.elearning.api.dao;

import com.elearning.api.dao.po.SubAudio;
import com.elearning.api.dao.po.SubAudioExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SubAudioMapper {
    int countByExample(SubAudioExample example);

    int deleteByExample(SubAudioExample example);

    int deleteByPrimaryKey(Integer idSubAudio);

    int insert(SubAudio record);

    int insertSelective(SubAudio record);

    List<SubAudio> selectByExample(SubAudioExample example);

    SubAudio selectByPrimaryKey(Integer idSubAudio);

    int updateByExampleSelective(@Param("record") SubAudio record, @Param("example") SubAudioExample example);

    int updateByExample(@Param("record") SubAudio record, @Param("example") SubAudioExample example);

    int updateByPrimaryKeySelective(SubAudio record);

    int updateByPrimaryKey(SubAudio record);
}