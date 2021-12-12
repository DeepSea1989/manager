package com.lhdb.game.dao;

import com.lhdb.game.entity.ModulePermission;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface ModulePermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ModulePermission record);

    int insertSelective(ModulePermission record);

    ModulePermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ModulePermission record);

    int updateByPrimaryKey(ModulePermission record);
}