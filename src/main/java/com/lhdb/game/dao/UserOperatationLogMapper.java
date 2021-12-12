package com.lhdb.game.dao;

import com.lhdb.game.entity.UserOperatationLog;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserOperatationLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserOperatationLog record);

    int insertSelective(UserOperatationLog record);

    UserOperatationLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserOperatationLog record);

    int updateByPrimaryKey(UserOperatationLog record);
}