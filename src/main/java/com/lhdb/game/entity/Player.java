package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.*;

import java.util.Date;

@Data
@ToString
@Builder
@Table(name = "player")
public class Player {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "user_id",type = MySqlTypeConstant.BIGINT,length = 11)
    private Long userId;

    @Column(name = "user_name",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String user_name;

    @Column(name = "password",type = MySqlTypeConstant.VARCHAR,length = 64)
    private String password;

    @Column(name = "bank_password",type = MySqlTypeConstant.VARCHAR,length = 64)
    private String bank_password;

    @Column(name = "state",type = MySqlTypeConstant.INT,length = 3)
    private Integer state;

    @Column(name = "nick_name",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String nick_name;

    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String name;

    @Column(name = "tel",type = MySqlTypeConstant.VARCHAR,length = 11)
    private String tel;

    @Column(name = "introducer",type = MySqlTypeConstant.INT,length = 3)
    private Integer introducer;

    @Column(name = "icons",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String icons;

    @Column(name = "gender",type = MySqlTypeConstant.INT,length = 3)
    private Integer gender;

    @Column(name = "register_ip",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String registerIp;

    @Column(name = "register_date",type = MySqlTypeConstant.DATETIME)
    private Date registerDate;

    @Column(name = "update_date",type = MySqlTypeConstant.DATETIME)
    private Date updateDate;

    @Column(name = "birthday",type = MySqlTypeConstant.DATETIME)
    private Date birthday;

    @Column(name = "score",type = MySqlTypeConstant.BIGINT,length = 30)
    private Long score;

    @Column(name = "brick",type = MySqlTypeConstant.INT,length = 5)
    private Integer brick;

    @Column(name = "acc_no",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String accNo;

    @Column(name = "last_ip",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String lastIp;

    @Column(name = "last_time",type = MySqlTypeConstant.DATETIME)
    private Date lastTime;



    public Player(Integer id, Long userId, String userName, String password, String bankPassword, Integer state, String nickName, String name, String tel, Integer introducer, String icons, Integer gender, String registerIp, Date registerDate, Date updateDate, Date birthday, Long score, Integer brick, String accNo, String lastIP, Date lastTime) {
        this.id = id;
        this.userId = userId;
        this.user_name = userName;
        this.password = password;
        this.bank_password = bankPassword;
        this.state = state;
        this.nick_name = nickName;
        this.name = name;
        this.tel = tel;
        this.introducer = introducer;
        this.icons = icons;
        this.gender = gender;
        this.registerIp = registerIp;
        this.registerDate = registerDate;
        this.updateDate = updateDate;
        this.birthday = birthday;
        this.score = score;
        this.brick = brick;
        this.accNo = accNo;
        this.lastIp = lastIP;
        this.lastTime = lastTime;
    }

    public Player() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return user_name;
    }

    public void setUserName(String userName) {
        this.user_name = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getBankPassword() {
        return bank_password;
    }

    public void setBankPassword(String bankPassword) {
        this.bank_password = bankPassword == null ? null : bankPassword.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getNickName() {
        return nick_name;
    }

    public void setNickName(String nickName) {
        this.nick_name = nickName == null ? null : nickName.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public Integer getIntroducer() {
        return introducer;
    }

    public void setIntroducer(Integer introducer) {
        this.introducer = introducer;
    }

    public String getIcons() {
        return icons;
    }

    public void setIcons(String icons) {
        this.icons = icons == null ? null : icons.trim();
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getRegisterIp() {
        return registerIp;
    }

    public void setRegisterIp(String registerIp) {
        this.registerIp = registerIp == null ? null : registerIp.trim();
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public Integer getBrick() {
        return brick;
    }

    public void setBrick(Integer score) {
        this.brick = score;
    }

    public String getAccNo(){return accNo;}

    public void setAccNo(String accNo){ this.accNo = accNo; }

    public String getLastIp(){return lastIp;}

    public void setLastIp(String lastIP){ this.lastIp = lastIP; }

    public Date getLastTime(){return lastTime;}

    public void setLastTime(Date lastTime){ this.lastTime = lastTime; }
}