package com.jiashi.util;


 import java.io.Serializable;
 public class JsonObjectResult implements Serializable
 {
	 private static final long serialVersionUID = 2433005115382517455L;



	 private Boolean succeed;//状态 true  false
	 private String code;//编码
	 private String msg;//消息
	 private Object data; //数据



	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	 public Boolean getSucceed() {
		 return succeed;
	 }

	 public void setSucceed(Boolean succeed) {
		 this.succeed = succeed;
	 }
	
	
	 }