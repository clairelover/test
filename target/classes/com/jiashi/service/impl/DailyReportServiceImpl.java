package com.jiashi.service.impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.DailyReportDao;
import com.jiashi.domain.DailyReport;
import com.jiashi.service.DailyReportService;
import com.jiashi.util.JSONUtil;

@Service
public class DailyReportServiceImpl implements DailyReportService {

	@Autowired
	private DailyReportDao dailyReportDao;

	/**
	 * 添加工作日报 日报每日只能发一次 1.先通过日期与用户id查询今天是否写工作日报,如果已写反回给前台一个标识 2.如果没有写可以添加工作日报
	 * @throws ParseException 
	 */

	@SuppressWarnings("null")
	@Override
	public String addReport(String userid, String username, String reportDate, String todaysWorkRecord,
			String coordination, String otherCases, String tmorrowPlan, String attachmentPath)  {

		//声明一个日期
		Date RD = null;
		try {
			// 将创建时间时间字符串转换成date类型
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			RD = sdf.parse(reportDate);
		} catch (ParseException e1) {
			
			e1.printStackTrace();;
		}
		
		DailyReport report = dailyReportDao.queryReportByDate(RD, userid);

		if (report == null) {
			
			
			//获取当天时间
			Date d = new Date();
			
			String id = UUID.randomUUID().toString().replaceAll("-", "");

			String isDelete = "0";
			// 将数据封装进对象
			report.setId(id);
			report.setUserid(userid);
			report.setReportDate(RD);
			report.setUserName(username);
			report.setCreateTime(d);
			report.setTodaysWorkRecord(todaysWorkRecord);
			report.setCoordination(coordination);
			report.setOtherCases(otherCases);
			report.setTmorrowPlan(tmorrowPlan);
			report.setAttachmentPath(attachmentPath);
			report.setIsDelete(isDelete);
			report.setCreateUser(username);

			try {

				int i = dailyReportDao.addReport(report);
				if (i >= 1) {
					report.setType("1");
					return JSONUtil.objectToJSONString(true, report, "", "添加成功");
				}else {
					report.setType("0");
					return JSONUtil.objectToJSONString(false, report, "", "添加失败");
				}

			} catch (Exception e) {
				return JSONUtil.objectToJSONString(false, null, "", "调用DAO添加语句时出错");
			}

		}else {
			 return JSONUtil.objectToJSONString(false, null, "", "今日已写过工作日报");
		}

		
	}

}
