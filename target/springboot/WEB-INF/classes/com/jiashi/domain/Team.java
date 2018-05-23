package com.jiashi.domain;

public class Team {

	//团建code
	private String tb_code;
	
	//团建时间
	private String tb_date;
	
	//参与人员
	private String tb_person;
	
	//总计费用
	private double tb_total_money;
	
	//人均费用
	private double tb_av_money;
	
	//是否删除
	private  String isDelete;

	public String getTb_code() {
		return tb_code;
	}

	public void setTb_code(String tb_code) {
		this.tb_code = tb_code;
	}

	public String getTb_date() {
		return tb_date;
	}

	public void setTb_date(String tb_date) {
		this.tb_date = tb_date;
	}

	public String getTb_person() {
		return tb_person;
	}

	public void setTb_person(String tb_person) {
		this.tb_person = tb_person;
	}

	public double getTb_total_money() {
		return tb_total_money;
	}

	public void setTb_total_money(double tb_total_money) {
		this.tb_total_money = tb_total_money;
	}

	public double getTb_av_money() {
		return tb_av_money;
	}

	public void setTb_av_money(double tb_av_money) {
		this.tb_av_money = tb_av_money;
	}

	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}
}
