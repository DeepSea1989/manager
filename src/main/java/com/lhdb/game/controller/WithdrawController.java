package com.lhdb.game.controller;


import com.lhdb.game.dao.WithdrawMapper;
import com.lhdb.game.entity.Player;
import com.lhdb.game.entity.Withdraw;
import com.lhdb.util.Result;
import com.lhdb.util.ResultUtil;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RestController
@RequestMapping(value="/v1")
public class WithdrawController {

    @Resource
    WithdrawMapper withdrawMapper;

    @RequestMapping(value = "/addWithdraw")
    public Result addWithdraw(Withdraw wd){

        wd.setAddtime(new Date());
        wd.setUpdatetime(new Date());
        int num = withdrawMapper.insertSelective(wd);

        if(num > 0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"添加失败");
        }
    }


    @RequestMapping(value="/passWithdraw", method = RequestMethod.POST)
    public Result passWithdraw(String ids){

        Map<String, Object> map = new HashedMap();
        map.put("array",ids.split(","));
        map.put("time",new Date());
        map.put("status",1);

        int num = withdrawMapper.passWithdraw(map);

        if(num>0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"审核失败");
        }

    }

    @RequestMapping(value="/rejectWithdraw", method = RequestMethod.POST)
    public Result rejectWithdraw(String reject, String ids){

        Map<String, Object> map = new HashedMap();
        map.put("reject",reject);
        map.put("array",ids.split(","));
        map.put("time",new Date());
        map.put("status",2);

        int num = withdrawMapper.rejectWithdraw(map);

        if(num>0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"驳回失败");
        }


    }

    @RequestMapping(value = "/searchWithdraw")
    public Result searchWithdraw(String username, Integer pageIndex, Integer pageSize){

        Map<String, Object> data = new HashedMap();
        data.put("currIndex", (pageIndex-1)*pageSize);
        data.put("pageSize", pageSize);
        data.put("username",username);

        List<Withdraw> wdList = withdrawMapper.searchWithdraw(data);

        if(wdList.size()>0){
            return ResultUtil.success(wdList);
        }else{
            return ResultUtil.error(-1,"没有数据");
        }
    }
}
