package com.jiashi.dao;

import com.jiashi.domain.Topic;

public interface JsinforExamZDao {

	int insertCreateQuestion(Topic bean);
	
	int upQuestion(Topic bean);
	
	int deleteQuestionId(Topic bean);
	
	
}
