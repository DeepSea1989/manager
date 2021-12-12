package com.lhdb.game.dao;

import com.lhdb.game.entity.ScoreAverage;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
public interface ScoreAverageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ScoreAverage record);

    int insertSelective(ScoreAverage record);

    ScoreAverage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ScoreAverage record);

    int updateByPrimaryKey(ScoreAverage record);

    List<ScoreAverage> selectByStage(String stage);

    List<ScoreAverage> selectByStageNum(Integer stageNum);
}