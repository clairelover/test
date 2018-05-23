package com.jiashi.domain;

/**
 * @author xiatingting
 * 此类用来表示查询返回的结果对象
 *
 */
public class ObjectQuestionnaire {

	//试卷Id
	private String quesId;
	//试卷名
	private String quesName;
	//试卷类型
	private int  quesType;
	//答题时间
	private int  quesTime; 
	//试卷分数
	private String quesSum;
	//题目
	private String topicName;
	//题目类型
	private int topicType;
	//题目分值
	private int topicScore;
	//题目选项
	private String examOption;
	public String getQuesId() {
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
	public int getQuesTime() {
		return quesTime;
	}
	public void setQuesTime(int quesTime) {
		this.quesTime = quesTime;
	}
	public String getQuesSum() {
		return quesSum;
	}
	public void setQuesSum(String quesSum) {
		this.quesSum = quesSum;
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
	public String getExamOption() {
		return examOption;
	}
	public void setExamOption(String examOption) {
		this.examOption = examOption;
	}
	public int getTopicScore() {
		return topicScore;
	}
	public void setTopicScore(int topicScore) {
		this.topicScore = topicScore;
	}
	public ObjectQuestionnaire(String quesId, String quesName, int quesType, int quesTime, String quesSum,
			String topicName, int topicType, int topicScore, String examOption) {
		super();
		this.quesId = quesId;
		this.quesName = quesName;
		this.quesType = quesType;
		this.quesTime = quesTime;
		this.quesSum = quesSum;
		this.topicName = topicName;
		this.topicType = topicType;
		this.topicScore = topicScore;
		this.examOption = examOption;
	}
	public ObjectQuestionnaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
