package com.lhdb.game.controller;

import com.lhdb.game.dao.PlayerLoginLogMapper;
import com.lhdb.game.dao.PlayerMapper;
import com.lhdb.game.dao.PlayerScoreLogMapper;
import com.lhdb.game.dao.VerificationCodeMapper;
import com.lhdb.game.entity.Player;
import com.lhdb.game.entity.PlayerLoginLog;
import com.lhdb.game.entity.PlayerScoreLog;
import com.lhdb.game.entity.VerificationCode;
import com.lhdb.util.*;
import org.apache.commons.collections.map.HashedMap;
import org.apache.log4j.Logger;
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
public class PlayerController {

    Logger logger = Logger.getLogger(PlayerController.class);

    private GoogleAuthenticator ga = new GoogleAuthenticator();

    @Resource
    private PlayerMapper playerMapper;

    @Resource
    private VerificationCodeMapper verificationCodeMapper;

    @Resource
    private PlayerLoginLogMapper playerLoginLogMapper;

    @Resource
    private PlayerScoreLogMapper playerScoreLogMapper;

    @RequestMapping(value = "/playerLogin")
    public Result playerLogin(String username, String password, String ip){

        logger.info(username+password+ip);
        try {
            if(password.length()<=16){
                password = MD5Util.MD5(password);
            }



            List<Player> playerList = playerMapper.queryUserNameAndPassword(username,password);

            if (playerList.size() > 0) {

                 Player player = playerList.get(0);
                 player.setLastTime(new Date());
                 player.setLastIp(ip);

                PlayerLoginLog log = new PlayerLoginLog();

                log.setUserid(player.getUserId());
                log.setUsername(player.getUserName());
                log.setPreloginip(ip);
                log.setPrelogintime(new Date());
                playerMapper.updateByPrimaryKeySelective(player);
                playerLoginLogMapper.insert(log);

                return ResultUtil.success(player);

            } else {
                return ResultUtil.error(20003, "用户名或密码错误！");
            }
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(20004,"系统错误");
        }
    }

    @RequestMapping(value = "/playerLogout")
    public Result playerLogout(String username){

//        PlayerLoginLog log = playerLoginLogMapper.
        return ResultUtil.success();
    }

    @RequestMapping(value = "/playerRegister", method = RequestMethod.POST)
    public Result playerResiger(String username, String password, String code, String ip){

        try{

           List<VerificationCode> verificationCodes = verificationCodeMapper.queryVeriCode(username,code);
           if(verificationCodes.size() <= 0){
               return ResultUtil.error(20005, "验证码错误");
           }

           if(password.length()>16){
               return ResultUtil.error(20008,"密码不能超过16个字符");
           }

           Player player = new Player();
           player.setUserName(username);
           player.setPassword(MD5Util.MD5(password));
           player.setUserId(Long.parseLong(username));
           player.setRegisterIp(ip);
           player.setRegisterDate(new Date());
           player.setScore(0L);
           player.setLastIp(ip);
           player.setLastTime(new Date());

           int num = playerMapper.insert(player);

           if(num>0){
               return ResultUtil.success();
           }else{
               return ResultUtil.error(20007,"注册失败");
           }

        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.error(20004,"系统错误");
        }
    }

    @RequestMapping(value = "/playerSearch")
    public Result playerSearch(String username, Integer gender, String register_ip, Integer smallScore, Integer bigScore, Integer pageIndex, Integer pageSize){

        Map<String, Object> data = new HashedMap();
        data.put("currIndex", (pageIndex-1)*pageSize);
        data.put("pageSize", pageSize);
        data.put("username",username);
        data.put("gender",gender);
        data.put("register_ip",register_ip);
        data.put("smallScore",smallScore);
        data.put("bigScore",bigScore);

        List<Player> playerList = playerMapper.queryPlayer(data);

        if(playerList.size()>0){
            return ResultUtil.success(playerList);
        }else{
            return ResultUtil.error(-1,"没有数据");
        }
    }

    @RequestMapping(value = "/playerForbidden", method = RequestMethod.POST)
    public Result playerForbidden(String ids){

        String[] array = ids.split(",");
        Map<String,Object> map = new HashedMap();
        map.put("state",1);
        map.put("array",array);

        int num  = playerMapper.updatePlayerState(map);

        if(num>0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"修改失败");
        }

    }

    @RequestMapping(value = "/playerDelete", method = RequestMethod.POST)
    public Result playerDelete(String ids){

        String[] array = ids.split(",");
        Map<String,Object> map = new HashedMap();
        map.put("state",2);
        map.put("array",array);

        int num  = playerMapper.updatePlayerState(map);

        if(num>0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"删除失败");
        }

    }

    @RequestMapping(value = "/playerModify", method = RequestMethod.POST)
    public Result playerModify(Player player){

        player.setUpdateDate(new Date());

        int num = playerMapper.updateByPrimaryKeySelective(player);

        if(num>0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"修改失败");
        }
    }

    @RequestMapping(value = "/playerScoreModify")
    public Result PlayerScoreModify(PlayerScoreLog log){

        int num1 = 0,num2 = 0;

        logger.info("请求参数");
        logger.info(log.getScore());
        logger.info(log.getUserid());
        logger.info(log.getUsername());
        Player player = playerMapper.queryUserName(log.getUsername());

        Long score = player.getScore() + log.getScore();

        player.setScore(score);

        num1 = playerMapper.updateByPrimaryKeySelective(player);

        if(num1 > 0){
            playerScoreLogMapper.insertSelective(log);
        }

        if(num1>0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"操作失败");
        }

    }

    @RequestMapping(value = "/searchPlayerLoginLog")
    public Result searchPlayerLoginLog(String username,Integer pageIndex, Integer pageSize){

        Map<String, Object> data = new HashedMap();
        data.put("currIndex", (pageIndex-1)*pageSize);
        data.put("pageSize", pageSize);
        data.put("username",username);

        List<PlayerLoginLog> logList = playerLoginLogMapper.queryPlayerLoginLog(data);

        if(logList.size()>0){
            return ResultUtil.success(logList);
        }else{
            return ResultUtil.error(-1,"没有数据");
        }
    }


    @RequestMapping(value ="/searchPlayerScoreLog")
    public Result searchPlayerScoreLog(String username, Integer pageIndex, Integer pageSize){

        Map<String, Object> data = new HashedMap();
        data.put("currIndex", (pageIndex-1)*pageSize);
        data.put("pageSize", pageSize);
        data.put("username",username);

        List<PlayerScoreLog> logList = playerScoreLogMapper.queryPlayerScoreLog(data);

        if(logList.size()>0){
            return ResultUtil.success(logList);
        }else{
            return ResultUtil.error(-1,"没有数据");
        }

    }
}
