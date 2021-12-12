package com.lhdb.util;

public enum ResultEnum {
    //这里是可以自己定义的，方便与前端交互即可
    UNKNOWN_ERROR(-1,"未知错误", false),
    SUCCESS(10000,"成功", true),
    USER_NOT_EXIST(1,"用户不存在",false),
    USER_IS_EXISTS(2,"用户已存在",false),
    DATA_IS_NULL(3,"数据为空",false),
    ;
    private Integer code;
    private String msg;
    private Boolean success;

    ResultEnum(Integer code, String msg, Boolean success) {
        this.code = code;
        this.msg = msg;
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Boolean getSuccess(){return success;}
}