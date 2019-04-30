package cn.com.phone.controller;


import java.util.ArrayList;
import java.util.List;

import javax.security.auth.login.LoginContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mysql.fabric.xmlrpc.base.Array;


/**
 * 网站的一些处理器
 * 处理一些简单的跳转页面
 * @author Kai
 *
 */
@Controller
@RequestMapping("/shopping")
public class WebController {
/**
 * 跳转到注册页面
 * @return
 * @throws Exception
 */
@RequestMapping("/register")
public String register()throws Exception{
	return "register";
}
/**
 * 启动时跳转到首页
 * @return
 * @throws Exception
 */
@RequestMapping("/main")
public String main() throws Exception{
	return "main";
}
/**
 * 购物车页面
 * @param username
 * @return
 * @throws Exception
 */
@RequestMapping("/ShoppingCat")
public String ShoppingCat() throws Exception{
	return "shoppingcat";
}
	/**
	 * 跳转到注册成功的页面 
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/re_success")
	public String re_success()throws Exception{
		 return "register_success";
	}
	/**
	 * 跳转至商品页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/product")
	public String product()throws Exception{
		 return "product";
	}
	
	/**
	 * 跳转至商详细信息页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/product_mess")
	public String product_mess()throws Exception{
		 return "product_mess";
	}
	
	/**
	 * 跳转至登录界面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/login")
	public String Login()throws Exception{
		 return "login";
	}
	/**
	 * 跳转至支付页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/payment")
	public String payment()throws Exception{
		 return "payment";
	}
	/**
	 * 跳转至支付成功页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/paySuccess")
	public String paySuccess()throws Exception{
		 return "paySuccess";
	}
	/**
	 * 跳转至修改密码
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/passwordChange")
	public String passwordChange()throws Exception{
		 return "passwordChange";
	}
	/**
	 * 跳转至支付成功页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/cs")
	public String cs()throws Exception{
		 return "cs";
	}
}
