package cn.com.phone.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder.In;
import javax.print.attribute.HashAttributeSet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.com.phone.common.utils.JSONUtils;
import cn.com.phone.pojo.PagePic;
import cn.com.phone.pojo.Product;
import cn.com.phone.pojo.UserInfo;
import cn.com.phone.service.interfaces.pagePicService;
import cn.com.phone.service.interfaces.UserService;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;



/**
 * 管理用户，登录验证，注册
 * 
 * @author SUser
 *
 */
@Controller
public class UserController {
	 @Autowired
	    private  UserService userService;  
	   @Autowired
	   private pagePicService pagePicService;
	     private String username="";
	     /**
	      * 登录校验
	      * @param user_pwd
	      * @param response
	      * @param session
	      * @return
	      * @throws Exception
	      */
	 @ResponseBody
	 @RequestMapping(value="/LoginCheck",produces="text/html;charset=UTF-8")
	 public String LoginCheck(@RequestBody String loginInfo,HttpServletResponse response,HttpSession session)throws Exception{
		String accountNumber="";   //账号
		String password="";   //密码
		String loginInfoJson="";
		int id=-1;
		String brand=null;
		 JSONObject loginJson=JSON.parseObject(loginInfo);
            if(loginJson!=null){
            	if(loginJson.containsKey("accountNumber")&&loginJson.containsKey("password")){
            		accountNumber=loginJson.getString("accountNumber");
            		password=loginJson.getString("password");
            	}
            }
		    boolean isLogin=userService.isAccountExcit(accountNumber, password);
		    if(isLogin){
		    	Map<String, Object> map=new HashMap<String, Object>();
			    	Object idObject=session.getAttribute("id");
			    	Object brandObject=session.getAttribute("brand");
			    	if(brandObject!=null){
			    		id=(Integer)idObject;
			    		brand=(String)brandObject;
			    	}
			    	map.put("id", id);
			    	map.put("brand", brand);
		    	map.put("succuss", "succuss");
		    	loginInfoJson=JSONUtils.MapToJsonString(map);
		         session.setAttribute("username", accountNumber);
		    }else{
		    	 session.setAttribute("username", accountNumber);
		    	return "error";
		    }
		/*  User user=userService.selectByUsername(name_pwd[0]);
		   if(user==null||!user.getPassword().equals(name_pwd[1]))
		   {
			   return "error";
		   }else {
	           session.setAttribute("username", name_pwd[0]);
//			   Cookie myCookie=new Cookie("username",name_pwd[0]);
//			   myCookie.setMaxAge(60*60*24);//一天
//			   response.addCookie(myCookie);
		}*/
		 return loginInfoJson;
	 }
	 @RequestMapping(value="/login")
	 public String login()throws Exception{     
		 return "main";
	 }
	     //注销用户
		@RequestMapping("/logout")
		    public String logout(HttpSession session) throws Exception{
			Object idObject=session.getAttribute("id");
	    	Object brandObject=session.getAttribute("brand");
	    	int id=-1;
	    	String brand=null;
	    	if(brandObject!=null){    		
	    		id=(Integer)idObject;
	    		brand=(String)brandObject;
	    	}
		    String location="";    //定位地址
			if(brand!=null&&!"".equals(brand)){
				location="redirect:product_mess.action?id="+id+"&brand="+brand;
			}else{
				location="redirect:shopping/main.action";
			}
			    //清除session
		    	session.invalidate();
		        return location;
		    }
		/**
		 * 用于判断用户是否登录
		 * @param user_pwd
		 * @param session
		 * @return
		 * @throws Exception
		 */
		 @ResponseBody
		 @RequestMapping(value="/Check",produces="text/html;charset=UTF-8")
		 public String Check(String user_pwd,HttpSession session)throws Exception{
			     String name=(String) session.getAttribute("username");
			     if(name==null)
			     {
			    	 return "error";
			     }
			 return "success";
		 }
		/**
		 * 注册用户，对两次输入进行检验
		 * @param user_pwd
		 * @return
		 * @throws Exception
		 */
		 @ResponseBody
		 @RequestMapping(value="/Register",produces="text/html;charset=UTF-8")
		 public String Register(@RequestBody String userAndaccountInfo)throws Exception{	     
				JSONObject userAndaccountInfoJson=JSON.parseObject(userAndaccountInfo);
				String password="";   //密码
				String certCode="";  //证件号码
				String adderss="";   //证件地址
				String phone="";   //手机号码
				String accountNumber="" ;   //账号 
				boolean isBillId=true;
				UserInfo userInfo=new UserInfo();
				if(userAndaccountInfoJson!=null){		
					  if(userAndaccountInfoJson.containsKey("certCode")){  //身份证
						  certCode=userAndaccountInfoJson.getString("certCode");
						  String sex=certCode.substring(certCode.length()-2,certCode.length()-1);   //性别
						  int number=Integer.valueOf(sex);
						  if(number%2==0){   //偶数是女的
							   userInfo.setUserSex("W");
						  }else{
							  userInfo.setUserSex("M");
						  }
					   }
					   userInfo.setBillId(userAndaccountInfoJson.getString("billId"));
					   userInfo.setUserName(userAndaccountInfoJson.getString("username"));
					   userInfo.setCertCode(userAndaccountInfoJson.getString("certCode"));
					   userInfo.setAdderss(userAndaccountInfoJson.getString("adderss"));
					   if(userAndaccountInfoJson.containsKey("accountNumber")){
						   accountNumber=userAndaccountInfoJson.getString("accountNumber");
					   }
					   isBillId= userService.saveUserInfoAndAccount(userInfo,accountNumber, password);
				}
			   //  System.out.println(name_pwd[1]+"-->"+name_pwd[2]);
			      //检验用户名是否合法，3-6个字母或数字，或2-5个汉字
			   /*  String regx="(^[a-z0-9_-]{3,6}$)|(^[\u2E80-\u9FFF]{2,5})";
			      if(!name_pwd[0].matches(regx)){
						  return "user";
					}*/
				if(isBillId){   //该手机号已经被注册
					return "error";
				}
			    username=accountNumber;
			     //如果注册成功返回用户名
			 return "success";
		 }
		
		 /**
			 * 注册用户，对两次输入进行检验
			 * @param user_pwd
			 * @return
			 * @throws Exception
			 */
			 @ResponseBody
			 @RequestMapping(value="/NewUser",produces="text/html;charset=UTF-8")
			 public String NewUser()throws Exception{
				 return username;
			 }
				/**
				 * 新增从数据库获取登入界面的背景
				 * @author Kai
				 * @createDate 20180930
				 * @return
				 * @throws Exception
				 */
/*				 @RequestMapping("/Login")
				public ModelAndView Login1() throws Exception{
					 Loginbg loginbg=loginBgService.selectByState(1,"L");
					 String pic=loginbg.getLoginbgpic();
			         ModelAndView modelAndView=new ModelAndView();
					 modelAndView.addObject("bgPath",pic);
					 modelAndView.setViewName("Login");
					return modelAndView;
				 }*/

	@SuppressWarnings("rawtypes")
	/**
	 * @deprecated 进入主界面时进行加载图片
	 * @author zhoukai
	 * @createDate 20190219
	 * @return
	 * @throws Exception
	 */
	@ResponseBody
	@RequestMapping(value = "/loadPic", produces = "text/html;charset=UTF-8")
	public String loadPic(@RequestBody String pageName) throws Exception {
		Map picMap=new HashMap(); 
		List<PagePic> pagePics=pagePicService.selectPicByPageName(pageName);
		for(PagePic pagePic:pagePics){
              String pagePath=pagePic.getPicFilePath();			
			if("C".equals(pagePic.getPageLaction())){  //主页中间大图
				 picMap.put("center",pagePath+pagePic.getPicNameType());
			}
			if("T_L".equals(pagePic.getPageLaction())){  //左上角
				 picMap.put("topLeft",pagePath+pagePic.getPicNameType());
			}
			if("T_R".equals(pagePic.getPageLaction())){ //右上角
				 picMap.put("topRigth",pagePath+pagePic.getPicNameType());
			}
			if("R_1".equals(pagePic.getPageLaction())){ //主页右边的图片
				 picMap.put("Rigth1",pagePath+pagePic.getPicNameType());
			}
			if("R_2".equals(pagePic.getPageLaction())){ //主页右边的图片
				 picMap.put("Rigth2",pagePath+pagePic.getPicNameType());
			}
			if("R_3".equals(pagePic.getPageLaction())){ //主页右边的图片
				 picMap.put("Rigth3",pagePath+pagePic.getPicNameType());
			}
		}
		 String json=JSONUtils.MapToJsonString(picMap);
		return json;
	}
	
	 /**
		 * 获取session
		 * @param 
		 * @return
		 * @throws Exception
		 */
		 @ResponseBody
		 @RequestMapping(value="/getSession",produces="text/html;charset=UTF-8")
		 public String getSession(HttpSession session)throws Exception{
			 return  (String)session.getAttribute("username");
		 }
		 
			/**
			 * 跳转至商详细信息页面
			 * @return
			 * @throws Exception
			 */
			@RequestMapping("/loginProductInfo")
			public ModelAndView loginProductInfo(@RequestParam(value="id")Integer id,@RequestParam(value="brand")String brand,HttpSession session)throws Exception{
				System.out.println(id);
	      //    Product product=productService.getPhoneInfoByProductId(id,brand);
		         ModelAndView modelAndView=new ModelAndView();
			//	 modelAndView.addObject("product",product);*/
		         session.setAttribute("brand", brand);
		         session.setAttribute("id", id);
				 modelAndView.setViewName("login");
				return modelAndView;
			}
			

			/**
			 * 判断用户是否存在
			 * @return
			 * @throws Exception
			 */
			 @ResponseBody
			 @RequestMapping(value="/isExistUserInfo",produces="text/html;charset=UTF-8")
			public String isExistUserInfo(@RequestBody String userAndaccountInfo )throws Exception{
				 JSONObject userAndaccountInfoJson=JSON.parseObject(userAndaccountInfo);
					String certCode="";  //证件号码
					String billId="";   //手机号码
					String userName="" ;   //账号 
					boolean isExist=true;
					if(userAndaccountInfoJson!=null){		
						  if(userAndaccountInfoJson.containsKey("certCode")&&userAndaccountInfoJson.containsKey("username")
								  &&userAndaccountInfoJson.containsKey("billId")){ 
							  certCode=userAndaccountInfoJson.getString("certCode");
							  billId=userAndaccountInfoJson.getString("billId");
							  userName=userAndaccountInfoJson.getString("username");
						   }
						   isExist= userService.IsUserInfo(userName, certCode, billId);
					}
				   //  System.out.println(name_pwd[1]+"-->"+name_pwd[2]);
				      //检验用户名是否合法，3-6个字母或数字，或2-5个汉字
				   /*  String regx="(^[a-z0-9_-]{3,6}$)|(^[\u2E80-\u9FFF]{2,5})";
				      if(!name_pwd[0].matches(regx)){
							  return "user";
						}*/
					if(isExist){   //该用户存在
						return "success";
					}			
				 return "error";
			}
			 
			 /**
				 * 修改密码
				 * @return
				 * @throws Exception
				 */
				 @ResponseBody
				 @RequestMapping(value="/changePassword",produces="text/html;charset=UTF-8")
				public String changePassword(@RequestBody String accountInfo )throws Exception{
					 JSONObject userAndaccountInfoJson=JSON.parseObject(accountInfo);
						String accountNumber="";  //账号
						String password="";   //新密码
						boolean ischangeSuccess=true;
						if(userAndaccountInfoJson!=null){		
							  if(userAndaccountInfoJson.containsKey("accountNumber")&&userAndaccountInfoJson.containsKey("password")){ 
								  accountNumber=userAndaccountInfoJson.getString("accountNumber");
								  password=userAndaccountInfoJson.getString("password");
							   }
							  ischangeSuccess= userService.changePassword(accountNumber, password);
						}
					   //  System.out.println(name_pwd[1]+"-->"+name_pwd[2]);
					      //检验用户名是否合法，3-6个字母或数字，或2-5个汉字
					   /*  String regx="(^[a-z0-9_-]{3,6}$)|(^[\u2E80-\u9FFF]{2,5})";
					      if(!name_pwd[0].matches(regx)){
								  return "user";
							}*/
						if(ischangeSuccess){   //修改成功
							return "success";
						}			
					 return "error";
				}
}
