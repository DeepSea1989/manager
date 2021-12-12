package com.lhdb.game.dao;

import com.lhdb.game.entity.ShareSetting;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ShareSettingMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ShareSetting record);

    int insertSelective(ShareSetting record);

    ShareSetting selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ShareSetting record);

    int updateByPrimaryKey(ShareSetting record);
}