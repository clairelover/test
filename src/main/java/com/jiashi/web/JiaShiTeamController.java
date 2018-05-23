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
import com.jiashi.domain.Team;
import com.jiashi.service.ClaimnumService;
import com.jiashi.service.PersonService;
import com.jiashi.service.TeamService;

/**
 * Created by bysocket on 19/04/2018.
 */
@RestController
public class JiaShiTeamController {
	@Autowired
	private TeamService teamService;
	//添加项目
	@RequestMapping(value = "addTeamBuild")
	public String addTeamBuild(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String tbCode = request.getParameter("tbCode");
		String tbDate = request.getParameter("tbDate");
		String tbPerson = request.getParameter("tbPerson");
		String tbTotalMoney = request.getParameter("tbTotalMoney");
		return teamService.addTeamBuild(tbCode,tbDate,tbPerson,tbTotalMoney)+"";
	}			
	
	//查询所有项目
	@RequestMapping(value = "selectTeamBuild")
	public String selectTeamBuild(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String Month = request.getParameter("Month");
		String selectTeamBuild = teamService.selectTeamBuild(Month);
		return selectTeamBuild;
	}
	

} 
