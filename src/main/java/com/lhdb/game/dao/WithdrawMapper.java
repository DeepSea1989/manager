package com.lhdb.game.dao;

import com.lhdb.game.entity.Withdraw;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface WithdrawMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Withdraw record);

    int insertSelective(Withdraw record);

    Withdraw selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Withdraw record);

    int updateByPrimaryKey(Withdraw record);

    List<Withdraw> searchWithdraw(Map<String, Object> map);

    int passWithdraw(Map<String,Object> map);

    int rejectWithdraw(Map<String,Object> map);
}