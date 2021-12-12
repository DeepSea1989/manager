package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "rolepermission")
public class RolePermission  extends BasePojo {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "roleid",type = MySqlTypeConstant.INT,length = 11)
    private Integer roleid;

    @Column(name = "moduleid",type = MySqlTypeConstant.INT,length = 11)
    private Integer moduleid;

    @Column(name = "managerpermission",type = MySqlTypeConstant.INT,length = 11)
    private Integer managerpermission;

    @Column(name = "operationpermission",type = MySqlTypeConstant.INT,length = 11)
    private Integer operationpermission;

    @Column(name = "stateflag",type = MySqlTypeConstant.INT,length = 5)
    private Integer stateflag;

    public RolePermission(Integer id, Integer roleid, Integer moduleid, Integer managerpermission, Integer operationpermission, Integer stateflag) {
        this.id = id;
        this.roleid = roleid;
        this.moduleid = moduleid;
        this.managerpermission = managerpermission;
        this.operationpermission = operationpermission;
        this.stateflag = stateflag;
    }

    public RolePermission() {
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

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public Integer getManagerpermission() {
        return managerpermission;
    }

    public void setManagerpermission(Integer managerpermission) {
        this.managerpermission = managerpermission;
    }

    public Integer getOperationpermission() {
        return operationpermission;
    }

    public void setOperationpermission(Integer operationpermission) {
        this.operationpermission = operationpermission;
    }

    public Integer getStateflag() {
        return stateflag;
    }

    public void setStateflag(Integer stateflag) {
        this.stateflag = stateflag;
    }
}