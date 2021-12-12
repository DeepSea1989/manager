package com.lhdb.game.dao;

import com.lhdb.game.entity.Player;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface PlayerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Player record);

    int insertSelective(Player record);

    Player selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Player record);

    int updateByPrimaryKey(Player record);

    List<Player> queryUserNameAndPassword(String username, String password);

    List<Player> queryPlayer(Map<String,Object> data);

    int updatePlayerState(Map<String,Object> data);

    int updatePlayer(Player record);

    Player queryUserName(String username);
}