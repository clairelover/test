package com.jiashi.web;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiashi.service.QuestionnaireService;
import com.jiashi.util.JSONUtil;

	@RestController
	public class QuestionnaireController {
		@Autowired
		QuestionnaireService questionnaireService;
	   
		@RequestMapping(value="createQuestionnaire")
		public String createQuestionnaire(HttpServletRequest request/*String jsonQue*/) {
			
			String jsonQues = request.getParameter("jsonQues");
			   jsonQues = "{\"quesId\":2,\"quesName\":\"zah\"}";
				 int createQuestionnaire = questionnaireService.createQuestionnaire(jsonQues);
				 if(createQuestionnaire<0) {
					 
					 return JSONUtil.objectToJSONString(false, null, "", "失败");
				 }else {
					 
					 return  JSONUtil.objectToJSONString(true, null, "", "成功");
				 }
			
			}
		
		@RequestMapping(value="QueryQuestionnaire")
		public String QueryQuestionnaire(HttpServletRequest request) {
			String jsonQues = request.getParameter("jsonQues");
			jsonQues = "{\"quesName\":\"zah\"}";
			int i = questionnaireService.queryQuestionnaire(jsonQues);
			if(i<=0) {
				 
				 return JSONUtil.objectToJSONString(false, null, "", "查询失败");
			 }else {
				 
				 return  JSONUtil.objectToJSONString(true, null, "", "查询成功");
			 }
		}
			
		}

