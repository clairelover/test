	package com.jiashi.domain;

public class Tree {
	//目录id	
	private int treeid;
	//目录名称
	private String treename;
	//目录子id
	private int prentid;
	//访问路径
	private String url;
	//排序
	private String desc;
	//状态
	private String state;

	public int getTreeid() {
		return treeid;
	}

	public void setTreeid(int treeid) {
		this.treeid = treeid;
	}

	public String getTreename() {
		return treename;
	}

	public void setTreename(String treename) {
		this.treename = treename;
	}

	public int getPrentid() {
		return prentid;
	}

	public void setPrentid(int prentid) {
		this.prentid = prentid;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Tree [treeid=" + treeid + ", treename=" + treename + ", prentid=" + prentid + ", url=" + url + ", desc="
				+ desc + ", state=" + state + "]";
	}


	
	
	
}
