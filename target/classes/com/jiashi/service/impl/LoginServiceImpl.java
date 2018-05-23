package com.jiashi.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.LoginDao;
import com.jiashi.domain.Person;
import com.jiashi.domain.Tree;
import com.jiashi.domain.TreeAndRoleVO;
import com.jiashi.service.LoginService;
import com.jiashi.util.Md5Encrypt;

/**
 * 
 * <pre>
 * 项目名称：springBoot    
 * 类名称：LoginServiceImpl    
 * 类描述：    
 * 创建人：宋嘉祥 872652568@qq.com
 * 创建时间：2018年5月7日 下午12:01:35    
 * 修改人	      
 * 修改时间：2018年5月7日 下午12:01:35    
 * 修改备注：       
 * &#64;version
 * </pre>
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

	/*
	 * 根据id查询角色权限下相关的菜单
	 * 
	 */
	@Override
	public List<Tree> queryTree(String userInfoId) {
		// 通过用户id查询菜单与角色中间表
		List<TreeAndRoleVO> TreeAndRoleList = loginDao.selectTreeAndRolebyUserInfoId(userInfoId);
		// 用于封装菜单数据信息
		List<Tree> list = new ArrayList<Tree>();

		for (TreeAndRoleVO treeAndRoleVO : TreeAndRoleList) {
			// 获取每个菜单id
			int treeid = treeAndRoleVO.getTreeid();
			// 通过菜单id查询相关信息
			Tree tree = loginDao.selectTreeByTreeid(treeid);
			// 数据装入集合
			list.add(tree);

		}

		// 返回给controller
		return list;
	}

}
