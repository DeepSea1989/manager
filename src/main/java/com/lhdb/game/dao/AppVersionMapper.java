package com.lhdb.game.dao;

import com.lhdb.game.entity.AppVersion;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AppVersionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(AppVersion record);

    int insertSelective(AppVersion record);

    AppVersion selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(AppVersion record);

    int updateByPrimaryKey(AppVersion record);

    int updateAppVersion(AppVersion record);
}