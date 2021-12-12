package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "useroperationlog")
public class UserOperationLog {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "userid",type = MySqlTypeConstant.INT,length = 11)
    private Integer userid;

    @Column(name = "uri",type = MySqlTypeConstant.VARCHAR, length = 200)
    private String uri;

    @Column(name = "paramters",type = MySqlTypeConstant.TEXT)
    private String paramters;

    @Column(name = "operationtype",type = MySqlTypeConstant.INT,length = 3)
    private Integer operationtype;

    @Column(name = "inserttime",type = MySqlTypeConstant.DATETIME)
    private Date inserttime;

    @Column(name = "moduleid",type = MySqlTypeConstant.INT,length = 11)
    private Integer moduleid;

    @Column(name = "permissionvalue",type = MySqlTypeConstant.INT,length = 5)
    private Integer permissionvalue;

    @Column(name = "description",type = MySqlTypeConstant.VARCHAR, length = 200)
    private String description;

    public UserOperationLog(Integer id, Integer userid, String uri, String paramters, Integer operationtype, Date inserttime, Integer moduleid, Integer permissionvalue, String description) {
        this.id = id;
        this.userid = userid;
        this.uri = uri;
        this.paramters = paramters;
        this.operationtype = operationtype;
        this.inserttime = inserttime;
        this.moduleid = moduleid;
        this.permissionvalue = permissionvalue;
        this.description = description;
    }

    public UserOperationLog() {
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

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri == null ? null : uri.trim();
    }

    public String getParamters() {
        return paramters;
    }

    public void setParamters(String paramters) {
        this.paramters = paramters == null ? null : paramters.trim();
    }

    public Integer getOperationtype() {
        return operationtype;
    }

    public void setOperationtype(Integer operationtype) {
        this.operationtype = operationtype;
    }

    public Date getInserttime() {
        return inserttime;
    }

    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}