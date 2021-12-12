package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "userrole")
public class UserRole extends BasePojo  {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "userid",type = MySqlTypeConstant.INT,length = 11)
    private Integer userid;

    @Column(name = "rolename",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String rolename;

    @Column(name = "roleid",type = MySqlTypeConstant.INT,length = 11)
    private Integer roleid;

    public UserRole(Integer id, Integer userid, String rolename, Integer roleid) {
        this.id = id;
        this.userid = userid;
        this.rolename = rolename;
        this.roleid = roleid;
    }

    public UserRole() {
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

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }
}