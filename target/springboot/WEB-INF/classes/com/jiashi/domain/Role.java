package com.jiashi.domain;

public class Role {

	// 角色id
	private String roleid;
	// 角色名
	private String rolename;
	// 角色标识
	private String roletype;
	// 角色状态
	private String state;

	public String getRoleid() {
		return roleid;
	}

	public void setRoleid(String roleid) {
		this.roleid = roleid;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public String getRoletype() {
		return roletype;
	}

	public void setRoletype(String roletype) {
		this.roletype = roletype;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", rolename=" + rolename + ", roletype=" + roletype + ", state=" + state
				+ "]";
	}

}
