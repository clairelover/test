package com.jiashi.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jiashi.domain.Person;
import com.jiashi.service.LoginService;

/**
 * 
 * <pre>
 * 项目名称：springBoot    
 * 类名称：LoginController    
 * 类描述：  登录接口  
 * 创建人：宋嘉祥 872652568@qq.com
 * 创建时间：2018年5月3日 下午5:36:37    
 * 修改人	      
 * 修改时间：2018年5月3日 下午5:36:37    
 * 修改备注：       
 * &#64;version
 * </pre>
 */
@RestController
@RequestMapping("/user")


public class LoginController {

	@Autowired
	private LoginService loginService;

	
	// 校验表单提交过来的路径
	// 表单提交过来的路径
	@RequestMapping("/checkLogin")
	public String checkLogin(String userid,String password, Model model) {
		// 调用service方法
	Person person = loginService.checkLogin(userid, password);
		// 若有user则添加到model里并且跳转到成功页面
		if (person != null) {
			model.addAttribute("person", person);
			return "success";
		}
		return "fail";
	}


}
