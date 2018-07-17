package com.elearning.api.dao;

import com.elearning.api.dao.po.WxUser;
import com.elearning.api.dao.po.WxUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WxUserMapper {
    int countByExample(WxUserExample example);

    int deleteByExample(WxUserExample example);

    int deleteByPrimaryKey(Integer idWxuser);

    int insert(WxUser record);

    int insertSelective(WxUser record);

    List<WxUser> selectByExample(WxUserExample example);

    WxUser selectByPrimaryKey(Integer idWxuser);

    int updateByExampleSelective(@Param("record") WxUser record, @Param("example") WxUserExample example);

    int updateByExample(@Param("record") WxUser record, @Param("example") WxUserExample example);

    int updateByPrimaryKeySelective(WxUser record);

    int updateByPrimaryKey(WxUser record);
}