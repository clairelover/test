package com.jiashi.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiashi.domain.Projects;
import com.jiashi.service.ProjectsService;

/**
 * Created by bysocket on 19/04/2018.
 */
@RestController
public class JiaShiProjectsController {
	@Autowired
	private ProjectsService projectsService;
	//添加项目
	@RequestMapping(value = "adProjects")
	public String addProjects(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String projectId = request.getParameter("project_id");
		String projectName = request.getParameter("project_name");
		String projectAddress = request.getParameter("project_address");
		String addProjects = projectsService.addProjects(projectId, projectName, projectAddress);
		return addProjects+"";
		
	}			
	
	//查询所有项目
	@RequestMapping(value = "selectProjects")
	public String selectProjects(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		return projectsService.selectProjects();
		
	}
	
	//删除项目
	@RequestMapping(value = "deleteProjects")
	public String deleteProjects(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String projectId = request.getParameter("project_id");
		return projectsService.deleteProjects(projectId)+"";
		
	}
	
	
	//根据项目id查询项目
	@RequestMapping(value = "selectProjectsByProjectId")
	public String selectProjectsByProjectId(HttpServletRequest request,HttpServletResponse response) throws Exception {
		String projectId = request.getParameter("project_id");
		return projectsService.selectProjectsByProjectId(projectId)+"";
		
	}
	
} 
