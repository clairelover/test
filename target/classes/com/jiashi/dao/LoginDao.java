package com.jiashi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import com.jiashi.domain.Person;
import com.jiashi.domain.Tree;
import com.jiashi.domain.TreeAndRoleVO;

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
	/*
	 * 
	 * 查询角色与菜单中间表 通过用户id
	 * 
	 */
	public List<TreeAndRoleVO> selectTreeAndRolebyUserInfoId(String userInfoId);
	/*
	 * 
	 * 通过菜单id查询菜单信息
	 * 
	 */
	public Tree selectTreeByTreeid(int treeid);
	

	
}
