package com.jiashi.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiashi.domain.Person;
import com.jiashi.service.PersonService;
import com.jiashi.util.JSONUtil;

/**
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class JiaShiRestController2 {

    @Autowired
    private PersonService personService;
    
    

    
    @RequestMapping(value = "addPerson")
    public String addPerson(HttpServletRequest request,HttpServletResponse response) throws Exception {
    	String userid = request.getParameter("userid");
    	String username = request.getParameter("username");
    	String enterTime = request.getParameter("enterTime");
    	String userConnect = request.getParameter("userConnect");
    	String emerContPer = request.getParameter("emerContPer");
    	String emrContCont = request.getParameter("emrContCont");
    	String password = request.getParameter("password");
    	
    	String addUserInfo = personService.addUserInfo(username, userid, enterTime, userConnect, emerContPer, emrContCont,password);
        return addUserInfo;
    }
    
    
    //根据用户id查询用户信息
    @RequestMapping(value = "selectPersonByUserid")
    public String selectPersonByUserid(HttpServletRequest request,HttpServletResponse response) throws Exception{
    	String userid = request.getParameter("userid");
    	String findByPerson = personService.findPersonByUserid(userid);
    	//String jsonString = JSONUtils.toJSONString(findByPerson);
    	return findByPerson;
    }
    
    //查询所有人员信息
    @RequestMapping(value ="selectPerson")
    public String selectPerson(HttpServletRequest request,HttpServletResponse response) throws Exception{
             String selectPerson = personService.selectPerson();
    	return selectPerson;
    }
    
    //根据用户id删除用户信息
    @RequestMapping(value ="deletePersonByUserID")
    public String deletePersonByUserID(HttpServletRequest request,HttpServletResponse response) throws Exception{
    	
    	String userid = request.getParameter("userid");
    	String findPersonByUserid = personService.findPersonByUserid(userid);
    	if(findPersonByUserid==null){
    		return JSONUtil.objectToJSONString(false, null, "", "查无此人 无法删除");
    	}
    	String deletePersonByUserID = personService.deletePersonByUserID(userid);
    	return deletePersonByUserID;
    }
    

} 
