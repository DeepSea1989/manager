package com.lhdb.game.controller;

import com.lhdb.game.dao.OrderInfoMapper;
import com.lhdb.game.entity.OrderInfo;
import com.lhdb.util.Result;
import com.lhdb.util.ResultUtil;
import org.apache.commons.collections.map.HashedMap;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Controller
@RestController
@RequestMapping(value="/v1")
public class OrderController {

    @Resource
    private OrderInfoMapper orderInfoMapper;

    @RequestMapping(value = "/searchOrderList")
    public Result searchOrderList(String orderid, Integer userid, Integer paytype, Integer pageIndex, Integer pageSize){

        Map<String, Object> data = new HashedMap();
        data.put("currIndex", (pageIndex-1)*pageSize);
        data.put("pageSize", pageSize);
        data.put("userid",userid);
        data.put("orderid",orderid);
        data.put("paytype",paytype);

        List<OrderInfo> orderList = orderInfoMapper.searchOrderList(data);

        if(orderList.size()>0){
            return ResultUtil.success(orderList);
        }else{
            return ResultUtil.error(-1,"没有数据");
        }


    }
}