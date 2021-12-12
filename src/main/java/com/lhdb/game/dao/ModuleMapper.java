package com.lhdb.game.dao;

import com.lhdb.game.entity.Module;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ModuleMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Module record);

    int insertSelective(Module record);

    Module selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Module record);

    int updateByPrimaryKey(Module record);
}