package com.jiashi.dao;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginDao {
	
	
	
	public String login(String userid,String password);
}
