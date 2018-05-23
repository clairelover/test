package com.jiashi.service;

import java.util.List;

import com.jiashi.domain.Projects;

public interface ProjectsService {

	//添加人员所在项目表
	public String addProjects(String projectId,String projectName,String projectAddress)throws Exception;

	
    //查询所有人员所在项目
	public String selectProjects()throws Exception;
	
	//查询所有人员所在项目
	public List<Projects> selectProjectsto()throws Exception;
 
    //删除项目
	public String deleteProjects(String projectId) throws Exception;

    //根据项目Id查询项目
	public String selectProjectsByProjectId(String projectId) throws Exception;


	public String selectProjectsByProjectName(String projectName) throws Exception;


}
