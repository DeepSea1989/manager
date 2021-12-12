package com.lhdb.game.dao;

import com.lhdb.game.entity.User;
import com.lhdb.game.entity.VerificationCode;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface VerificationCodeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(VerificationCode record);

    int insertSelective(VerificationCode record);

    VerificationCode selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(VerificationCode record);

    int updateByPrimaryKey(VerificationCode record);

    List<VerificationCode> queryVeriCode(String username, String code);

    List<VerificationCode> queryVerificationCode(Map<String,Object> data);
}