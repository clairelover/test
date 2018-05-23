package com.jiashi.service;


import java.util.List;

import com.jiashi.domain.City;
import com.jiashi.domain.Person;
import com.jiashi.domain.PersonName;



/**
 * 城市业务逻辑接口类
 *
 * Created by bysocket on 07/02/2017.
 */
public interface PersonService {

    /**
     * 根据城市名称，查询城市信息
     * @param password 
     * @param cityName
     * @throws Exception 
     */
	
  //添加人员信息
  public  String addUserInfo(String username,String userId,String enterTime,String userConner,String emerConrPer,String emrContCont, String password) throws Exception;

  //根据用户Id查询人员信息
  public String findPersonByUserid(String userId)throws Exception;
  
  //查询所有人员信息
  public String selectPerson()throws Exception;
  //删除人员信息
  public String deletePersonByUserID(String userId)throws Exception;
  //根据用户名查询人员信息
  public String selectPersonByUserName(String dayCostUserName2) throws Exception;

}
