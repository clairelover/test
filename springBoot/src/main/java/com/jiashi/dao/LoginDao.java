package com.jiashi.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.jiashi.domain.Person;

@Repository
public interface LoginDao {

	/**
	 * 查找用户名和密码
	 * 
	 * @param username
	 *            登录用户名
	 * @return
	 */
	public Person findByUsername(String userid);

	
}
