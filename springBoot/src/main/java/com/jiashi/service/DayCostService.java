package com.jiashi.service;

import java.util.List;

import com.jiashi.domain.DayCost;
import com.jiashi.domain.Person;
import com.jiashi.domain.PersonName;


public interface DayCostService {

	//添加人天成本数据
	public String addDayCost(String dayCostNum, String dayCostMonth, String userId, String projectId, String dayCostOneCost,
			String dayCostDayNum, String dayCostTotalCost)throws Exception;
     
	//根据人员查询人天成本数据
	public String selectDayCostByUserid(String userId)throws Exception;

	public String deleteCostByUsername(String userId)throws Exception;

	//根据项目名称查询
	public String selectDayCostByProId(String projectId,String month)throws Exception;
    
	//根据项目名查询项目,月份成本信息
	public String selectDayCostByProName(String projectName, String month) throws Exception;
    //根据项目名查询
	public String selectDayCostByProNameto(String projectName) throws Exception;
    //根据项目名和人员查询
	public String selectDayCostByUseridAndProName(String dayCostUserName, String projectName) throws Exception;
    //根据项目名和人员名称查询
	public String selectDayCostByUseridAndProjectId(String userId, String ProjectName)throws Exception;

	public List<DayCost> selectDayCostByProNameto(String projectName, String month)throws Exception;

	public DayCost selectDayCostByUseridAndProNameto(String dayCostUserName, String projectName) throws Exception;

}
