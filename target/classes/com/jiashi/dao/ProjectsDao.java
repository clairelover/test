package com.jiashi.dao;

import java.util.List;

import com.jiashi.domain.Projects;

public interface ProjectsDao {

	
	//添加项目
	public int addProjects(Projects projects)throws Exception;
    //查询所有项目
	public List<Projects> selectProjects()throws Exception;
    //删除项目
	public int deleteProjects(String projectId)throws Exception;
	//根据项目Id查询项目
	public Projects selectProjectsByProjectsId(String projectId)throws Exception;
	//根据项目名称查询项目信息
	public Projects selectProjectsByProjectName(String projectName);
}
