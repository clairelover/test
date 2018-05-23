package com.jiashi.dao;

import com.jiashi.domain.City;
import com.jiashi.domain.Person;
import com.jiashi.domain.PersonName;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * 人员信息 DAO 接口类
 *
 * Created by bysocket on 18/04/2018.
 */
public interface PersonDao {

    /**
     * 
     *新增人员
     * 
     */
    //新增人员数据
	public int addPerson(Person person) throws Exception;
    //根据id查询人员数据
	public Person findPersonByUserid(String userId)throws Exception;
    //查询所有人员数据
	public List selectPerson()throws Exception;
    //根据id删除人员数据
	public int deletePersonByUserId(String userId)throws Exception;
	//根据用户名称查询信息
	public Person selectPersonByName(String dayCostUserName2);
    
}
