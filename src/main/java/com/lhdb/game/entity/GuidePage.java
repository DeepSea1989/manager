package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "guidepage")
public class GuidePage {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "ison",type = MySqlTypeConstant.INT,length = 1)
    private Integer ison;

    @Column(name = "type",type = MySqlTypeConstant.INT,length = 1)
    private Integer type;

    @Column(name = "time",type = MySqlTypeConstant.DATETIME)
    private Date time;

    @Column(name = "imgurl",type = MySqlTypeConstant.VARCHAR,length = 200)
    private String imgurl;

    @Column(name = "videourl",type = MySqlTypeConstant.VARCHAR,length = 200)
    private String videourl;

    public GuidePage(Integer id, Integer ison, Integer type, Date time, String imgurl, String videourl) {
        this.id = id;
        this.ison = ison;
        this.type = type;
        this.time = time;
        this.imgurl = imgurl;
        this.videourl = videourl;
    }

    public GuidePage() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIson() {
        return ison;
    }

    public void setIson(Integer ison) {
        this.ison = ison;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getVideourl() {
        return videourl;
    }

    public void setVideourl(String videourl) {
        this.videourl = videourl == null ? null : videourl.trim();
    }
}