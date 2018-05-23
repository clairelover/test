package com.jiashi.service;

import java.util.List;

import com.jiashi.domain.ObjectQuestionnaire;


public interface QuestionnaireService {

	int createQuestionnaire(String jsonQues);

	List<ObjectQuestionnaire> queryQuestionnaire(String jsonQues);

	int deleteQuestionnaire(String jsonQues);
	
	
	int updateQuestionnaire(String jsonQues);
}
