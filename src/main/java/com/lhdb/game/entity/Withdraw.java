package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "withdraw")
public class Withdraw extends BasePojo  {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "userid",type = MySqlTypeConstant.BIGINT,length = 20)
    private Long userid;

    @Column(name = "username",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String username;

    @Column(name = "money",type = MySqlTypeConstant.BIGINT,length = 30)
    private Long money;

    @Column(name = "score",type = MySqlTypeConstant.BIGINT,length = 30)
    private Long score;

    @Column(name = "status",type = MySqlTypeConstant.INT,length = 2)
    private Integer status;

    @Column(name = "reject",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String reject;

    @Column(name = "rate",type = MySqlTypeConstant.DOUBLE,length = 4)
    private Double rate;

    @Column(name = "addtime",type = MySqlTypeConstant.DATETIME)
    private Date addtime;

    @Column(name = "updatetime",type = MySqlTypeConstant.DATETIME)
    private Date updatetime;

    public Withdraw(Integer id, Long userid, String username, Long money, Long score, Integer status, String reject, Double rate, Date addtime, Date updatetime) {
        this.id = id;

        this.userid = userid;

        this.username = username;

        this.money = money;
        this.score = score;
        this.status = status;
        this.reject = reject;
        this.rate = rate;
        this.addtime = addtime;
        this.updatetime = updatetime;
    }

    public Withdraw() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserid(){return userid;}

    public void setUserid(Long userid){this.userid = userid;}

    public String getUsername(){return username;}

    public void setUsername(String username){this.username = username;}

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReject() {
        return reject;
    }

    public void setReject(String reject) {
        this.reject = reject == null ? null : reject.trim();
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getAddtime() {
        return addtime;
    }

    public void setAddtime(Date addtime) {
        this.addtime = addtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}