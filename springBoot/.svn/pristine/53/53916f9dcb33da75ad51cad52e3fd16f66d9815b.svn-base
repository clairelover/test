package com.jiashi.service.impl;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.DayCostDao;
import com.jiashi.dao.PersonDao;
import com.jiashi.dao.ProjectsDao;
import com.jiashi.domain.DayCost;
import com.jiashi.domain.Person;
import com.jiashi.domain.PersonName;
import com.jiashi.domain.Projects;
import com.jiashi.service.DayCostService;
import com.jiashi.util.JSONUtil;


@Service
public class DayCostServiceImpl implements DayCostService {

	@Autowired
	private PersonDao personDao;
	
	@Autowired
	private ProjectsDao projectsDao;
	
	@Autowired
	private DayCostDao dayCostDao;
	
	//添加人天成本数据
	@Override
	
	public String addDayCost(String dayCostNum, String dayCostMonth, String userId, String projectId,
			String dayCostOneCost, String dayCostDayNum, String dayCostTotalCost) throws Exception {
		Person findPersonByUserid = personDao.findPersonByUserid(userId);
		String username = findPersonByUserid.getUsername();
		Projects selectProjectsByProjectsId = projectsDao.selectProjectsByProjectsId(projectId);
		String projectName = selectProjectsByProjectsId.getProjectName();
		Integer DayCostOneCost = Integer.valueOf(dayCostOneCost);
		Integer DayCostDayNum = Integer.valueOf(dayCostDayNum);
		Integer DayCostTotalCost;
	    DayCostTotalCost = Integer.valueOf(dayCostTotalCost);
		Integer Gp=(DayCostOneCost*DayCostDayNum-DayCostTotalCost)/DayCostTotalCost;
		String gp = String.valueOf(Gp);
		DayCost dayCost = new DayCost();
		dayCost.setDayCostNum(dayCostNum);
		dayCost.setDayCostMonth(dayCostMonth);
		dayCost.setDayCostUserName(username);
		dayCost.setDayCostProject(projectName);
		dayCost.setDayCostOneCost(DayCostOneCost);
		dayCost.setDayCostDayNum(DayCostDayNum);
		dayCost.setDayCostTotalCost(DayCostTotalCost);
		dayCost.setGp(gp);
		dayCost.setIsDelete("0");
		int addDayCost =0;
		try {
			addDayCost = dayCostDao.addDayCost(dayCost);
		} catch (Exception e) {
			 String objectToJSONString = JSONUtil.objectToJSONString(false, null, "", "插入失败");
			return objectToJSONString;
		}
		 String objectToJSONString = JSONUtil.objectToJSONString(true, addDayCost, "", "插入失败");
		return objectToJSONString ;
	}

    
	
	//根据人员id查询人员人天成本数据
	@Override
	public String selectDayCostByUserid(String userId) throws Exception {
		
		Person userInfo;
		try {
			userInfo = personDao.findPersonByUserid(userId);
		} catch (Exception e1) {
			 return JSONUtil.objectToJSONString(false, null, null, userId+":查无此人"); 
		}
		String username;
		try {
			username = userInfo.getUsername();
		} catch (Exception e1) {
			 return JSONUtil.objectToJSONString(false, null, null, userId+":查无此人"); 
		}
		 System.out.println("111");
		 List<DayCost> selectDayCostByUserName;
		try {
			selectDayCostByUserName = dayCostDao.selectDayCostByUserName(username);
		} catch (Exception e) {
			 
			 return JSONUtil.objectToJSONString(false, null, null, "插入失败"); 	
		}
		 String objectToJSONString = JSONUtil.objectToJSONString(true, selectDayCostByUserName, "", "成功");
		 return objectToJSONString ;
	}



	@Override
	public String deleteCostByUsername(String userId) throws Exception {
		Person userInfo = personDao.findPersonByUserid(userId);
		String username;
		try {
			username = userInfo.getUsername();
		} catch (Exception e1) {
			return JSONUtil.objectToJSONString(false, null, null, "插入失败");
		}
		int deleteDayCostByUserName=0;
		try {
			deleteDayCostByUserName = dayCostDao.deleteDayCostByUserName(username);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, null, "删除失败，请输入人员");
		}
		
		 String objectToJSONString = JSONUtil.objectToJSONString(true, deleteDayCostByUserName, "", "成功");
		return objectToJSONString;
	}



	//根据项目 月份查询营业分布
	@Override
	public String selectDayCostByProId(String projectId,String month) throws Exception {
		DayCost dayCost = new DayCost();
		Projects selectProjectsByProjectsId = projectsDao.selectProjectsByProjectsId(projectId);
		String projectName = selectProjectsByProjectsId.getProjectName();
			dayCost.setDayCostMonth(month);
		dayCost.setDayCostProject(projectName);
		List<DayCost> selectDayCostByNameMonth =null;
		try {
		 selectDayCostByNameMonth = dayCostDao.selectDayCostByNameMonth(dayCost);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, null, "插入失败");
		}
		 String objectToJSONString = JSONUtil.objectToJSONString(true, selectDayCostByNameMonth, "", "成功");
			return objectToJSONString;
	}



	@Override
	public String selectDayCostByProName(String projectName,String month) throws Exception {

		List<DayCost> selectDayCostByProName =null;
		try {
			selectDayCostByProName = dayCostDao.selectDayCostByProName(projectName,month);
		} catch (Exception e) {
			String objectToJSONString = JSONUtil.objectToJSONString(false, null, "", "插入失败");
			 return  objectToJSONString;
		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, selectDayCostByProName, "", "插入成功");
		return objectToJSONString;
	}



	
	//根据项目名查询所有所在项目人
	@Override
	public String selectDayCostByProNameto(String projectName) throws Exception {
		List<PersonName> selectDayCostByProNametoUserName =null;
		try {
			 selectDayCostByProNametoUserName = dayCostDao.selectDayCostByProNametoUserName(projectName);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, selectDayCostByProNametoUserName, "", "插入成功");
		return objectToJSONString;
	}
	


	//根据项目名和人员姓名查询人天
	@Override
	public String selectDayCostByUseridAndProName(String dayCostUserName, String projectName) throws Exception {
		DayCost selectDayCostByProNameAndUserId =null;
		try {
			selectDayCostByProNameAndUserId = dayCostDao.selectDayCostByProNameAndUserId(dayCostUserName,projectName);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");
		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, selectDayCostByProNameAndUserId, "", "插入成功");
		return objectToJSONString;
	}
	@Override
	public DayCost selectDayCostByUseridAndProNameto(String dayCostUserName, String projectName) throws Exception {
		return dayCostDao.selectDayCostByProNameAndUserId(dayCostUserName,projectName);
	}



	@Override
	public String selectDayCostByUseridAndProjectId(String userId, String projectId) throws Exception {
		DayCost selectDayCostByUseridAndProjectId =null;
		try {
			selectDayCostByUseridAndProjectId = dayCostDao.selectDayCostByUseridAndProjectId(userId,projectId);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");

		}
		String objectToJSONString = JSONUtil.objectToJSONString(false, selectDayCostByUseridAndProjectId, "", "插入成功");
		return objectToJSONString;
		
	}



	@Override
	public List<DayCost> selectDayCostByProNameto(String projectName, String month) throws Exception {
		// TODO Auto-generated method stub
		return dayCostDao.selectDayCostByProName(projectName,month);
	}

}
