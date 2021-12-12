package com.lhdb.game.dao;

import com.lhdb.game.entity.RateScore;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RateScoreMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(RateScore record);

    int insertSelective(RateScore record);

    RateScore selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(RateScore record);

    int updateByPrimaryKey(RateScore record);
}