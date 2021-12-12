package com.lhdb.game.service;

import com.lhdb.util.Response;
import com.lhdb.util.pojo.StockModel;

public interface StockService {
	
	Response search();
	
	Response update(StockModel model);

}
