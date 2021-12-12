package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "sharesetting")
public class ShareSetting {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "wxdomain",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String wxdomain;

    @Column(name = "livesharetitle",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String livesharetitle;

    @Column(name = "liveshareskill",type = MySqlTypeConstant.VARCHAR,length = 60)
    private String liveshareskill;

    @Column(name = "androidurl",type = MySqlTypeConstant.VARCHAR, length = 200)
    private String androidurl;

    @Column(name = "iosurl",type = MySqlTypeConstant.VARCHAR, length = 200)
    private String iosurl;

    @Column(name = "videotitle",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String videotitle;

    public ShareSetting(Integer id, String wxdomain, String livesharetitle, String liveshareskill, String androidurl, String iosurl, String videotitle) {
        this.id = id;
        this.wxdomain = wxdomain;
        this.livesharetitle = livesharetitle;
        this.liveshareskill = liveshareskill;
        this.androidurl = androidurl;
        this.iosurl = iosurl;
        this.videotitle = videotitle;
    }

    public ShareSetting() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWxdomain() {
        return wxdomain;
    }

    public void setWxdomain(String wxdomain) {
        this.wxdomain = wxdomain == null ? null : wxdomain.trim();
    }

    public String getLivesharetitle() {
        return livesharetitle;
    }

    public void setLivesharetitle(String livesharetitle) {
        this.livesharetitle = livesharetitle == null ? null : livesharetitle.trim();
    }

    public String getLiveshareskill() {
        return liveshareskill;
    }

    public void setLiveshareskill(String liveshareskill) {
        this.liveshareskill = liveshareskill == null ? null : liveshareskill.trim();
    }

    public String getAndroidurl() {
        return androidurl;
    }

    public void setAndroidurl(String androidurl) {
        this.androidurl = androidurl == null ? null : androidurl.trim();
    }

    public String getIosurl() {
        return iosurl;
    }

    public void setIosurl(String iosurl) {
        this.iosurl = iosurl == null ? null : iosurl.trim();
    }

    public String getVideotitle() {
        return videotitle;
    }

    public void setVideotitle(String videotitle) {
        this.videotitle = videotitle == null ? null : videotitle.trim();
    }
}