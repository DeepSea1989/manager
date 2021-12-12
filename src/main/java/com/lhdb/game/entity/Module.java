package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "module")
public class Module  extends BasePojo {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "moduleid",type = MySqlTypeConstant.INT,length = 11)
    private Integer moduleid;

    @Column(name = "parentid",type = MySqlTypeConstant.INT,length = 11)
    private Integer parentid;

    @Column(name = "title",type = MySqlTypeConstant.VARCHAR,length = 50)
    private String title;

    @Column(name = "link",type = MySqlTypeConstant.VARCHAR,length = 200)
    private String link;

    @Column(name = "orderno",type = MySqlTypeConstant.INT,length = 64)
    private Integer orderno;

    @Column(name = "nullity",type = MySqlTypeConstant.INT,length = 3)
    private Integer nullity;

    @Column(name = "ismenu",type = MySqlTypeConstant.INT,length = 1)
    private Integer ismenu;

    @Column(name = "description",type = MySqlTypeConstant.VARCHAR,length = 200)
    private String description;

    @Column(name = "link2",type = MySqlTypeConstant.VARCHAR,length = 200)
    private String link2;

    @Column(name = "icon",type = MySqlTypeConstant.VARCHAR,length = 200)
    private String icon;

    @Column(name = "managerpopedom",type = MySqlTypeConstant.INT,length = 3)
    private Integer managerpopedom;

    public Module(Integer id, Integer moduleid, Integer parentid, String title, String link, Integer orderno, Integer nullity, Integer ismenu, String description, String link2, String icon, Integer managerpopedom) {
        this.id = id;
        this.moduleid = moduleid;
        this.parentid = parentid;
        this.title = title;
        this.link = link;
        this.orderno = orderno;
        this.nullity = nullity;
        this.ismenu = ismenu;
        this.description = description;
        this.link2 = link2;
        this.icon = icon;
        this.managerpopedom = managerpopedom;
    }

    public Module() {
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

    public Integer getParentid() {
        return parentid;
    }

    public void setParentid(Integer parentid) {
        this.parentid = parentid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link == null ? null : link.trim();
    }

    public Integer getOrderno() {
        return orderno;
    }

    public void setOrderno(Integer orderno) {
        this.orderno = orderno;
    }

    public Integer getNullity() {
        return nullity;
    }

    public void setNullity(Integer nullity) {
        this.nullity = nullity;
    }

    public Integer getIsmenu() {
        return ismenu;
    }

    public void setIsmenu(Integer ismenu) {
        this.ismenu = ismenu;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getLink2() {
        return link2;
    }

    public void setLink2(String link2) {
        this.link2 = link2 == null ? null : link2.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public Integer getManagerpopedom() {
        return managerpopedom;
    }

    public void setManagerpopedom(Integer managerpopedom) {
        this.managerpopedom = managerpopedom;
    }
}