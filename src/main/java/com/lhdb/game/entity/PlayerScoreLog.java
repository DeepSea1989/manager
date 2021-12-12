package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@ToString
@Builder
@Table(name = "playerscorelog")
public class PlayerScoreLog {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "userid",type = MySqlTypeConstant.BIGINT,length = 11)
    private Long userid;

    @Column(name = "username",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String username;

    @Column(name = "score",type = MySqlTypeConstant.BIGINT,length = 30)
    private Long score;

    @Column(name = "reson",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String reson;

    @Column(name = "time",type = MySqlTypeConstant.DATETIME)
    private Date time;

    public PlayerScoreLog(Integer id, Long userid, String username, Long score, String reson) {
        this.id = id;
        this.userid = userid;
        this.username = username;
        this.score = score;
        this.reson = reson;
    }

    public PlayerScoreLog() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getReson() {
        return reson;
    }

    public void setReson(String reson) {
        this.reson = reson == null ? null : reson.trim();
    }
}