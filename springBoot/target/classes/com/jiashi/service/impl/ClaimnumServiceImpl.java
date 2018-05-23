package com.jiashi.service.impl;


import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiashi.dao.ClainmDao;
import com.jiashi.domain.Clainm;
import com.jiashi.domain.Person;
import com.jiashi.domain.Projects;
import com.jiashi.service.ClaimnumService;
import com.jiashi.service.PersonService;
import com.jiashi.util.JSONUtil;

@Service
public class ClaimnumServiceImpl implements ClaimnumService {

	@Autowired
	private PersonService personService;
	
	@Autowired
	private ClainmDao clainmDao;
	@Override
	public String addClaimnum(String claimnum, String claimDate, String userId, String claimMonth, String claimTotalCrash)
			throws Exception {
		
		if(claimnum==null){
			return JSONUtil.objectToJSONString(false, null, "", "添加失败");
		}
		if(claimDate==null){
			return JSONUtil.objectToJSONString(false, null, "", "添加失败");
		}
		if(userId==null){
			return JSONUtil.objectToJSONString(false, null, "", "添加失败");
		}
		if(claimMonth==null){
			return JSONUtil.objectToJSONString(false, null, "", "添加失败");
		}
		if(claimTotalCrash==null){
			return JSONUtil.objectToJSONString(false, null, "", "添加失败");
		}
		
		Clainm clainm = new Clainm();
		Double Claimnum =null;
		Double ClaimTotalCrash =null;
		if(claimMonth!=null){
			Claimnum = Double.valueOf(claimnum);
		}
		if(claimTotalCrash !=null){
			 ClaimTotalCrash = Double.valueOf(claimTotalCrash);
		}
		
		if(Claimnum!=null){
			clainm.setClaimnum(Claimnum);
		}
		if(claimDate!=null){
			clainm.setClaimDate(claimDate);
		}
		if(claimMonth!=null){
			clainm.setClaimMonth(claimMonth);
		}
		
		 String findPersonByUserid=null;
		try {
			 findPersonByUserid = personService.findPersonByUserid(userId);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");
		}
		
	    Person jsonStringToObject = JSONUtil.jsonStringToObject(Person.class, findPersonByUserid);
	    String username =jsonStringToObject.getUsername();
		String userName = String.valueOf(username);
		clainm.setClaimUserName(userName);
		clainm.setClaimTotalCrash(ClaimTotalCrash);
		String isDelete="0";
		clainm.setIsDelete(isDelete);
		String addClaimnum=null;
		try {
			 addClaimnum = clainmDao.addClaimnum(clainm);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");
		}
		 String objectToJSONString = JSONUtil.objectToJSONString(true, addClaimnum, "", "插入失败");
		return  objectToJSONString;
	}
	
	//查询保险单
	@Override
	public String selectClaimnu(String userId, String claimMonth) throws Exception {
		Clainm clainm = new Clainm();
		if(claimMonth!=null){
			clainm.setClaimMonth(claimMonth);
		}
		if(userId!=null){
			 String findPersonByUserid = personService.findPersonByUserid(userId);
			 Person jsonStringToObject = JSONUtil.jsonStringToObject(Person.class, findPersonByUserid);
			String username = jsonStringToObject.getUsername();
			String userName = String.valueOf(username);
			clainm.setClaimUserName(userName);
		}
		List<Projects> selectClaimnu = null;
		try {
			 selectClaimnu = clainmDao.selectClaimnu(clainm);
		} catch (Exception e) {
			 String objectToJSONString = JSONUtil.objectToJSONString(false, null, "", "插入失败");
			 return objectToJSONString;
		}
		 String objectToJSONString = JSONUtil.objectToJSONString(true, selectClaimnu, "", "插入成功");
		return objectToJSONString;
	}

	@Override
	public String selectClaimnuByUserName(String dayCostUserName2, String month) throws Exception  {
		// TODO Auto-generated method stub
		List<Clainm> selectClaimnuByUserName= null;
		try {
			selectClaimnuByUserName = clainmDao.selectClaimnuByUserName(dayCostUserName2,month);
		} catch (Exception e) {
			return JSONUtil.objectToJSONString(false, null, "", "插入失败");
		}
		 String objectToJSONString = JSONUtil.objectToJSONString(true,selectClaimnuByUserName, "", "插入成功");
		return objectToJSONString;
	}

	@Override
	public List<Clainm> selectClaimnuByUserNameto(String dayCostUserName, String month) {
		// TODO Auto-generated method stub
		return clainmDao.selectClaimnuByUserName(dayCostUserName,month);
	}

	



}
