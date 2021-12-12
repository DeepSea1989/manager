package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

@Data
@ToString
@Builder
@Table(name = "linesaverage")
public class LinesAverage {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "stage",type = MySqlTypeConstant.VARCHAR,length = 9)
    private String stage;

    @Column(name = "stagenum",type = MySqlTypeConstant.INT,length = 9)
    private Integer stagenum;

    @Column(name = "line",type = MySqlTypeConstant.INT,length = 9)
    private Integer line;

    @Column(name = "linerate",type = MySqlTypeConstant.INT,length = 9)
    private Integer linerate;

    public LinesAverage(Integer id, String stage, Integer stagenum, Integer line, Integer linerate) {
        this.id = id;
        this.stage = stage;
        this.stagenum = stagenum;
        this.line = line;
        this.linerate = linerate;
    }

    public LinesAverage() {
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

    public Integer getLine() {
        return line;
    }

    public void setLine(Integer line) {
        this.line = line;
    }

    public Integer getLinerate() {
        return linerate;
    }

    public void setLinerate(Integer linerate) {
        this.linerate = linerate;
    }
}