package com.jiashi.domain;

import java.util.Date;

public class Person {

	
	//用户名
	private String username;
	
	
	//用户id
	private String userid;
	
	
	//入职时间
	private Date enterTime;
	
	
	//联系方式
	private double userConnect;
	
	
	//紧急联系人
	private String emerContPer;
	
	
	//紧急联系方式
	private double emrContCont;
	
	
	//是否删除
	private String isDelete;
	
	//密码
	private String password;


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getUserid() {
		return userid;
	}


	public void setUserid(String userid) {
		this.userid = userid;
	}


	public Date getEnterTime() {
		return enterTime;
	}


	public void setEnterTime(Date enterTime) {
		this.enterTime = enterTime;
	}


	public double getUserConnect() {
		return userConnect;
	}


	public void setUserConnect(double userConnect) {
		this.userConnect = userConnect;
	}




	@Override
	public String toString() {
		return "Person [username=" + username + ", userid=" + userid + ", enterTime=" + enterTime + ", userConnect="
				+ userConnect + ", emerContPer=" + emerContPer + ", emrContCont=" + emrContCont + ", isDelete="
				+ isDelete + ", password=" + password + "]";
	}


	public String getEmerContPer() {
		return emerContPer;
	}


	public void setEmerContPer(String emerContPer) {
		this.emerContPer = emerContPer;
	}


	public double getEmrContCont() {
		return emrContCont;
	}


	public void setEmrContCont(double emrContCont) {
		this.emrContCont = emrContCont;
	}


	public String getIsDelete() {
		return isDelete;
	}


	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
}
