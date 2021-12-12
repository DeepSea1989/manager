package com.lhdb.game.controller;

import com.lhdb.game.dao.*;
import com.lhdb.game.entity.*;
import com.lhdb.util.Result;
import com.lhdb.util.ResultUtil;
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
public class GameController {

    @Resource
    ScoreAverageMapper scoreAverageMapper;

    @Resource
    LinesAverageMapper linesAverageMapper;

    @Resource
    AppVersionMapper appVersionMapper;

    @Resource
    GuidePageMapper guidePageMapper;

    @Resource
    RateScoreMapper rateScoreMapper;

    @Resource
    ShareSettingMapper shareSettingMapper;

    private static Logger logger = Logger.getLogger(GameController.class);

    //概率设置接口
    @RequestMapping(value = "/game/scoreAverage/stage")
    public Result scoreAverage(String stage){

        List<ScoreAverage> scoreList = scoreAverageMapper.selectByStage(stage);

        if(scoreList.size() > 0){
            return ResultUtil.success(scoreList);
        }else{
            return ResultUtil.error(-1,"数据不存在");
        }
    }

    @RequestMapping(value = "/game/scoreAverage/stageNum")
    public Result scoreAverage(int stage){

        List<ScoreAverage> scoreList = scoreAverageMapper.selectByStageNum(stage);

        if(scoreList.size() > 0){
            return ResultUtil.success(scoreList);
        }else{
            return ResultUtil.error(-1,"数据不存在");
        }
    }

    @RequestMapping(value = "/game/updateScoreAverage")
    public  Result updateScoreAverage(int id, int gemrate){

        ScoreAverage score = new ScoreAverage();
        score.setId(id);
        score.setGemrate(gemrate);

        int num = scoreAverageMapper.updateByPrimaryKeySelective(score);

        if(num>0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"修改失败");
        }

    }

    @RequestMapping(value = "/game/linesAverage/stage")
    public Result linesAverage(String stage){

        List<LinesAverage> linesList = linesAverageMapper.selectByStage(stage);

        if(linesList.size() > 0){
            return ResultUtil.success(linesList);
        }else{
            return ResultUtil.error(-1,"数据不存在");
        }
    }

    @RequestMapping(value = "/game/linesAverage/stageNum")
    public Result linesAverage(int stage){

        List<LinesAverage> linesList = linesAverageMapper.selectByStageNum(stage);

        if(linesList.size() > 0){
            return ResultUtil.success(linesList);
        }else{
            return ResultUtil.error(-1,"数据不存在");
        }
    }

    @RequestMapping(value = "/game/updateLineAverage")
    public  Result updateLineAverage(int id, int linerate){

        LinesAverage lines = new LinesAverage();
        lines.setId(id);
        lines.setLinerate(linerate);

        int num = linesAverageMapper.updateByPrimaryKeySelective(lines);

        if(num>0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"修改失败");
        }

    }

    //app版本接口
    @RequestMapping(value = "/getAppVersion")
    public Result getAppVersion(){

        AppVersion app = appVersionMapper.selectByPrimaryKey(1);

        if(app != null){
            return ResultUtil.success(app);
        }else{
            return ResultUtil.error(-1,"没有数据");
        }
    }

    @RequestMapping(value = "/updateAppVersion", method = RequestMethod.POST)
    public Result updateAppVersion(AppVersion app){

        int num = appVersionMapper.updateAppVersion(app);

        if(num > 0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"修改失败");
        }
    }

    //引导页接口
    @RequestMapping(value = "/addGuidePage", method = RequestMethod.POST)
    public Result addGuidePage(GuidePage page){

        page.setTime(new Date());
        int num = guidePageMapper.insert(page);

        if(num > 0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"添加失败");
        }

    }

    @RequestMapping(value="/deleteGuidePage", method = RequestMethod.POST)
    public Result deleteGuidePage(String ids){

        String[] arr = ids.split(",");

        logger.info(arr);

        int num = guidePageMapper.deleteByIds(arr);

        if(num > 0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"删除失败");
        }

    }

    @RequestMapping(value = "/updateGuidePage", method = RequestMethod.POST)
    public Result updateGuidePage(GuidePage page){

        page.setTime(new Date());
        int num = guidePageMapper.updateGuidePage(page);

        if(num > 0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"修改失败");
        }
    }

    @RequestMapping(value = "/searchGuidePage")
    public Result searchGuidePage(Integer ison, Integer type, Integer pageIndex, Integer pageSize){

        Map<String, Object> data = new HashedMap();
        data.put("currIndex", (pageIndex-1)*pageSize);
        data.put("pageSize", pageSize);
        data.put("ison",ison);
        data.put("type",type);

        List<GuidePage> pageList = guidePageMapper.queryGuidePage(data);

        if(pageList.size()>0){
            return ResultUtil.success(pageList);
        }else{
            return ResultUtil.error(-1,"没有数据");
        }


    }

    //兑换比例
    @RequestMapping(value = "/getScoreRate")
    public Result getScoreRate(){

       RateScore rate =  rateScoreMapper.selectByPrimaryKey(1);

       if(rate!=null){
           return ResultUtil.success(rate);
       }else{
           return ResultUtil.error(-1,"没有数据");
       }
    }

    @RequestMapping(value = "/updateScoreRate", method = RequestMethod.POST)
    public Result updateScoreRate(RateScore rate){

        rate.setUpdatetime(new Date());

        int num = rateScoreMapper.updateByPrimaryKeySelective(rate);

        if(num > 0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"修改失败");
        }
    }

    //分享数据
    @RequestMapping(value = "/getShareSetting")
    public Result getShareSetting(){

        ShareSetting setting =  shareSettingMapper.selectByPrimaryKey(1);

        if(setting!=null){
            return ResultUtil.success(setting);
        }else{
            return ResultUtil.error(-1,"没有数据");
        }
    }

    @RequestMapping(value = "/updateShareSetting", method = RequestMethod.POST)
    public Result updateShareSetting(ShareSetting setting){

        int num = shareSettingMapper.updateByPrimaryKeySelective(setting);

        if(num > 0){
            return ResultUtil.success();
        }else{
            return ResultUtil.error(-1,"修改失败");
        }
    }
}
