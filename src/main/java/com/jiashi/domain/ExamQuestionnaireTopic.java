package com.jiashi.domain;


public class ExamQuestionnaireTopic {

	//试卷的id
	private String questionnaireId;  
     //题目的id
	private String topicId;

	public String getQuestionnaireId() {
		return questionnaireId;
	}

	public void setQuestionnaireId(String questionnaireId) {
		this.questionnaireId = questionnaireId;
	}

	public String getTopicId() {
		return topicId;
	}
	
	@Override
	public String toString() {
		return "ExamQuestionnaireTopic [questionnaireId=" + questionnaireId + ", topicId=" + topicId + "]";
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public ExamQuestionnaireTopic() {
		super();
	}

	public ExamQuestionnaireTopic(String questionnaireId, String topicId) {
		super();
		this.questionnaireId = questionnaireId;
		this.topicId = topicId;
	}
}
