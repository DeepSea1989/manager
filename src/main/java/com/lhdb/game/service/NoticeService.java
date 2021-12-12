package com.lhdb.game.service;

import com.lhdb.game.mongo.entity.UserNotice;
import com.lhdb.util.Page;
import com.lhdb.util.Response;

public interface NoticeService {
	
	public Response search(Page pager);
	
	public Response save(UserNotice notice);
	
	public Response findByUserId(UserNotice notice);
	
	public Response update(UserNotice notice);
	
	public Response delete(UserNotice notice);

}
