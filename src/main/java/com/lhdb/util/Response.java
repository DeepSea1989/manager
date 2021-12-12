package com.lhdb.util;

public class Response {
	
	
	//操作成功还是失败
	private boolean success = true;
	
	//错误信息
	private String message = "";
	
	//返回的业务数据
	private Object data;
	
	//查询条件
	private Object params;
	
	
	public Response(){
		super();
	}
	
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

	public Object getParams() {
		return params;
	}

	public void setParams(Object params) {
		this.params = params;
	}
}
