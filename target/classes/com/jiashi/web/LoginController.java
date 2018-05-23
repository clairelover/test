package com.jiashi.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.jiashi.domain.Person;
import com.jiashi.domain.Tree;
import com.jiashi.service.LoginService;
import com.jiashi.util.JSONUtil;

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

	// 正常访问login页面
	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	// 校验表单提交过来的路径
	// 表单提交过来的路径
	@RequestMapping("/checkLogin")
	public String checkLogin(HttpServletRequest request,String userid, String password, Model model) {
		// 调用service方法
		Person person = loginService.checkLogin(userid, password);
		// 若有user则添加到model里并且跳转到成功页面
		if (person != null) {

			// 通过用户id获取他权限内的菜单表
			List<Tree> tree = loginService.queryTree(person.getId());
			
			HttpSession session = request.getSession();
			session.setAttribute("person", person);
			
//			 model.addAttribute("person", person);
//			 session.setAttribute("person", person);
			
			
			 
			return JSONUtil.objectToJSONString(true, tree, "", "登录成功,这是<" + person.getUsername() + ">权限下的菜单数据");
		}
		return JSONUtil.objectToJSONString(false, person, "", "登录失败,用户不存在或密码不正确");
	}

	// 注销方法
	@RequestMapping("/outLogin")
	public String outLogin(HttpSession session) {
		
		// 通过session.invalidata()方法来注销当前的session
		session.invalidate();
		return "login";
	}
}
