package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "users")
public class Users extends BasePojo  {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "userid",type = MySqlTypeConstant.INT,length = 11)
    private Integer userid;

    @Column(name = "username",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String username;

    @Column(name = "nullity",type = MySqlTypeConstant.INT,length = 3)
    private Integer nullity;

    @Column(name = "prelogintime",type = MySqlTypeConstant.DATETIME)
    private Date prelogintime;

    @Column(name = "preloginip",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String preloginip;

    @Column(name = "lastlogintime",type = MySqlTypeConstant.DATETIME)
    private Date lastlogintime;

    @Column(name = "lastloginip",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String lastloginip;

    @Column(name = "logintimes",type = MySqlTypeConstant.INT,length = 11)
    private Integer logintimes;

    @Column(name = "isband",type = MySqlTypeConstant.INT,length = 1)
    private Integer isband;

    @Column(name = "bandip",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String bandip;

    @Column(name = "roleid",type = MySqlTypeConstant.INT,length = 11)
    private Integer roleid;

    @Column(name = "rolename",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String rolename;

    @Column(name = "spreader_ids",type = MySqlTypeConstant.VARCHAR,length = 200)
    private String spreaderIds;

    @Column(name = "password",type = MySqlTypeConstant.VARCHAR,length = 64)
    private String password;

    public Users(Integer id, Integer userid, String username, Integer nullity, Date prelogintime, String preloginip, Date lastlogintime, String lastloginip, Integer logintimes, Integer isband, String bandip, Integer roleid, String rolename, String spreaderIds, String password) {
        this.id = id;
        this.userid = userid;
        this.username = username;
        this.nullity = nullity;
        this.prelogintime = prelogintime;
        this.preloginip = preloginip;
        this.lastlogintime = lastlogintime;
        this.lastloginip = lastloginip;
        this.logintimes = logintimes;
        this.isband = isband;
        this.bandip = bandip;
        this.roleid = roleid;
        this.rolename = rolename;
        this.spreaderIds = spreaderIds;
        this.password = password;
    }

    public Users() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getNullity() {
        return nullity;
    }

    public void setNullity(Integer nullity) {
        this.nullity = nullity;
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

    public Integer getIsband() {
        return isband;
    }

    public void setIsband(Integer isband) {
        this.isband = isband;
    }

    public String getBandip() {
        return bandip;
    }

    public void setBandip(String bandip) {
        this.bandip = bandip == null ? null : bandip.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public String getSpreaderIds() {
        return spreaderIds;
    }

    public void setSpreaderIds(String spreaderIds) {
        this.spreaderIds = spreaderIds == null ? null : spreaderIds.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }
}