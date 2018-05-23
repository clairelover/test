package com.jiashi.web;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiashi.domain.Person;
import com.jiashi.service.DailyReportService;

@RestController
public class DailyReportController {

	@Autowired
	private DailyReportService dailyReportService;

	/**
	 * <pre>addReport(这里用一句话描述这个方法的作用)   
	 * 创建人：宋嘉祥 872652568@qq.com
	 * 创建时间：2018年5月9日 下午5:53:30    
	 * 修改人：宋嘉祥 872652568@qq.com
	 * 修改时间：2018年5月9日 下午5:53:30    
	 * 修改备注： 
	 * @param createTime 创建日期
	 * @param todaysWorkRecord 今日工作记录
	 * @param coordination 需要协调事项
	 * @param otherCases 其他情况反映
	 * @param tmorrowPlan 明日计划
	 * @param attachmentPath 附件路径
	 * @return</pre>
	 */
	@RequestMapping("addReport")
	public String addReport(HttpSession session,String reportDate, String todaysWorkRecord, String coordination, String otherCases,
			String tmorrowPlan, String attachmentPath) {
			
		Person person = (Person) session.getAttribute("person");

		
		String userid = person.getId();
		String username = person.getUsername();
		
		
		String report = dailyReportService.addReport(userid,username,reportDate,todaysWorkRecord,coordination,otherCases,tmorrowPlan,attachmentPath);

		return report;
	}

}
