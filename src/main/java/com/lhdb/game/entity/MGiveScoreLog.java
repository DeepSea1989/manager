package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@ToString
@Builder
@Table(name = "m_give_score_log")
public class MGiveScoreLog  extends BasePojo {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "user_id",type = MySqlTypeConstant.INT,length = 11)
    private Integer userId;

    @Column(name = "type",type = MySqlTypeConstant.INT,length = 3)
    private Integer type;

    @Column(name = "master_id",type = MySqlTypeConstant.INT,length = 11)
    private Integer masterId;

    @Column(name = "score",type = MySqlTypeConstant.BIGINT,length = 20)
    private Long score;

    @Column(name = "reason",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String reason;

    @Column(name = "client_ip",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String clientIp;

    @Column(name = "create_time",type = MySqlTypeConstant.DATETIME)
    private Date createTime;

    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String name;

    @Column(name = "transfer_name",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String transferName;

    @Column(name = "start",type = MySqlTypeConstant.VARCHAR, length = 30)
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private String start;

    @Column(name = "end",type = MySqlTypeConstant.VARCHAR, length = 30)
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private String end;

    public MGiveScoreLog(Integer id, Integer userId, Integer type, Integer masterId, Long score, String reason, String clientIp, Date createTime) {
        this.id = id;
        this.userId = userId;
        this.type = type;
        this.masterId = masterId;
        this.score = score;
        this.reason = reason;
        this.clientIp = clientIp;
        this.createTime = createTime;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransferName() {
        return transferName;
    }

    public void setTransferName(String transferName) {
        this.transferName = transferName;
    }

    public MGiveScoreLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getMasterId() {
        return masterId;
    }

    public void setMasterId(Integer masterId) {
        this.masterId = masterId;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getClientIp() {
        return clientIp;
    }

    public void setClientIp(String clientIp) {
        this.clientIp = clientIp == null ? null : clientIp.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}