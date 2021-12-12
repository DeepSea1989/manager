package com.lhdb.game.service;

import com.lhdb.game.entity.MGiveScoreLog;
import com.lhdb.util.Page;
import com.lhdb.util.Response;

public interface TakeScoreLogService {
	
	public Response search(MGiveScoreLog log, Page pager);

}
