package com.lhdb.game.service.impl;

import java.util.List;

import com.lhdb.game.dao.OrderDfMapper;
import com.lhdb.game.dao.OrderInfoMapper;
import com.lhdb.game.entity.OrderDf;
import com.lhdb.game.entity.OrderInfo;
import com.lhdb.game.service.OrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhdb.util.Page;
import com.lhdb.util.Response;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {
	
	@Autowired
	private OrderInfoMapper orderInfoMapper;
	@Autowired
	private OrderDfMapper orderDfMapper;
	
	/**
	 * @Title: æŸ¥è¯¢è®¢å�•è¯¦æƒ…åˆ—è¡¨
	 * @Description: 
	 * @param orderInfo
	 * @param pager
	 * @return
	 * @author Horst
	 * @date 2017å¹´7æœˆ11æ—¥ ä¸Šå�ˆ12:18:19
	 * @version V1.0
	 */
	public Response search(OrderInfo orderInfo, Page pager){
		Response response = new Response();
		orderInfo.setPager(pager);
		List<OrderInfo> list = orderInfoMapper.searchOnPage(orderInfo);
		int count = orderInfoMapper.count(orderInfo);
		pager.setTotalCount(count);
		response.setData(list);
		response.setParams(orderInfo);
		return response;
	}
	
	public Response searchDf(OrderInfo orderInfo, Page pager){
		Response response = new Response();
		orderInfo.setPager(pager);
		List<OrderDf> list = orderDfMapper.searchOnPage(orderInfo);
		int count = orderDfMapper.count(orderInfo);
		pager.setTotalCount(count);
		response.setData(list);
		response.setParams(orderInfo);
		return response;
	}

}
