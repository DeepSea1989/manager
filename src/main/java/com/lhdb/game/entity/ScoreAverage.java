package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "scoreaverage")
public class ScoreAverage {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "stage",type = MySqlTypeConstant.VARCHAR,length = 11)
    private String stage;

    @Column(name = "stagenum",type = MySqlTypeConstant.INT,length = 5)
    private Integer stagenum;

    @Column(name = "gem",type = MySqlTypeConstant.INT,length = 5)
    private Integer gem;

    @Column(name = "gemrate",type = MySqlTypeConstant.INT,length = 4)
    private Integer gemrate;

    public ScoreAverage(Integer id, String stage, Integer stagenum, Integer gem, Integer gemrate) {
        this.id = id;
        this.stage = stage;
        this.stagenum = stagenum;
        this.gem = gem;
        this.gemrate = gemrate;
    }

    public ScoreAverage() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStage() {
        return stage;
    }

    public void setStage(String stage) {
        this.stage = stage == null ? null : stage.trim();
    }

    public Integer getStagenum() {
        return stagenum;
    }

    public void setStagenum(Integer stagenum) {
        this.stagenum = stagenum;
    }

    public Integer getGem() {
        return gem;
    }

    public void setGem(Integer gem) {
        this.gem = gem;
    }

    public Integer getGemrate() {
        return gemrate;
    }

    public void setGemrate(Integer gemrate) {
        this.gemrate = gemrate;
    }
}