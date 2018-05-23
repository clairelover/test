package com.jiashi.dao;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.jiashi.domain.DailyReport;

@Repository
public interface DailyReportDao {
	
	
	
	//通过日期与用户id查询用户这天是否有数据
	public DailyReport queryReportByDate(Date reportDate,String userid);
	
	//添加工作报告
	public int addReport(DailyReport  dailyReport);
}
