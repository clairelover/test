package com.jiashi.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.jiashi.domain.DayCost;
import com.jiashi.domain.PersonName;

public interface DayCostDao {
    //添加人天成本数据
	public int addDayCost(DayCost dayCost)throws Exception;

	
	//根据人员姓名查询人员人天成本数据
	public List<DayCost> selectDayCostByUserName(String username)throws Exception;

    //根据人员名称查询项目
	public int deleteDayCostByUserName(String username)throws Exception;

    //根据项目名称和月份查询项目信息
	public List<DayCost> selectDayCostByNameMonth(DayCost dayCost)throws Exception;

    //根据项目名称查询项目信息
	public List<DayCost> selectDayCostByProName(@Param("projectName")String projectName,@Param("month")String month);

    //根据项目名查询所在项目所有人员
	public List<PersonName> selectDayCostByProNametoUserName(String projectName);

    //根据项目名和人员姓名查询
	public DayCost selectDayCostByProNameAndUserId(@Param("dayCostUserName")String dayCostUserName,@Param("projectName")String projectName);

    //根据项目名和人员信息查询
	public DayCost selectDayCostByUseridAndProjectId(@Param("userId")String userId,@Param("projectId")String projectId);

	
}
