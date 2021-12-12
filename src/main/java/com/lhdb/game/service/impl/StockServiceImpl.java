package com.lhdb.game.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.lhdb.game.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lhdb.game.redis.RedisInitDao;
import com.lhdb.game.redis.RedisKey;
import com.lhdb.util.Response;
import com.lhdb.util.pojo.StockModel;

@Service
public class StockServiceImpl implements StockService {
	
	@Autowired
	private RedisInitDao redisInitDao;
	
	/**
	 * @Title: æŸ¥è¯¢åº“å­˜
	 * @Description: 
	 * @return
	 * @author Horst
	 * @date 2017å¹´1æœˆ12æ—¥ ä¸‹å�ˆ11:44:07
	 * @version V1.0
	 */
	public Response search(){
		Response response = new Response();
		double bigPool = redisInitDao.getRedisKey(RedisKey.REDIS_BIG_POOL);
		double bigPoolRate = redisInitDao.getRedisKey(RedisKey.REDIS_BIG_RATE_POOL);
		double incomePool = redisInitDao.getRedisKey(RedisKey.REDIS_INCOME_POOL);
		double incomePoolRate = redisInitDao.getRedisKey(RedisKey.REDIS_INCOME_RATE_POOL);
		double smallPool = redisInitDao.getRedisKey(RedisKey.REDIS_SMALL_POOL);
		double smallPoolRate = redisInitDao.getRedisKey(RedisKey.REDIS_SMALL_RATE_POOL);
		List<StockModel> list = new ArrayList<StockModel>();
		StockModel s1 = new StockModel();
		s1.setScore(bigPool);
		s1.setRate(bigPoolRate);
		list.add(s1);
		StockModel s2 = new StockModel();
		s2.setScore(incomePool);
		s2.setRate(incomePoolRate);
		list.add(s2);
		StockModel s3 = new StockModel();
		s3.setScore(smallPool);
		s3.setRate(smallPoolRate);
		list.add(s3);
		response.setData(list);
		return response;
	}
	
	public Response update(StockModel model){
		Response response = new Response();
		Integer id = model.getId();
		Double score = model.getScore();
		Double rate = model.getRate();
		if(id == null || score == null || rate == null || rate < 0){
			response.setSuccess(false);
			return response;
		}
		String poolKey = "";
		String rateKey = "";
		switch (id) {
		case 0:
			poolKey = RedisKey.REDIS_BIG_POOL;
			rateKey = RedisKey.REDIS_BIG_RATE_POOL;
			break;
		case 1:
			poolKey = RedisKey.REDIS_INCOME_POOL;
			rateKey = RedisKey.REDIS_INCOME_RATE_POOL;
			break;
		case 2:
			poolKey = RedisKey.REDIS_SMALL_POOL;
			rateKey = RedisKey.REDIS_SMALL_RATE_POOL;
			break;
		default:
			break;
		}
		redisInitDao.updateScoreStock(poolKey, score);
		redisInitDao.updateScoreStock(rateKey, rate);
		return response;
	}

}
