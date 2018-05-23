package com.jiashi.service.impl;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.ProjectsDao;
import com.jiashi.domain.Projects;
import com.jiashi.service.ProjectsService;
import com.jiashi.util.JSONUtil;

@Service
public class ProjectsServiceImpl implements ProjectsService {

	@Autowired
	private ProjectsDao projectsDao;
	
	


	@Override
	public String selectProjects() throws Exception {
		List<Projects> selectProjects =null;
		try {
		 selectProjects = projectsDao.selectProjects();
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, selectProjects, "", "插入成功");
		return objectToJSONString;
	}
	
	@Override
	public List<Projects> selectProjectsto() throws Exception {
		return projectsDao.selectProjects();
	}
	
	//添加项目
	@Override
	public String addProjects(String projectId, String projectName, String projectAddress)
			throws Exception {
		Projects projects = new Projects();
		projects.setProjectId(projectId);
		projects.setProjectName(projectName);
		projects.setProjectAddress(projectAddress);
		projects.setIsDelete("0");
		int addProjects =0;
		try {
			addProjects = projectsDao.addProjects(projects);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, addProjects, "", "插入成功");
		return objectToJSONString;
	
	}

	//删除项目
	@Override
	public String deleteProjects(String projectId)throws Exception {
		int deleteProjects =0;
		if(deleteProjects==0){
			return JSONUtil.objectToJSONString(false, null, "", "删除失败");
		}
		try {
			deleteProjects=projectsDao.deleteProjects(projectId);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "删除失败");
		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, deleteProjects, "", "删除成功");
		return objectToJSONString;
	}
    
	//查询项目
	@Override
	public String selectProjectsByProjectId(String projectId)throws Exception {
		
		if(projectId==null){
			return JSONUtil.objectToJSONString(false, null, "", "查询失败");
		}
		Projects selectProjectsByProjectsId =null;
		try {
			selectProjectsByProjectsId = projectsDao.selectProjectsByProjectsId(projectId);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "查询失败");
		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, selectProjectsByProjectsId, "", "查询成功");
		return objectToJSONString;
	}

	//根据项目名查询项目信息
	public String selectProjectsByProjectName(String projectName) throws Exception {
		Projects selectProjectsByProjectName =null;
		try {
			selectProjectsByProjectName = projectsDao.selectProjectsByProjectName(projectName);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, selectProjectsByProjectName, "", "插入成功");
		return objectToJSONString;
	}
	
	

}
