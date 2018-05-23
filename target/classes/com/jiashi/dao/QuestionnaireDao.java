package com.jiashi.dao;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.jiashi.domain.ObjectQuestionnaire;
import com.jiashi.domain.Questionnaire;

/**
 * 
 * @author xiatingting
 * 
 *
 */
public interface QuestionnaireDao {

	int insertQuestionnaire(Questionnaire bean);

	List<ObjectQuestionnaire> selectQuestionnaire(@Param("quesName") String quesName);

	int deleteQuestionnaire(String quesId);

	int deleteQuestionnaireId(String quesId);

	int updateQuestionnaire(String quesId);
}
