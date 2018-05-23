package com.jiashi.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiashi.service.LoginService;
/**
 * 
 * <pre>项目名称：springBoot    
 * 类名称：LoginController    
 * 类描述：  登录接口  
 * 创建人：宋嘉祥 872652568@qq.com
 * 创建时间：2018年5月3日 下午5:36:37    
 * 修改人	      
 * 修改时间：2018年5月3日 下午5:36:37    
 * 修改备注：       
 * @version </pre>
 */
@RestController
public class LoginController {
	
	
	@Autowired
	private LoginService loginService;
	
	
	@RequestMapping("/login")
	public String login(String userid ,String password){
		
		loginService.queryUseridAndPassword(userid,password);
		
		return password;
		
	}
	
}
