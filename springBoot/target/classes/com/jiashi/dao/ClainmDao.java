package com.jiashi.dao;

import com.jiashi.domain.City;
import com.jiashi.domain.Clainm;
import com.jiashi.domain.Person;
import com.jiashi.domain.Projects;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 报销信息 DAO 接口类
 *
 * Created by bysocket on 18/04/2018.
 */
public interface ClainmDao {

	

    /**
     * 
     *新增报销
     * 
     */
	public String addClaimnum(Clainm clainm) throws Exception;

	
	//查询报销单
	public List<Projects> selectClaimnu(Clainm clainm)throws Exception;

	
    //根据用户名 查询保险单
	public List<Clainm> selectClaimnuByUserName(@Param("dayCostUserName2")String dayCostUserName2,@Param("month")String month);
}
