package com.jiashi.service.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.QuestionnaireDao;
import com.jiashi.domain.ObjectQuestionnaire;
import com.jiashi.domain.Questionnaire;
import com.jiashi.service.JsinforExamZService;
import com.jiashi.service.QuestionnaireService;
import com.jiashi.util.JsonUtils;

/**
 * @author xiatingting 此类用于实现 QuestionnaireService
 *
 */
@Service
public class QuestionnaireServiceImpl implements QuestionnaireService {
	@Autowired
	QuestionnaireDao questionnaireDao;
	@Autowired
	JsinforExamZService jsinforExamServcie;

	@Override
	public int createQuestionnaire(String jsonQues) {
		Questionnaire bean = JsonUtils.toBean(jsonQues, Questionnaire.class);
		// 生成试卷同时生成试卷的UUID
		String uuid = UUID.randomUUID().toString().replace("-", "");
		bean.setQuesId(uuid);
		return questionnaireDao.insertQuestionnaire(bean);
	}

	@Override
	public List<ObjectQuestionnaire> queryQuestionnaire(String jsonQues) {
		Questionnaire bean = JsonUtils.toBean(jsonQues, Questionnaire.class);
		// 获取解析后字符串的试卷的名字
		String quesName = bean.getQuesName();
		// 根据试卷名字查询试卷
		List<ObjectQuestionnaire> questionnaire = questionnaireDao.selectQuestionnaire(quesName);

		return questionnaire;
	}

	@Override
	public int deleteQuestionnaire(String jsonQues) {
		Questionnaire bean = JsonUtils.toBean(jsonQues, Questionnaire.class);
		String quesId = bean.getQuesId();
		int j = questionnaireDao.deleteQuestionnaire(quesId);
		if (j > 0) {
			// 如果试卷删除成功 再去删除中间表的id
			int i = questionnaireDao.deleteQuestionnaireId(quesId);
			return i;
		} else {
			return j;
		}

	}

	@Override
	public int updateQuestionnaire(String jsonQues) {
		Questionnaire bean = JsonUtils.toBean(jsonQues, Questionnaire.class);
		String quesId = bean.getQuesId();
		// 返回给controller的结果
		int i = questionnaireDao.updateQuestionnaire(quesId);

		return i;
	}

}
