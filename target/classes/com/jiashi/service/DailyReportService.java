package com.jiashi.service;

import java.text.ParseException;

import javax.servlet.http.HttpServletRequest;

public interface DailyReportService {

	public String addReport(String userid,String username,String reportDate, String todaysWorkRecord, String coordination, String otherCases, String tmorrowPlan, String attachmentPath) ;

}
