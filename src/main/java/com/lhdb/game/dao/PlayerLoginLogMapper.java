package com.lhdb.game.dao;

import com.lhdb.game.entity.PlayerLoginLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PlayerLoginLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlayerLoginLog record);

    int insertSelective(PlayerLoginLog record);

    PlayerLoginLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlayerLoginLog record);

    int updateByPrimaryKey(PlayerLoginLog record);

    List<PlayerLoginLog> queryPlayerLoginLog(Map<String,Object> map);
}