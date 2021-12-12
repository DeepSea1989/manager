package com.lhdb.game.controller;

import com.lhdb.game.dao.VerificationCodeMapper;
import com.lhdb.game.entity.VerificationCode;
import com.lhdb.util.Result;
import com.lhdb.util.ResultUtil;
import com.lhdb.util.ToolUtil;
import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
@RestController
@RequestMapping(value="/v1")
public class VerifyController {

    private static Logger log = Logger.getLogger(VerifyController.class);


    @Resource
    VerificationCodeMapper verificationCodeMapper;

    @RequestMapping(value = "/verificationCode/Send")
    public Result playerSendVerCode(String mobile){
        VerificationCode veriCode = new VerificationCode();
        String code = ToolUtil.genVerifyCode();
        veriCode.setInfotype(1);
        veriCode.setMobile(mobile);
        veriCode.setMessage(code);
        veriCode.setTime(new Date());

        int num = verificationCodeMapper.insert(veriCode);

        if(num > 0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(20006,"验证码发送失败");
        }
    }

    @RequestMapping(value = "/verificationCode/Search")
    public Result search(String mobile, String message, Integer pageIndex, Integer pageSize){

        Map<String, Object> data = new HashedMap();
        data.put("currIndex", (pageIndex-1)*pageSize);
        data.put("pageSize", pageSize);
        data.put("mobile",mobile);
        data.put("message",message);

        log.info("获取验证码");
        log.info(mobile);
        log.info(message);

        List<VerificationCode> codeList = verificationCodeMapper.queryVerificationCode(data);

        if(codeList.size()>0){
            return ResultUtil.success(codeList);
        }else{
            return ResultUtil.error(-1,"没有数据");
        }

    }
}
