package com.jiashi.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiashi.domain.ObjectQuestionnaire;
import com.jiashi.service.JsinforExamZService;
import com.jiashi.service.QuestionnaireService;
import com.jiashi.util.JSONUtil;
import com.jiashi.util.JsonUtils;

/**
 * @author xiatingting
 *
 */
@RestController
public class QuestionnaireController {
	@Autowired
	QuestionnaireService questionnaireService;
	@Autowired
	JsinforExamZService jsinforExamServcie;

	/**
	 * 此方法用于创建试卷
	 * 
	 * @param request
	 * @return String
	 */
	@RequestMapping(value = "createQuestionnaire")
	public String createQuestionnaire(HttpServletRequest request/* String jsonQue */) {
		// 获取前台传过来的Json串 为方便测试 在后台写入json字符串
		String jsonQues = request.getParameter("jsonQues");
		jsonQues = "{\"quesId\":4,\"quesName\":\"ddkhh\"}";
		int createQuestionnaire = questionnaireService.createQuestionnaire(jsonQues);
		if (createQuestionnaire < 0) {
			String objectToJSONString = JSONUtil.objectToJSONString(false, null, "", "添加试卷失败");
			return objectToJSONString;

		} else {

			String objectToJSONString = JSONUtil.objectToJSONString(true, null, "", "添加试卷成功");
			return objectToJSONString;

		}

	}

	/**
	 * 此方法用于查询试卷
	 * 
	 * @param request
	 * @return String
	 */
	@RequestMapping(value = "queryQuestionnaire")
	public String queryQuestionnaire(HttpServletRequest request) {
		String jsonQues = request.getParameter("jsonQues");
		jsonQues = "{\"quesId\":\"4da14d27bd84423e852fb5848fb77642\",\"quesName\":\"ddkhh\"}";
		// 将查询的结果集封装成list
		List<ObjectQuestionnaire> questionnaires = questionnaireService.queryQuestionnaire(jsonQues);
		String jsonString = JsonUtils.toJSONString(questionnaires);
		if (questionnaires.size() <= 0) {

			return JSONUtil.objectToJSONString(false, null, "", "查询失败");
		} else {

			return jsonString;
		}
	}

	/**
	 * 此方法用于删除试卷
	 * 
	 * @param request
	 * @return String
	 */
	@RequestMapping(value = "deleteQuestionnaire")
	public String deleteQuestionnaire(HttpServletRequest request) {
		String jsonQues = request.getParameter("jsonQues");
		jsonQues = "{\"quesId\":\"4da14d27bd84423e852fb5848fb77642\",\"quesName\":\"ddkhh\"}";
		int i = questionnaireService.deleteQuestionnaire(jsonQues);
		if (i <= 0) {
			String objectToJSONString = JSONUtil.objectToJSONString(false, null, "", "删除失败");
			return objectToJSONString;
		} else {
			String objectToJSONString = JSONUtil.objectToJSONString(true, null, "", "删除成功");
			return objectToJSONString;
		}
	}

	/**
	 * 此方法用于修改试卷
	 * 
	 * @param request
	 * @return
	 */
	@RequestMapping("updateQuestionnaire")
	public String updateQuestionnaire(HttpServletRequest request) {
		String jsonQues = request.getParameter("jsonQues");
		jsonQues = "{\"quesId\":\"d08380eb49dd4101aceff1675f9e0b4e\",\"quesName\":\"ddkhh\"}";
		int i = questionnaireService.deleteQuestionnaire(jsonQues);
		if (i <= 0) {
			String objectToJSONString = JSONUtil.objectToJSONString(false, null, "", "更新失败");
			return objectToJSONString;
		} else {

			String objectToJSONString = JSONUtil.objectToJSONString(true, null, "", "更新成功");
			return objectToJSONString;
		}

	}

}
