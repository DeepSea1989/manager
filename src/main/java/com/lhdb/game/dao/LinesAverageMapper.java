package com.lhdb.game.dao;

import com.lhdb.game.entity.LinesAverage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LinesAverageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LinesAverage record);

    int insertSelective(LinesAverage record);

    LinesAverage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LinesAverage record);

    int updateByPrimaryKey(LinesAverage record);

    List<LinesAverage> selectByStage(String stage);

    List<LinesAverage> selectByStageNum(Integer stageNum);
}