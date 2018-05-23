package com.jiashi.domain;

import java.util.Date;

public class Topic {
	
	/**
	 * 题目表实体类
	 */
	//题目ID
	private int topicId;
	
	//题目名称
	private String topicName;
	
	//题目类型
	private int topicType;
	
	//题目分值
	private int topicScore;
	
	
	//答案
	private String answer;
	
	//是否必答
	private int isNecessary;
	
	//创建人名称
	private String createUser;
	
	//创建日期
	private Date createDate;
	
	//修改人名称
	private String updateUser;
	
	//修改日期
	private Date updateDate;

	


	public Topic(int topicId, String topicName, int topicType, int topicScore, String answer, int isNecessary,
			String createUser, Date createDate, String updateUser, Date updateDate) {
		super();
		this.topicId = topicId;
		this.topicName = topicName;
		this.topicType = topicType;
		this.topicScore = topicScore;
		this.answer = answer;
		this.isNecessary = isNecessary;
		this.createUser = createUser;
		this.createDate = createDate;
		this.updateUser = updateUser;
		this.updateDate = updateDate;
	}




	public int getTopicId() {
		return topicId;
	}




	public void setTopicId(int topicId) {
		this.topicId = topicId;
	}




	public String getTopicName() {
		return topicName;
	}




	public void setTopicName(String topicName) {
		this.topicName = topicName;
	}




	public int getTopicType() {
		return topicType;
	}




	public void setTopicType(int topicType) {
		this.topicType = topicType;
	}




	public int getTopicScore() {
		return topicScore;
	}




	public void setTopicScore(int topicScore) {
		this.topicScore = topicScore;
	}




	public String getAnswer() {
		return answer;
	}




	public void setAnswer(String answer) {
		this.answer = answer;
	}




	public int isNecessary() {
		return isNecessary;
	}




	public void setNecessary(int isNecessary) {
		this.isNecessary = isNecessary;
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




	public Topic() {
		super();
		
	}
 



}
