package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "modulepermission")
public class ModulePermission  extends BasePojo {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "moduleid",type = MySqlTypeConstant.INT,length = 11)
    private Integer moduleid;

    @Column(name = "permissionvalue",type = MySqlTypeConstant.INT,length = 3)
    private Integer permissionvalue;

    @Column(name = "permissiontitle",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String permissiontitle;

    @Column(name = "nullity",type = MySqlTypeConstant.INT,length = 3)
    private Integer nullity;

    @Column(name = "stateflag",type = MySqlTypeConstant.INT,length = 3)
    private Integer stateflag;

    @Column(name = "parentid",type = MySqlTypeConstant.INT,length = 11)
    private Integer parentid;

    @Column(name = "uri",type = MySqlTypeConstant.VARCHAR,length = 200)
    private String uri;

    public ModulePermission(Integer id, Integer moduleid, Integer permissionvalue, String permissiontitle, Integer nullity, Integer stateflag, Integer parentid, String uri) {
        this.id = id;
        this.moduleid = moduleid;
        this.permissionvalue = permissionvalue;
        this.permissiontitle = permissiontitle;
        this.nullity = nullity;
        this.stateflag = stateflag;
        this.parentid = parentid;
        this.uri = uri;
    }

    public ModulePermission() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    public Integer getPermissionvalue() {
        return permissionvalue;
    }

    public void setPermissionvalue(Integer permissionvalue) {
        this.permissionvalue = permissionvalue;
    }

    public String getPermissiontitle() {
        return permissiontitle;
    }

    public void setPermissiontitle(String permissiontitle) {
        this.permissiontitle = permissiontitle == null ? null : permissiontitle.trim();
    }

    public Integer getNullity() {
        return nullity;
    }

    public void setNullity(Integer nullity) {
        this.nullity = nullity;
    }

    public Integer getStateflag() {
        return stateflag;
    }

    public void setStateflag(Integer stateflag) {
        this.stateflag = stateflag;
    }

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }
}