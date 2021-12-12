package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "verificationcode")
public class VerificationCode extends BasePojo  {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "infotype",type = MySqlTypeConstant.INT,length = 1)
    private Integer infotype;

    @Column(name = "mobile",type = MySqlTypeConstant.VARCHAR,length = 11)
    private String mobile;

    @Column(name = "message",type = MySqlTypeConstant.VARCHAR,length = 6)
    private String message;

    @Column(name = "time",type = MySqlTypeConstant.DATETIME)
    private Date time;

    public VerificationCode(Integer id, Integer infotype, String mobile, String message, Date time) {
        this.id = id;
        this.infotype = infotype;
        this.mobile = mobile;
        this.message = message;
        this.time = time;
    }

    public VerificationCode() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getInfotype() {
        return infotype;
    }

    public void setInfotype(Integer infotype) {
        this.infotype = infotype;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}