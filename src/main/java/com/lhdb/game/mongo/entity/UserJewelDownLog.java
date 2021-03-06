package com.lhdb.game.mongo.entity;

import java.util.Date;
import java.util.List;

/**
 * title: 用户珠子掉落日志
 * des: 
 * @author Horst
 * @date 2017年6月21日 下午7:50:53
 * @version V1.0
 */
public class UserJewelDownLog{
	
	private String id;
	private Long userId;
	/** 押注分数**/
	private int stakeScore;
	/** 押注线数**/
	private int multiple;
	/** 第几关**/
	private int visitor;
	/** 剩余砖石**/
	private int overBrick;
	/** 获得分数**/
	private int fetchScore;
	private Integer[][] jewelList;//掉落珠子数据
	private Date time;
	private List<DownInfoVO> scoreList;
	public static class DownInfoVO{
		private int id;
		private int size;
		private int score;
		private Integer[][] cellList;
		public DownInfoVO(){}
		public DownInfoVO(int id, int size, int score, Integer[][] cellList) {
			super();
			this.id = id;
			this.size = size;
			this.score = score;
			this.cellList = cellList;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getSize() {
			return size;
		}
		public void setSize(int size) {
			this.size = size;
		}
		public int getScore() {
			return score;
		}
		public void setScore(int score) {
			this.score = score;
		}
		public Integer[][] getCellList() {
			return cellList;
		}
		public void setCellList(Integer[][] cellList) {
			this.cellList = cellList;
		}
	}
	public UserJewelDownLog() {}
	public UserJewelDownLog(Long userId, int stakeScore, int multiple, int visitor, int overBrick,
			int fetchScore, Integer[][] jewelList, Date time, List<DownInfoVO> scoreList) {
		super();
		this.userId = userId;
		this.stakeScore = stakeScore;
		this.multiple = multiple;
		this.visitor = visitor;
		this.overBrick = overBrick;
		this.fetchScore = fetchScore;
		this.jewelList = jewelList;
		this.time = time;
		this.scoreList = scoreList;
	}

	public int getVisitor() {
		return visitor;
	}

	public void setVisitor(int visitor) {
		this.visitor = visitor;
	}

	public int getOverBrick() {
		return overBrick;
	}

	public void setOverBrick(int overBrick) {
		this.overBrick = overBrick;
	}

	public int getFetchScore() {
		return fetchScore;
	}

	public void setFetchScore(int fetchScore) {
		this.fetchScore = fetchScore;
	}
	
	public int getStakeScore() {
		return stakeScore;
	}

	public void setStakeScore(int stakeScore) {
		this.stakeScore = stakeScore;
	}

	public int getMultiple() {
		return multiple;
	}

	public void setMultiple(int multiple) {
		this.multiple = multiple;
	}

	public Integer[][] getJewelList() {
		return jewelList;
	}
	
	public void setJewelList(Integer[][] jewelList) {
		this.jewelList = jewelList;
	}
	public List<DownInfoVO> getScoreList() {
		return scoreList;
	}
	public void setScoreList(List<DownInfoVO> scoreList) {
		this.scoreList = scoreList;
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
}
