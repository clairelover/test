package com.jiashi.domain;

/**
 * 
 * <pre>
 * 项目名称：springBoot    
 * 类名称：TreeAndRoleVO    
 * 类描述：   角色关联菜单对应实体类 
 * 创建人：宋嘉祥 872652568@qq.com
 * 创建时间：2018年5月8日 下午10:32:20    
 * 修改人	      
 * 修改时间：2018年5月8日 下午10:32:20    
 * 修改备注：       
 * &#64;version
 * </pre>
 */
public class TreeAndRoleVO {

	// 中间表id
	private String id;

	// 菜单id
	private int treeid;

	// 角色id
	private String roleid;

	// 用户id
	private String userInfoId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTreeid() {
		return treeid;
	}

	public void setTreeid(int treeid) {
		this.treeid = treeid;
	}

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getUserInfoId() {
		return userInfoId;
	}

	public void setUserInfoId(String userInfoId) {
		this.userInfoId = userInfoId;
	}

	@Override
	public String toString() {
		return "TreeAndRoleVO [id=" + id + ", treeid=" + treeid + ", roleid=" + roleid + ", userInfoId=" + userInfoId
				+ "]";
	}


}
