package com.jiashi.domain;

import java.util.Date;

public class DailyReport {
	//报告表id
	private String id;
	//姓名
	private String userName;
	//创建时间
	private Date createTime;
	//今日工作记录
	private String todaysWorkRecord;
	//需要协调事项
	private String coordination;
	//其他情况反映
	private String otherCases;
	//明日计划
	private String tmorrowPlan;
	//附件路径
	private String attachmentPath;
	//删除状态
	private String isDelete;
	//创建人
	private String createUser;
	//用户账号
	private String userid;
	//标识	
	private String type;
	//报告时间
	private Date reportDate;

	public Date getReportDate() {
		return reportDate;
	}

	public void setReportDate(Date reportDate) {
		this.reportDate = reportDate;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getTodaysWorkRecord() {
		return todaysWorkRecord;
	}

	public void setTodaysWorkRecord(String todaysWorkRecord) {
		this.todaysWorkRecord = todaysWorkRecord;
	}

	public String getCoordination() {
		return coordination;
	}

	public void setCoordination(String coordination) {
		this.coordination = coordination;
	}

	public String getOtherCases() {
		return otherCases;
	}

	public void setOtherCases(String otherCases) {
		this.otherCases = otherCases;
	}

	public String getTmorrowPlan() {
		return tmorrowPlan;
	}

	public void setTmorrowPlan(String tmorrowPlan) {
		this.tmorrowPlan = tmorrowPlan;
	}

	public String getAttachmentPath() {
		return attachmentPath;
	}

	public void setAttachmentPath(String attachmentPath) {
		this.attachmentPath = attachmentPath;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "DailyReport [id=" + id + ", userName=" + userName + ", createTime=" + createTime + ", todaysWorkRecord="
				+ todaysWorkRecord + ", coordination=" + coordination + ", otherCases=" + otherCases + ", tmorrowPlan="
				+ tmorrowPlan + ", attachmentPath=" + attachmentPath + ", isDelete=" + isDelete + ", createUser="
				+ createUser + ", userid=" + userid + ", type=" + type + ", reportDate=" + reportDate + "]";
	}

	
	
	

}
