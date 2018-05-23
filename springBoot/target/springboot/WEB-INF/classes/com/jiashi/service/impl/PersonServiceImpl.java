package com.jiashi.service.impl;



import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.PersonDao;
import com.jiashi.domain.Person;
import com.jiashi.domain.PersonName;
import com.jiashi.service.PersonService;
import com.jiashi.util.JSONUtil;



/**
 * 城市业务逻辑实现类
 *
 * Created by bysocket on 07/02/2017.
 */
@Service
public class PersonServiceImpl implements PersonService {
	
	 @Autowired
	 private PersonDao personDao;

	@Override
	public String addUserInfo(String username, String userId, String enterTime, String userConner, String emerConrPer,
			String emrContCont,String password) throws Exception{
	
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
			if(enterTime==null){
				return JSONUtil.objectToJSONString(false, null, "", "插入失败");
			}
			if(userId==null){
				return JSONUtil.objectToJSONString(false, null, "", "插入失败");
			}
			if(userConner==null){
				return JSONUtil.objectToJSONString(false, null, "", "插入失败");
			}
			if(emerConrPer==null){
				return JSONUtil.objectToJSONString(false, null, "", "插入失败");
			}
			if(emrContCont==null){
				return JSONUtil.objectToJSONString(false, null, "", "插入失败");
			}if (password==null) {
				return JSONUtil.objectToJSONString(false, null, "", "插入失败");
			}

			Date parse = sdf.parse(enterTime);
			Double userConnect = Double.valueOf(userConner);
			Double emrContCont1 = Double.valueOf(emrContCont);
			String isDelete="0";
			Person person = new Person();
			person.setUsername(username);
		    person.setUserid(userId);
		    person.setEnterTime(parse);
		    person.setUserConnect(userConnect);
			person.setEmrContCont(emrContCont1);
			person.setEmerContPer(emerConrPer);
			person.setIsDelete(isDelete);
			person.setPassword(password);
			int addPerson =0;
			try {
				 addPerson = personDao.addPerson(person);
			} catch (Exception e) {
				return JSONUtil.objectToJSONString(false, null, "", "插入失败");
			}
			
			String objectToJSONString = JSONUtil.objectToJSONString(false, addPerson, "", "插入成功");
			return objectToJSONString;
	}

	@Override
	public String findPersonByUserid(String userId) throws Exception {
		 if(userId == null){
			 return JSONUtil.objectToJSONString(false, null, "", "插入失败,请输入Id");
		 }
		 Person findByPerson;
		try {
			findByPerson = personDao.findPersonByUserid(userId);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, findByPerson, "", "插入成功");
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
