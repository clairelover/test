package com.jiashi.dao;

import com.jiashi.domain.Questionnaire;

public interface QuestionnaireDao {



	int insertQuestionnaire(Questionnaire bean);

	int selectQuestionnaire(String quesId);

}
