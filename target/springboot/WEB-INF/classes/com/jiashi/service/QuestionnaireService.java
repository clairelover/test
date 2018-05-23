package com.jiashi.service;

public interface QuestionnaireService {
	/*String  createQuestionnaire(Questionnaire obj)throws Exception;*/

	int createQuestionnaire(String jsonQues);

	int queryQuestionnaire(String jsonQues);
}
