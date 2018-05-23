package com.jiashi.domain;

public class DayCostTal {

	//编号
	private String DayCostNum;
	//月份
	private String DayCostMonth;
	//用户名称
	private String DayCostUserName;
	//所在项目
	private String DayCostProject;
	//人天单价
	private double DayCostOneCost;
	//人天数量
	private double DayCostDayNum;
	//人天总成本
	private double DayCostTotalCost;
	//gp值
	private String gp;
	//是否删除
	private String isDelete;
	//营业额
	private double TalCost;
	public double getTalCost() {
		return TalCost;
	}
	public void setTalCost(double talCost) {
		TalCost = talCost;
	}
	public String getIsDelete() {
		return isDelete;
	}
	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
	public String getDayCostNum() {
		return DayCostNum;
	}
	public void setDayCostNum(String dayCostNum) {
		DayCostNum = dayCostNum;
	}
	public String getDayCostMonth() {
		return DayCostMonth;
	}
	public void setDayCostMonth(String dayCostMonth) {
		DayCostMonth = dayCostMonth;
	}
	public String getDayCostUserName() {
		return DayCostUserName;
	}
	public void setDayCostUserName(String dayCostUserName) {
		DayCostUserName = dayCostUserName;
	}
	public String getDayCostProject() {
		return DayCostProject;
	}
	public void setDayCostProject(String dayCostProject) {
		DayCostProject = dayCostProject;
	}
	public double getDayCostOneCost() {
		return DayCostOneCost;
	}
	public void setDayCostOneCost(double dayCostOneCost) {
		DayCostOneCost = dayCostOneCost;
	}
	public double getDayCostDayNum() {
		return DayCostDayNum;
	}
	public void setDayCostDayNum(double dayCostDayNum) {
		DayCostDayNum = dayCostDayNum;
	}
	public double getDayCostTotalCost() {
		return DayCostTotalCost;
	}
	public void setDayCostTotalCost(double dayCostTotalCost) {
		DayCostTotalCost = dayCostTotalCost;
	}
	public String getGp() {
		return gp;
	}
	public void setGp(String gp) {
		this.gp = gp;
	}
}
