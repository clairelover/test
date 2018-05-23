package com.jiashi.service.impl;



import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;

import org.apache.tomcat.util.security.MD5Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.PersonDao;
import com.jiashi.domain.Person;
import com.jiashi.domain.PersonName;
import com.jiashi.service.PersonService;
import com.jiashi.util.JSONUtil;
import com.jiashi.util.Md5Encrypt;



/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class PersonServiceImpl implements PersonService {
	
	 @Autowired
	 private PersonDao personDao;
	 /**
	  * 人员添加按钮
	  */
	@Override
	public String addUserInfo(String username,String userId,
			String enterTime,String userConnect,
			String emerContPer,String emrContCont, 
			String password) throws Exception {
		// 判断不能为空的字段
		if (username == null || userId == null || password == null || "".equals(username) || "".equals(userId)
				|| "".equals(password)) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败,请填好必填字段");
		} else {
			// 将入职时间字符串转换成date类型
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(enterTime);

			// 获取当前时间
			Date createTime = new Date();

			String id = UUID.randomUUID().toString().replaceAll("-", "");

			String isDelete = "0";
			// 对密码进行md5加密
			String passwordToMD5 = Md5Encrypt.md5(password);

			Person person = new Person();
			person.setId(id);
			person.setUsername(username);
			person.setUserid(userId);
			person.setEnterTime(date);
			person.setCreateTime(createTime);
			person.setUserConnect(userConnect);
			person.setEmrContCont(emrContCont);
			person.setEmerContPer(emerContPer);
			person.setIsDelete(isDelete);
			person.setPassword(passwordToMD5);
			int addPerson;

			try {
				addPerson = personDao.addPerson(person);
			} catch (Exception e) {
				return JSONUtil.objectToJSONString(false, null, "", "插入失败");
			}

			String objectToJSONString = JSONUtil.objectToJSONString(true, person.toString(), "", "插入成功");

			return objectToJSONString;
		}

	}

	@Override
	public String findPersonByUserid(String userId) throws Exception {
		 if(userId == null){
			 return JSONUtil.objectToJSONString(false, null, "", "查询失败,请输入Id");
		 }
		 Person findByPerson;
		try {
			findByPerson = personDao.findPersonByUserid(userId);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "查询失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(true, findByPerson, "", "查询成功");
		return objectToJSONString;
	}

	@Override
	public String selectPerson() throws Exception {
		 List<Person> selectPerson;
		try {
			selectPerson = personDao.selectPerson();
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, selectPerson, "", "插入成功");
		return objectToJSONString;
	}

	@Override
	public String deletePersonByUserID(String userId) throws Exception {
		if(userId==null){
			return JSONUtil.objectToJSONString(false, null, "", "删除失败");
		}
		int deletePersonByUserId =0;
		try {
			 deletePersonByUserId = personDao.deletePersonByUserId(userId);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "删除失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, deletePersonByUserId, "", "删除成功");
		return objectToJSONString;
	}

	@Override
	public String selectPersonByUserName(String dayCostUserName2) throws Exception {
		Person selectPersonByName =null;
		try {
			selectPersonByName = personDao.selectPersonByName(dayCostUserName2);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, selectPersonByName, "", "插入成功");
		return objectToJSONString;
	}

 



	
	
	




}
