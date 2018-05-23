package com.jiashi.domain;

import java.util.Date;

public class ExamOption {

	private String optionId;
	private String optionMark;
	private String topicId;
	private String examOption;
	private String createUser;
	private String updateUser;
	private Date createDate;
	private Date updateDate;
	public String getOptionId() {
		return optionId;
	}
	public void setOptionId(String optionId) {
		this.optionId = optionId;
	}
	public String getOptionMark() {
		return optionMark;
	}
	public void setOptionMark(String optionMark) {
		this.optionMark = optionMark;
	}
	public String getTopicId() {
		return topicId;
	}
	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}
	public String getExamOption() {
		return examOption;
	}
	public void setExamOption(String examOption) {
		this.examOption = examOption;
	}
	public String getCreateUser() {
		return createUser;
	}
	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}
	public String getUpdateUser() {
		return updateUser;
	}
	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public ExamOption(String optionId, String optionMark, String topicId, String examOption, String createUser,
			String updateUser, Date createDate, Date updateDate) {
		super();
		this.optionId = optionId;
		this.optionMark = optionMark;
		this.topicId = topicId;
		this.examOption = examOption;
		this.createUser = createUser;
		this.updateUser = updateUser;
		this.createDate = createDate;
		this.updateDate = updateDate;
	}
	public ExamOption() {
		super();
	}
	
	
}
