package com.elearning.api.dao;

import com.elearning.api.dao.po.Recording;
import com.elearning.api.dao.po.RecordingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecordingMapper {
    int countByExample(RecordingExample example);

    int deleteByExample(RecordingExample example);

    int deleteByPrimaryKey(Integer idRecording);

    int insert(Recording record);

    int insertSelective(Recording record);

    List<Recording> selectByExample(RecordingExample example);

    Recording selectByPrimaryKey(Integer idRecording);

    int updateByExampleSelective(@Param("record") Recording record, @Param("example") RecordingExample example);

    int updateByExample(@Param("record") Recording record, @Param("example") RecordingExample example);

    int updateByPrimaryKeySelective(Recording record);

    int updateByPrimaryKey(Recording record);
}