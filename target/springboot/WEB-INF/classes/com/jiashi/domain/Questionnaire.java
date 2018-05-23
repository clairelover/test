package com.jiashi.domain;

import java.util.Date;


public class Questionnaire {

	private String  quesId;
	private String quesName;
	private String quesType;
	private String quesTime;
	private String quesSum;
	private String remark;
	private String createUser;
	private Date createDate;
	private String updateUser;
	private Date updateDate;
	public String  getQuesId() {
		return quesId;
	}
	public void setQuesId(String quesId) {
		this.quesId = quesId;
	}
	public String getQuesName() {
		return quesName;
	}
	public void setQuesName(String quesName) {
		this.quesName = quesName;
	}
	public String getQuesType() {
		return quesType;
	}
	public void setQuesType(String quesType) {
		this.quesType = quesType;
	}
	public String getQuesTime() {
		return quesTime;
	}
	public void setQuesTime(String quesTime) {
		this.quesTime = quesTime;
	}
	public String getQuesSum() {
		return quesSum;
	}
	public void setQuesSum(String quesSum) {
		this.quesSum = quesSum;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	
	public Questionnaire() {
		super();
	}
	public Questionnaire(String quesId, String quesName, String quesType, String quesTime, String quesSum, String remark,
			String createUser, Date createDate, String updateUser, Date updateDate) {
		super();
		this.quesId = quesId;
		this.quesName = quesName;
		this.quesType = quesType;
		this.quesTime = quesTime;
		this.quesSum = quesSum;
		this.remark = remark;
		this.createUser = createUser;
		this.createDate = createDate;
		this.updateUser = updateUser;
		this.updateDate = updateDate;
	}
	
}
