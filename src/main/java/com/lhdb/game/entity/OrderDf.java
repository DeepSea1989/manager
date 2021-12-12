package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "order_df")
public class OrderDf  extends BasePojo {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "order_id",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String orderId;

    @Column(name = "user_id",type = MySqlTypeConstant.INT,length = 11)
    private Integer userId;

    @Column(name = "money",type = MySqlTypeConstant.BIGINT,length = 30)
    private Long money;

    @Column(name = "score",type = MySqlTypeConstant.BIGINT,length = 30)
    private Long score;

    @Column(name = "acc_no",type = MySqlTypeConstant.VARCHAR,length = 64)
    private String accNo;

    @Column(name = "certif_tp",type = MySqlTypeConstant.INT,length = 64)
    private Integer certifTp;

    @Column(name = "certif_id",type = MySqlTypeConstant.VARCHAR,length = 64)
    private String certifId;

    @Column(name = "customer_nm",type = MySqlTypeConstant.VARCHAR,length = 11)
    private String customerNm;

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

    public OrderDf(Integer id, String orderId, Integer userId, Long money, Long score, String accNo, Integer certifTp, String certifId, String customerNm, Integer state, String ipAddress, String backIpAddress, Date createTime, Date updateTime) {
        this.id = id;
        this.orderId = orderId;
        this.userId = userId;
        this.money = money;
        this.score = score;
        this.accNo = accNo;
        this.certifTp = certifTp;
        this.certifId = certifId;
        this.customerNm = customerNm;
        this.state = state;
        this.ipAddress = ipAddress;
        this.backIpAddress = backIpAddress;
        this.createTime = createTime;
        this.updateTime = updateTime;
    }

    public OrderDf() {
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
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

    public String getAccNo() {
        return accNo;
    }

    public void setAccNo(String accNo) {
        this.accNo = accNo == null ? null : accNo.trim();
    }

    public Integer getCertifTp() {
        return certifTp;
    }

    public void setCertifTp(Integer certifTp) {
        this.certifTp = certifTp;
    }

    public String getCertifId() {
        return certifId;
    }

    public void setCertifId(String certifId) {
        this.certifId = certifId == null ? null : certifId.trim();
    }

    public String getCustomerNm() {
        return customerNm;
    }

    public void setCustomerNm(String customerNm) {
        this.customerNm = customerNm == null ? null : customerNm.trim();
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
}