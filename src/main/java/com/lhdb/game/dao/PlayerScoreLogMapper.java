package com.lhdb.game.dao;

import com.lhdb.game.entity.PlayerScoreLog;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PlayerScoreLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PlayerScoreLog record);

    int insertSelective(PlayerScoreLog record);

    PlayerScoreLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(PlayerScoreLog record);

    int updateByPrimaryKey(PlayerScoreLog record);

    List<PlayerScoreLog> queryPlayerScoreLog(Map<String, Object> map);
}