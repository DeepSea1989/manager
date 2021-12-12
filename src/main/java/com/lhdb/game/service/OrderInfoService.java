package com.lhdb.game.service;

import com.lhdb.game.entity.OrderInfo;
import com.lhdb.util.Page;
import com.lhdb.util.Response;

public interface OrderInfoService {
	
	public Response search(OrderInfo orderInfo, Page pager);
	
	public Response searchDf(OrderInfo orderInfo, Page pager);

}
