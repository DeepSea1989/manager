package com.lhdb.game.service;

import com.lhdb.util.Page;
import com.lhdb.util.Response;
import com.lhdb.util.pojo.ParamUtilVO;

public interface JewelDownLogService {
	
	public Response search(ParamUtilVO paramUtilVO, Page pager);

}
