package com.jiashi.service;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.jiashi.domain.Clainm;
import com.jiashi.domain.PersonName;
import com.jiashi.domain.Projects;

public interface ClaimnumService {

	/**
	 * 添加报销
	 * @param claimnum
	 * @param claimDate
	 * @param userId
	 * @param claimMonth
	 * @param claimTotalCrash
	 * @return
	 * @throws Exception
	 */
	public String addClaimnum(String claimnum, String claimDate, String userId, String claimMonth,
			String claimTotalCrash)throws Exception;

	
	//查询报销单
	public String selectClaimnu(String userId, String claimMonth)throws Exception;

    //根据用户名查询报销单
	public String selectClaimnuByUserName(String dayCostUserName2,String month) throws Exception;


	public List<Clainm> selectClaimnuByUserNameto(String dayCostUserName, String month);




}
