package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "ratescore")
public class RateScore  extends BasePojo {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "score",type = MySqlTypeConstant.BIGINT,length = 30)
    private Long score;

    @Column(name = "money",type = MySqlTypeConstant.BIGINT,length = 30)
    private Long money;

    @Column(name = "updatetime",type = MySqlTypeConstant.DATETIME)
    private Date updatetime;

    public RateScore(Integer id, Long score, Long money, Date updatetime) {
        this.id = id;
        this.score = score;
        this.money = money;
        this.updatetime = updatetime;
    }

    public RateScore() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}