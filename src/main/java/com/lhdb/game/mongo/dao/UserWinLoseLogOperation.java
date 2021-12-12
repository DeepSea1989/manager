package com.lhdb.game.mongo.dao;


import java.util.List;

import com.lhdb.game.mongo.entity.UserWinLoseLog;
import com.mongodb.client.result.UpdateResult;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;

import com.lhdb.game.mongo.entity.UserJewelDownLog;
import com.lhdb.util.SpringDataPageable;
import com.lhdb.util.pojo.ParamUtilVO;
import org.springframework.stereotype.Component;

@Mapper
@Component
public class UserWinLoseLogOperation {

	
	MongoTemplate mongoTemplate;
	private final String COLLECTION = "winloselog";
	/** 掉落珠子详情**/
	private final String COLLECTION_DOWN = "jeweldownlog";
	 
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}
    
    public String insert(UserWinLoseLog log){
    	if (log == null || log.getUserId() == null)
			return null;
        mongoTemplate.insert(log, COLLECTION);
        return log.getId();
    }
	
	public UserWinLoseLog findByUserIdAndWinScore(String id) {
		Query query = new Query(Criteria.where("_id").is(id).and("winScore").gt(20000).and("status").is(0));
		return mongoTemplate.findOne(query, UserWinLoseLog.class, COLLECTION);
	}
	
	public int updateStatus(UserWinLoseLog log) {
    	int num = -1;
		if (log == null)
			return num;
		Criteria criteria = Criteria.where("_id").is(log.getId());
		Query query = new Query(criteria);
		Update update = new Update();
		update.set("status", 1);
		try{
			UpdateResult writeResult = mongoTemplate.updateFirst(query, update, UserWinLoseLog.class, COLLECTION);
			num = (int)writeResult.getModifiedCount();
		}catch(Exception e){
			return 0;
		}
		return num;
	}
	
	/**
	 * @Title: 掉落珠子详情分页
	 * @Description:
	 * @return
	 * @author Horst
	 * @date 2017年6月26日 下午8:46:08
	 * @version V1.0
	 */
	public Page<UserJewelDownLog> findJewelDownLogPage(ParamUtilVO paramUtilVO, com.lhdb.util.Page pager){
		SpringDataPageable pageable = new SpringDataPageable();
		Query query = new Query();
		if(paramUtilVO.getUserId() != null) {
			query.addCriteria(Criteria.where("userId").is(paramUtilVO.getUserId()));
		}
//		Date start = paramUtilVO.getStart();
//		if(start != null) {
//			query.addCriteria(Criteria.where("time").gte(start));
//		}
//		Date end = paramUtilVO.getEnd();
//		if(end != null) {
//			query.addCriteria(Criteria.where("time").lte(end));
//		}
//		Integer min = paramUtilVO.getMin();
//		if(min != null) {
//			query.addCriteria(Criteria.where("fetchScore").gte(min));
//		}
//		Integer max = paramUtilVO.getMax();
//		if(max != null) {
//			query.addCriteria(Criteria.where("fetchScore").lte(max));
//		}
//		List<Order> orders = new ArrayList<Order>();  //排序
//	    orders.add(new Order(Direction.DESC, "time"));
//	    Sort sort = new Sort(orders);
		// 开始页
	    pageable.setPagenumber(pager.getCurrentPage());
    	// 每页条数
    	pageable.setPagesize(30);
	    // 排序
//	    pageable.setSort(sort);
	    // 查询出一共的条数
	    Long count = mongoTemplate.count(query, COLLECTION_DOWN);
	    List<UserJewelDownLog> list =  mongoTemplate.find(query.with(pageable), UserJewelDownLog.class, COLLECTION_DOWN);
	    pager.setTotalCount(count.intValue());
	    // 将集合与分页结果封装
	    Page<UserJewelDownLog> pagelist = new PageImpl<UserJewelDownLog>(list, pageable, count);
		return pagelist;
	}
}
