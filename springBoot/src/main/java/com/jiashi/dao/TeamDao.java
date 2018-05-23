package com.jiashi.dao;

import java.util.List;

import com.jiashi.domain.Team;

public interface TeamDao {

	
	//添加团建信息
	public  int addTeamBuild(Team team)throws Exception;
    //查询团建信息
	public List<Team> selectTeamBuild(String month)throws Exception;
	//根据人名信息 查询团建费用
	public List<Team> selectTeamBuildByUserName(String dayCostUserName);

	
	
	
}
