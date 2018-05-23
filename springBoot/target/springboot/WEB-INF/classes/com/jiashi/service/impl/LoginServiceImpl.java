package com.jiashi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.LoginDao;
import com.jiashi.service.LoginService;
@Service
public class LoginServiceImpl implements LoginService {
	
	@Autowired
	private LoginDao loginDao;
	
	
	@Override
	public String queryUseridAndPassword(String userid, String password) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
