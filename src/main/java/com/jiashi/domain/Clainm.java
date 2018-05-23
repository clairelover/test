package com.jiashi.domain;


public class Clainm {

	//报销code
	private double claimnum;

	//报销日期
	private String claimDate;
	
	//报销人
	private String claimUserName;
	
	//报销月份
	private String claimMonth;
	
	//报销总金额
	private double claimTotalCrash;

	//是否删除
	private String isDelete;
	public String getIsDelete() {
		return isDelete;
	}

	public void setIsDelete(String isDelete) {
		this.isDelete = isDelete;
	}

	public double getClaimnum() {
		return claimnum;
	}

	public void setClaimnum(double claimnum) {
		this.claimnum = claimnum;
	}

	public String getClaimDate() {
		return claimDate;
	}

	public void setClaimDate(String claimDate) {
		this.claimDate = claimDate;
	}

	public String getClaimUserName() {
		return claimUserName;
	}

	public void setClaimUserName(String claimUserName) {
		this.claimUserName = claimUserName;
	}

	public String getClaimMonth() {
		return claimMonth;
	}

	public void setClaimMonth(String claimMonth) {
		this.claimMonth = claimMonth;
	}

	public double getClaimTotalCrash() {
		return claimTotalCrash;
	}

	public void setClaimTotalCrash(double claimTotalCrash) {
		this.claimTotalCrash = claimTotalCrash;
	}
	
	
}
