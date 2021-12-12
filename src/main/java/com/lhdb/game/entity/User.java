package com.lhdb.game.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import com.lhdb.game.mongo.entity.UserBank;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@ToString
@Builder
@Table(name = "user")
public class User extends BasePojo {
    @Column(name = "id",type = MySqlTypeConstant.INT,length = 11,isKey = true,isAutoIncrement = true)
    private Integer id;

    @Column(name = "user_id",type = MySqlTypeConstant.INT,length = 11)
    private Integer userId;

    @Column(name = "user_name",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String userName;

    @Column(name = "password",type = MySqlTypeConstant.VARCHAR,length = 64)
    private String password;

    @Column(name = "bank_password",type = MySqlTypeConstant.VARCHAR,length = 64)
    private String bankPassword;

    @Column(name = "state",type = MySqlTypeConstant.INT,length = 3)
    private Integer state;

    @Column(name = "nick_name",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String nickName;

    @Column(name = "name",type = MySqlTypeConstant.VARCHAR,length = 20)
    private String name;

    @Column(name = "tel",type = MySqlTypeConstant.VARCHAR,length = 11)
    private String tel;

    @Column(name = "introducer",type = MySqlTypeConstant.INT,length = 11)
    private Integer introducer;

    @Column(name = "icons",type = MySqlTypeConstant.VARCHAR, length = 200)
    private String icons;

    @Column(name = "gender",type = MySqlTypeConstant.INT,length = 1)
    private Integer gender;

    @Column(name = "register_ip",type = MySqlTypeConstant.VARCHAR,length = 30)
    private String registerIp;

    @Column(name = "register_date",type = MySqlTypeConstant.DATETIME)
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date registerDate;

    @Column(name = "update_date",type = MySqlTypeConstant.DATETIME)
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private Date updateDate;

    @Column(name = "birthday",type = MySqlTypeConstant.DATETIME)
    private Date birthday;

    @Column(name = "verify_code",type = MySqlTypeConstant.VARCHAR,length = 6)
    private String verifyCode;

    private UserBank userBank;

    @Column(name = "start",type = MySqlTypeConstant.VARCHAR,length = 30)
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private String start;

    @Column(name = "end",type = MySqlTypeConstant.VARCHAR,length = 30)
    @DateTimeFormat( pattern = "yyyy-MM-dd HH:mm:ss" )
    private String end;

    private List<Integer> ids;

    public User(Integer id, Integer userId, String userName, String password, String bankPassword, Integer state, String nickName, String name, String tel, Integer introducer, String icons, Integer gender, String registerIp, Date registerDate, Date updateDate, Date birthday) {
        this.id = id;
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.bankPassword = bankPassword;
        this.state = state;
        this.nickName = nickName;
        this.name = name;
        this.tel = tel;
        this.introducer = introducer;
        this.icons = icons;
        this.gender = gender;
        this.registerIp = registerIp;
        this.registerDate = registerDate;
        this.updateDate = updateDate;
        this.birthday = birthday;
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

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public UserBank getUserBank() {
        return userBank;
    }

    public void setUserBank(UserBank userBank) {
        this.userBank = userBank;
    }

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public User() {
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

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getBankPassword() {
        return bankPassword;
    }

    public void setBankPassword(String bankPassword) {
        this.bankPassword = bankPassword == null ? null : bankPassword.trim();
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
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
}