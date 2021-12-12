package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "playerloginlog")
public class PlayerLoginLog {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "userid",type = MySqlTypeConstant.BIGINT,length = 11)
    private Long userid;

    @Column(name = "username",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String username;

    @Column(name = "prelogintime",type = MySqlTypeConstant.DATETIME)
    private Date prelogintime;

    @Column(name = "preloginip",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String preloginip;

    @Column(name = "lastlogintime",type = MySqlTypeConstant.DATETIME)
    private Date lastlogintime;

    @Column(name = "lastloginip",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String lastloginip;

    @Column(name = "logintimes",type = MySqlTypeConstant.INT,length = 13)
    private Integer logintimes;

    public PlayerLoginLog(Integer id, Long userid, String username, Date prelogintime, String preloginip, Date lastlogintime, String lastloginip, Integer logintimes) {
        this.id = id;
        this.userid = userid;
        this.username = username;
        this.prelogintime = prelogintime;
        this.preloginip = preloginip;
        this.lastlogintime = lastlogintime;
        this.lastloginip = lastloginip;
        this.logintimes = logintimes;
    }

    public PlayerLoginLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getPrelogintime() {
        return prelogintime;
    }

    public void setPrelogintime(Date prelogintime) {
        this.prelogintime = prelogintime;
    }

    public String getPreloginip() {
        return preloginip;
    }

    public void setPreloginip(String preloginip) {
        this.preloginip = preloginip == null ? null : preloginip.trim();
    }

    public Date getLastlogintime() {
        return lastlogintime;
    }

    public void setLastlogintime(Date lastlogintime) {
        this.lastlogintime = lastlogintime;
    }

    public String getLastloginip() {
        return lastloginip;
    }

    public void setLastloginip(String lastloginip) {
        this.lastloginip = lastloginip == null ? null : lastloginip.trim();
    }

    public Integer getLogintimes() {
        return logintimes;
    }

    public void setLogintimes(Integer logintimes) {
        this.logintimes = logintimes;
    }
}