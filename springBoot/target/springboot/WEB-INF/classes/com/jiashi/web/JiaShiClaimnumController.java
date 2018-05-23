package com.jiashi.web;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiashi.domain.Person;
import com.jiashi.domain.Projects;
import com.jiashi.service.ClaimnumService;
import com.jiashi.service.PersonService;
import com.jiashi.service.ProjectsService;

/**
 * Created by bysocket on 19/04/2018.
 */
@RestController
public class JiaShiClaimnumController {
	@Autowired
	private PersonService PersonService;
	@Autowired
	private ClaimnumService claimnumService;
	//添加项目
	@RequestMapping(value = "addClaimn")
	public String addClaimn(HttpServletRequest request,HttpServletResponse response) throws Exception {
		//获得报销code
		String claimnum = request.getParameter("claimnum");
		//获得报销日期
		String claimDate = request.getParameter("claimDate");
		//获得报销人Id
		String userId = request.getParameter("userId");
		//获得报销月份
		String claimMonth = request.getParameter("claimMonth");
		if(claimMonth==null&&"".equals(claimMonth)){
			claimMonth = String.valueOf(new Date().getMonth()+1);
		}
		//获得报销总金额
		String claimTotalCrash = request.getParameter("claimTotalCrash");
		
		
		
		return claimnumService.addClaimnum(claimnum,claimDate,userId,claimMonth,claimTotalCrash)+"";
		
	}			
	
	//查询所有项目
	@RequestMapping(value = "selectClaimnu")
	public String selectClaimnu(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String userId = request.getParameter("userId");
		if(userId!=null){
			String findPersonByUserid = PersonService.findPersonByUserid(userId);
			if(findPersonByUserid==null) throw new Exception("查无此人");
		}
		String claimMonth = request.getParameter("claimMonth");
		return claimnumService.selectClaimnu(userId,claimMonth);
		
	}
	
} 
