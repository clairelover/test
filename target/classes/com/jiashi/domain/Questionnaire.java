package com.jiashi.domain;

import java.util.Date;


public class Questionnaire {

	private String  quesId;
	private String quesName;
	private int  quesType;
	private String quesTime;
	private String quesSum;
	private String remark;
	private String createUser;
	private Date createDate;
	private String updateUser;
	private Date updateDate;
	private String topicId;
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
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
	
	public int getQuesType() {
		return quesType;
	}
	public void setQuesType(int quesType) {
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
	
	
	
	
	
	
}
