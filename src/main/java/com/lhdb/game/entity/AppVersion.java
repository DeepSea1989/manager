package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

@Data
@ToString
@Builder
@Table(name = "appversion")
public class AppVersion {

    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "apkversion",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String apkversion;

    @Column(name = "apkurl",type = MySqlTypeConstant.VARCHAR,length = 200)
    private String apkurl;

    @Column(name = "apkexplain",type = MySqlTypeConstant.VARCHAR,length = 200)
    private String apkexplain;

    @Column(name = "ipaversion",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String ipaversion;

    @Column(name = "ipashelfversion",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String ipashelfversion;

    @Column(name = "ipaurl",type = MySqlTypeConstant.VARCHAR,length = 200)
    private String ipaurl;

    @Column(name = "ipaexplain",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String ipaexplain;

    @Column(name = "qrcode",type = MySqlTypeConstant.VARCHAR,length = 200)
    private String qrcode;

    public AppVersion(Integer id, String apkversion, String apkurl, String apkexplain, String ipaversion, String ipashelfversion, String ipaurl, String ipaexplain, String qrcode) {
        this.id = id;
        this.apkversion = apkversion;
        this.apkurl = apkurl;
        this.apkexplain = apkexplain;
        this.ipaversion = ipaversion;
        this.ipashelfversion = ipashelfversion;
        this.ipaurl = ipaurl;
        this.ipaexplain = ipaexplain;
        this.qrcode = qrcode;
    }

    public AppVersion() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getApkversion() {
        return apkversion;
    }

    public void setApkversion(String apkversion) {
        this.apkversion = apkversion == null ? null : apkversion.trim();
    }

    public String getApkurl() {
        return apkurl;
    }

    public void setApkurl(String apkurl) {
        this.apkurl = apkurl == null ? null : apkurl.trim();
    }

    public String getApkexplain() {
        return apkexplain;
    }

    public void setApkexplain(String apkexplain) {
        this.apkexplain = apkexplain == null ? null : apkexplain.trim();
    }

    public String getIpaversion() {
        return ipaversion;
    }

    public void setIpaversion(String ipaversion) {
        this.ipaversion = ipaversion == null ? null : ipaversion.trim();
    }

    public String getIpashelfversion() {
        return ipashelfversion;
    }

    public void setIpashelfversion(String ipashelfversion) {
        this.ipashelfversion = ipashelfversion == null ? null : ipashelfversion.trim();
    }

    public String getIpaurl() {
        return ipaurl;
    }

    public void setIpaurl(String ipaurl) {
        this.ipaurl = ipaurl == null ? null : ipaurl.trim();
    }

    public String getIpaexplain() {
        return ipaexplain;
    }

    public void setIpaexplain(String ipaexplain) {
        this.ipaexplain = ipaexplain == null ? null : ipaexplain.trim();
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode == null ? null : qrcode.trim();
    }
}