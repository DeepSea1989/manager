package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "order_info")
public class OrderInfo  extends BasePojo {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "order_id",type = MySqlTypeConstant.VARCHAR,length = 11)
    private String orderId;

    @Column(name = "user_id",type = MySqlTypeConstant.BIGINT,length = 11)
    private Long userId;

    @Column(name = "money",type = MySqlTypeConstant.BIGINT,length = 30)
    private Long money;

    @Column(name = "score",type = MySqlTypeConstant.BIGINT,length = 30)
    private Long score;

    @Column(name = "state",type = MySqlTypeConstant.INT,length = 3)
    private Integer state;

    @Column(name = "ip_address",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String ipAddress;

    @Column(name = "back_ip_address",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String backIpAddress;

    @Column(name = "create_time",type = MySqlTypeConstant.DATETIME)
    private Date createTime;

    @Column(name = "update_time",type = MySqlTypeConstant.DATETIME)
    private Date updateTime;

    @Column(name = "orderno",type = MySqlTypeConstant.VARCHAR,length = 50)
    private String orderno;

    @Column(name = "tradno",type = MySqlTypeConstant.VARCHAR,length = 50)
    private String tradno;

    @Column(name = "payid",type = MySqlTypeConstant.INT,length = 11)
    private Integer payid;

    @Column(name = "paytype",type = MySqlTypeConstant.INT,length = 3)
    private Integer paytype;

    @Column(name = "paystatus",type = MySqlTypeConstant.INT,length = 3)
    private Integer paystatus;

    public OrderInfo(Integer id, String orderId, Long userId, Long money, Long score, Integer state, String ipAddress, String backIpAddress, Date createTime, Date updateTime, String orderno, String tradno, Integer payid, Integer paytype, Integer paystatus) {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
        this.money = money;
        this.score = score;
        this.state = state;
        this.ipAddress = ipAddress;
        this.backIpAddress = backIpAddress;
        this.createTime = createTime;
        this.updateTime = updateTime;
        this.orderno = orderno;
        this.tradno = tradno;
        this.payid = payid;
        this.paytype = paytype;
        this.paystatus = paystatus;
    }

    public OrderInfo() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMoney() {
        return money;
    }

    public void setMoney(Long money) {
        this.money = money;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress == null ? null : ipAddress.trim();
    }

    public String getBackIpAddress() {
        return backIpAddress;
    }

    public void setBackIpAddress(String backIpAddress) {
        this.backIpAddress = backIpAddress == null ? null : backIpAddress.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno == null ? null : orderno.trim();
    }

    public String getTradno() {
        return tradno;
    }

    public void setTradno(String tradno) {
        this.tradno = tradno == null ? null : tradno.trim();
    }

    public Integer getPayid() {
        return payid;
    }

    public void setPayid(Integer payid) {
        this.payid = payid;
    }

    public Integer getPaytype() {
        return paytype;
    }

    public void setPaytype(Integer paytype) {
        this.paytype = paytype;
    }

    public Integer getPaystatus() {
        return paystatus;
    }

    public void setPaystatus(Integer paystatus) {
        this.paystatus = paystatus;
    }
}