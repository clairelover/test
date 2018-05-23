package com.jiashi.dao;

import com.jiashi.domain.Topic;

public interface JsinforExamZDao {
   
	//添加试题
	int insertCreateQuestion(Topic bean);
    //删除试题
	int deleteQuestionId(int id);
	
	int upQuestion(Topic bean);
	

	

	

	

}
