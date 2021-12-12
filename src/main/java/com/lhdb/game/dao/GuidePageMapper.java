package com.lhdb.game.dao;

import com.lhdb.game.entity.GuidePage;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface GuidePageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GuidePage record);

    int insertSelective(GuidePage record);

    GuidePage selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GuidePage record);

    int updateByPrimaryKey(GuidePage record);

    int deleteByIds(String[] arr);

    int updateGuidePage(GuidePage page);

    List<GuidePage> queryGuidePage(Map<String, Object> map);
}