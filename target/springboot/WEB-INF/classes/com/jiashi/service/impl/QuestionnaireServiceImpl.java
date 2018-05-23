package com.jiashi.service.impl;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.QuestionnaireDao;
import com.jiashi.domain.Questionnaire;
import com.jiashi.service.QuestionnaireService;
import com.jiashi.util.JsonUtils;
/**
 * @author claire
 *
 */
@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {
	@Autowired
	QuestionnaireDao questionnaireDao;

	@Override
	public int createQuestionnaire(String jsonQues) {
		Questionnaire bean = JsonUtils.toBean(jsonQues, Questionnaire.class);
		String uuid = UUID.randomUUID().toString().replace("-", "");
		bean.setQuesId(uuid);
		return questionnaireDao.insertQuestionnaire(bean);
	}

	@Override
	public int  queryQuestionnaire(String jsonQues) {
		Questionnaire bean = JsonUtils.toBean(jsonQues, Questionnaire.class);
		String quesId = bean.getQuesId();
		return questionnaireDao.selectQuestionnaire(quesId);
	}
	

}
