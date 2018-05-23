package com.jiashi.web;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiashi.service.JsinforExamZService;
import com.jiashi.util.JSONUtil;

@RestController
public class JsinforExamZController {

	@Autowired
	JsinforExamZService JsinforExamZService;
	
	@RequestMapping(value = "createQuestion")
	public String createQuestion(HttpServletRequest request) throws IOException {
		
	  String topic = request.getParameter("topic");
		topic="{\"topicId\":1,\"topicName\":\"zhamgsan\"}";
		int insertCreateQuestion = JsinforExamZService.insertCreateQuestion(topic);
		
		if(insertCreateQuestion< 0) {
			return JSONUtil.objectToJSONString(false, null, "", "添加失败");
			
		}else {
			
			return JSONUtil.objectToJSONString(true, null, "", "添加成功");
		}
		
		
	}
	
	@RequestMapping("deleteQuestion")
	
	public String deleteQuestion(HttpServletRequest request ) throws IOException {
		String parameter = request.getParameter("topicId");
		
		int parseInt = Integer.parseInt(parameter);
	
		int deleteQuestionId = JsinforExamZService.deleteQuestionId(parseInt);
		if(deleteQuestionId<0) {
			return JSONUtil.objectToJSONString(false, null, "", "删除失败");
		}else {
		    return  JSONUtil.objectToJSONString(true, null, "", "删除成功");
		}
	}
	
	@RequestMapping("upQuestion")
	public String upQuestion(String upQuestion) throws IOException {
		int up = JsinforExamZService.upQuestion(upQuestion);
		if(up<0){
			return JSONUtil.objectToJSONString(false, null, "", "修改失败");
		}else {
			return JSONUtil.objectToJSONString(true, null, "", "修改成功");
		}
		
		
	}

	

	/*
	 * @RequestMapping(value = "createAnswer") public String createAnswer(String
	 * answerJson) { List list = null; for (Object object : list) {
	 * 
	 * } }
	 */
}
