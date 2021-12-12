package com.lhdb.game.dao;

import com.lhdb.game.entity.UserOperationLog;

public interface UserOperationLogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserOperationLog record);

    int insertSelective(UserOperationLog record);

    UserOperationLog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserOperationLog record);

    int updateByPrimaryKey(UserOperationLog record);
}