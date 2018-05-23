package com.jiashi.service.impl;

import java.util.UUID;

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
	
	@Override//插入试题
	public int insertCreateQuestion(String topic) {
	//获取实例对象
	Topic bean = JsonUtils.toBean(topic, Topic.class);
	//生成UUID
	String uuid = UUID.randomUUID().toString().replace("-", "");
	
	//把uuid放到对象中
	bean.setTopicId(uuid);
     
	return jsinforExamZDao.insertCreateQuestion(bean);

		
	} 

	@Override
	public int upQuestion(String upQuestion) {
		Topic bean = JsonUtils.toBean(upQuestion, Topic.class);	
		
		
		return jsinforExamZDao.upQuestion(bean);
	}

	@Override
	public int deleteQuestionId(String parameter) {
      Topic bean = JsonUtils.toBean(parameter, Topic.class);

		
		return jsinforExamZDao.deleteQuestionId(bean);
		
	}


}
