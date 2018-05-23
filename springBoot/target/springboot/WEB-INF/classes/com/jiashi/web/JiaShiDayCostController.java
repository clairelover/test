package com.jiashi.web;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiashi.domain.DayCost;
import com.jiashi.service.DayCostService;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class JiaShiDayCostController {

	@Autowired
	private DayCostService dayCostService;
	
	
	@RequestMapping(value = "addDayCost")
	public String addDayCost(HttpServletRequest request,HttpServletResponse response) throws Exception {
		//编号
		String DayCostNum = request.getParameter("DayCostNum");
		//月份
		String DayCostMonth =request.getParameter("DayCostMonth");
		if(DayCostMonth == null && "".equals(DayCostMonth)){
			System.out.println(new Date().getMonth());
			DayCostMonth = String.valueOf(new Date().getMonth()+1);
		}
		//用户Id
		String userName = request.getParameter("UserName");
		//项目Id
		String ProjectName = request.getParameter("ProjectName");
		//人天单价
		String DayCostOneCost = request.getParameter("DayCostOneCost");
		//人天数量
		String DayCostDayNum = request.getParameter("DayCostDayNum");
		//人天总成本
		String DayCostTotalCost = request.getParameter("DayCostTotalCost");
		
		//根据项目Id和人员名称查询
		String selectDayCostByUseridAndProjectId = dayCostService.selectDayCostByUseridAndProjectId(userName,ProjectName);
		

		return dayCostService.addDayCost(DayCostNum,DayCostMonth,userName,ProjectName,DayCostOneCost,DayCostDayNum,DayCostTotalCost)+"";
	}
	
	
	//查询人天成本数据
	@RequestMapping(value = "selectDayCostByUsername")
	public String selectDayCostByUserId(HttpServletRequest request,HttpServletResponse response) throws Exception {
	    	String userId = request.getParameter("userId");
		
		
		return dayCostService.selectDayCostByUserid(userId);
	}
	
	//删除人天成本数据
	@RequestMapping(value = "deleteCostByUsername")
	public String deleteCostByUsername(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String userId = request.getParameter("userId");
		
		
		return dayCostService.deleteCostByUsername(userId)+"";
	}
	

    

} 
