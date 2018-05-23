package com.jiashi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.JsinforExamZDao;
import com.jiashi.domain.Topic;
import com.jiashi.service.JsinforExamZService;
import com.jiashi.util.JsonUtils;

@Service
public class JsinforExamZServiceImpl implements JsinforExamZService {

	@Autowired
	JsinforExamZDao jsinforExamZDao ;
	@Override
	public int insertCreateQuestion(String topic) {
	//获取实例对象
	Topic bean = JsonUtils.toBean(topic, Topic.class);
	
	return jsinforExamZDao.insertCreateQuestion(bean);

		
	}
	@Override
	public int deleteQuestionId(int id) {
		
		return jsinforExamZDao.deleteQuestionId(id);
	
	}
	@Override
	public int upQuestion(String upQuestion) {
		Topic bean = JsonUtils.toBean(upQuestion, Topic.class);
		return jsinforExamZDao.upQuestion(bean);
	}
	
	
	

}
