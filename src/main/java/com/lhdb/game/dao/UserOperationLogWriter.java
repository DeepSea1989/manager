package com.lhdb.game.dao;

import com.lhdb.game.entity.UserOperatationLog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
public interface UserOperationLogWriter {

	public void addLog(UserOperatationLog log);
	
}
