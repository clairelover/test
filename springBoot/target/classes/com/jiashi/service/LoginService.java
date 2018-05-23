package com.jiashi.service;

import com.jiashi.domain.Person;

public interface LoginService {

	// 检验用户登录
	public Person checkLogin(String userid, String password);

	

}
