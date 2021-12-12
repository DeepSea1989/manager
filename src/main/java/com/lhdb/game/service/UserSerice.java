package com.lhdb.game.service;

import javax.servlet.http.HttpServletRequest;

import com.lhdb.game.entity.User;
import com.lhdb.util.Page;
import com.lhdb.util.Response;
import com.lhdb.util.pojo.RecordOperation;

public interface UserSerice {
	
	/** 分页查询**/
	public Response search(User user, Page pager);
	
	/** 赠送金币**/
	public Response giveSocre(HttpServletRequest request, RecordOperation recordOperation, Long[] useridArray);
	
	/** 下金币**/
	public Response subSocre(HttpServletRequest request, RecordOperation recordOperation, Long[] useridArray);

	public Response online(User user, Page pager);
	
	public Response feng(Long[] useridArray);
	
	Response updatePwd(User user);
}
