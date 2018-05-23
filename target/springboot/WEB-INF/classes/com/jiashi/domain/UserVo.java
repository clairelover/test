package com.jiashi.domain;

import java.util.List;

/**
 * 
 * <pre>
 * 项目名称：springBoot    
 * 类名称：UserVo    
 * 类描述：  用户角色中间表对应实体类
 * 创建人：宋嘉祥 872652568@qq.com
 * 创建时间：2018年5月8日 下午10:29:15    
 * 修改人	      
 * 修改时间：2018年5月8日 下午10:29:15    
 * 修改备注：       
 * &#64;version
 * </pre>
 */
public class UserVo {
	// id
	private String id;
	// 用户id
	private String userInfoId;
	// 角色id
	private String roleid;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(String userInfoId) {
		this.userInfoId = userInfoId;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	@Override
	public String toString() {
		return "UserVo [id=" + id + ", userInfoId=" + userInfoId + ", roleid=" + roleid + "]";
	}

}
