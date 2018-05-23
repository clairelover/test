package com.jiashi.service;

public interface JsinforExamZService {
	    //插入试题
		int insertCreateQuestion(String topic);

		//更新试题
		int upQuestion(String upQuestion);
	    //删除试题
		int deleteQuestionId(String parameter);
}
