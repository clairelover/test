package com.jiashi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.LoginDao;
import com.jiashi.domain.Person;
import com.jiashi.service.LoginService;
import com.jiashi.util.Md5Encrypt;
/**
 * 
 * <pre>项目名称：springBoot    
 * 类名称：LoginServiceImpl    
 * 类描述：    
 * 创建人：宋嘉祥 872652568@qq.com
 * 创建时间：2018年5月7日 下午12:01:35    
 * 修改人	      
 * 修改时间：2018年5月7日 下午12:01:35    
 * 修改备注：       
 * @version </pre>
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;

	/*
	 * 检验用户登录业务
	 * 
	 */

	public Person checkLogin(String userid, String password) {

		Person person = loginDao.findByUsername(userid);
		if (person != null && person.getPassword().equals(Md5Encrypt.md5(password))) {

			return person;
		}
		return null;
	}



}
