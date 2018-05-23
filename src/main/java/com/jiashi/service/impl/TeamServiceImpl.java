package com.jiashi.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.TeamDao;
import com.jiashi.domain.Team;
import com.jiashi.service.TeamService;
import com.jiashi.util.JSONUtil;

@Service
public class TeamServiceImpl implements TeamService {

	
	@Autowired
	private TeamDao teamDao;
	@Override
	public String addTeamBuild(String tbCode, String tbDate, String tbPerson, String tbTotalMoney)throws Exception {
		
		Team team = new Team();
		//把参数存入实体类
		team.setTb_code(tbCode);
		team.setTb_date(tbDate);
		team.setTb_person(tbPerson);
		if(tbTotalMoney==null){
			return JSONUtil.objectToJSONString(false, null, "", "添加失败 ");
			
		}
		if(tbCode==null){
			
			return JSONUtil.objectToJSONString(false, null, "", "添加失败");
		}
		if(tbDate==null){
			
			return JSONUtil.objectToJSONString(false, null, "", "添加失败");
		}
		if(tbPerson==null){
			return JSONUtil.objectToJSONString(false, null, "", "添加失败");
			
		}
	
		Double TbTotalMoney = Double.valueOf(tbTotalMoney);
			team.setTb_total_money(TbTotalMoney);
		String[] split = tbPerson.split(",");
		int i=0;
		for(int a=0;a<split.length;a++){
			 i++;
		}
		Double tbAvMoney=TbTotalMoney/i;
		team.setTb_av_money(tbAvMoney);
		String isDelete="0";
		team.setIsDelete(isDelete);
		int addTeamBuild=0;
		try {
			addTeamBuild = teamDao.addTeamBuild(team);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, addTeamBuild, "", "插入成功");
		return objectToJSONString;
	}
	
	
	//查询项目
	@Override
	public String selectTeamBuild(String month) throws Exception {
		
		List<Team> selectTeamBuild=null;
		try {
			selectTeamBuild = teamDao.selectTeamBuild(month);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, selectTeamBuild, "", "插入成功");
		return objectToJSONString;
	}


	@Override
	public String selectTeamBuileByUserName(String dayCostUserName) throws Exception {
		// TODO Auto-generated method stub
		List<Team> selectTeamBuildByUserName =null;
		try {
			selectTeamBuildByUserName = teamDao.selectTeamBuildByUserName(dayCostUserName);
		} catch (Exception e) {
		return JSONUtil.objectToJSONString(false, null, "", "插入失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, selectTeamBuildByUserName, "", "插入成功");
		return objectToJSONString;
	}


	@Override
	public List<Team> selectTeamBuileByUserNameto(String dayCostUserName) throws Exception {
		
		return teamDao.selectTeamBuildByUserName(dayCostUserName);
	}

}
