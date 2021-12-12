package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "roles")
public class Roles  extends BasePojo {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "roleid",type = MySqlTypeConstant.INT,length = 11)
    private Integer roleid;

    @Column(name = "rolename",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String rolename;

    @Column(name = "description",type = MySqlTypeConstant.VARCHAR, length = 20)
    private String description;

    public Roles(Integer id, Integer roleid, String rolename, String description) {
        this.id = id;
        this.roleid = roleid;
        this.rolename = rolename;
        this.description = description;
    }

    public Roles() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}