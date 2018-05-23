package com.jiashi.domain;

import java.util.Date;

public class Person {
	// 表id
	private String id;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	// 用户名
	private String username;

	// 用户id
	private String userid;

	// 入职时间
	private Date enterTime;

	// 联系方式
	private String userConnect;

	// 紧急联系人
	private String emerContPer;

	// 紧急联系方式
	private String emrContCont;

	// 是否删除
	private String isDelete;

	// 密码
	private String password;

	// 创建时间
	private Date createTime;

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
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

	public String getUserConnect() {
		return userConnect;
	}

	public void setUserConnect(String userConnect) {
		this.userConnect = userConnect;
	}

	public String getEmerContPer() {
		return emerContPer;
	}

	public void setEmerContPer(String emerContPer) {
		this.emerContPer = emerContPer;
	}

	public String getEmrContCont() {
		return emrContCont;
	}

	public void setEmrContCont(String emrContCont) {
		this.emrContCont = emrContCont;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", username=" + username + ", userid=" + userid + ", enterTime=" + enterTime
				+ ", userConnect=" + userConnect + ", emerContPer=" + emerContPer + ", emrContCont=" + emrContCont
				+ ", isDelete=" + isDelete + ", password=" + password + ", createTime=" + createTime + "]";
	}

}
