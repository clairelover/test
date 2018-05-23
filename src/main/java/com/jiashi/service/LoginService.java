package com.jiashi.service;

import java.util.List;

import com.jiashi.domain.Person;
import com.jiashi.domain.Tree;

public interface LoginService {

	// 检验用户登录
	public Person checkLogin(String userid, String password);

	
	//查询菜单
	public List<Tree> queryTree(String userInfoId);

	

}
