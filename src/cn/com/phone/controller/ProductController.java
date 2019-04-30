package cn.com.phone.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.com.phone.common.utils.JSONUtils;
import cn.com.phone.mapper.UserInfoMapper;
import cn.com.phone.pojo.Product;
import cn.com.phone.pojo.UserInfo;
import cn.com.phone.pojo.paymentInfoBean;
import cn.com.phone.remarck.clothes;
import cn.com.phone.remarck.phone;
import cn.com.phone.service.interfaces.ProductService;
import cn.com.phone.service.interfaces.UserService;


/**
 * 处理商品的业务,
 * 根据商品的名称进行模糊查询
 * 要注意ModelAndView引入的包一定要是
 * import org.springframework.web.servlet.ModelAndView;
 * 否者无法读取
 * @author Kai
 *
 */
@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private UserService userService;
    
    @RequestMapping("/Selectproduct")
    public ModelAndView Selectproduct(String productname)throws Exception{
    	List<Product> productList=new ArrayList<Product>();
    	    String phoneType =productService.selectProductType(productname); 
	    	  productList=productService.getPhoneInfo(phoneType);
    	     ModelAndView modelAndView=new ModelAndView();
    	     modelAndView.addObject("productList",productList);
    	     modelAndView.setViewName("product");
    	return modelAndView;
    }
    
    @RequestMapping("/seachProduct")
    public ModelAndView seachProduct(@RequestParam(value="keyword")String keyword)throws Exception{
    	List<Product> productList=new ArrayList<Product>();
    	    String phoneType =productService.selectProductType(keyword); 
	    	  productList=productService.getPhoneInfo(phoneType);
    	     ModelAndView modelAndView=new ModelAndView();
    	     modelAndView.addObject("productList",productList);
    	     modelAndView.setViewName("product");
    	return modelAndView;
    } 
    @RequestMapping("/showmess")
    @ResponseBody
public List<List<String>> showmess()throws Exception{
	  List<List<String>> result=new ArrayList<List<String>>();
		  phone p=new phone();
		  result.add(p.brand_init());
		  result.add(p.cpu_init());
		  result.add(p.ram_init());
		  result.add(p.rom_init());
		  result.add(p.row_init());
	return result;
}
    
	/**
	 * 跳转至商详细信息页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/product_mess")
	public ModelAndView product_mess(@RequestParam(value="id")Integer id,@RequestParam(value="brand")String brand)throws Exception{
		System.out.println(id);
          Product product=productService.getPhoneInfoByProductId(id,brand);
         ModelAndView modelAndView=new ModelAndView();
		 modelAndView.addObject("product",product);
		 modelAndView.setViewName("product_mess");
		return modelAndView;
	}
	/**
	 * 跳转至支付页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/payment",produces = "text/html;charset=UTF-8")
    @ResponseBody
	public String payment(HttpSession session)throws Exception{
		 String accountNumber= (String)session.getAttribute("username"); 
		 UserInfo userInfo=userService.getUserInfoByAccountNumber(accountNumber);
		 String userName="";  //用户名
		 String billId="";  //手机号
		 StringBuilder dimUserName=new StringBuilder();   //姓名模糊化处理
		 StringBuilder dimBillId=new StringBuilder();    //手机号也模糊化处理
		 if(userInfo!=null){
			 userName=userInfo.getUserName();
			 billId=userInfo.getBillId();
			 dimUserName.append(userName.substring(0,1)).append("**");
			 dimBillId.append(billId.substring(0, 3)).append("****").append(billId.substring(7, billId.length()));
		 }
		 String ram= (String)session.getAttribute("ram");
		 String ramPrice=(String)session.getAttribute("ramPrice");
		 String productName=(String)session.getAttribute("productName");
		 String number=(String)session.getAttribute("number");
		 String[] priceRam=ramPrice.split("￥");
		 double price=Integer.valueOf(number)*Double.valueOf(priceRam[1]);
	 Map<String,String> map=new HashMap<String, String>();
		 map.put("ram", ram);
		 map.put("ramPrice", ramPrice);
		 map.put("productName", productName);
		 map.put("number", number);
		 map.put("price", String.valueOf(price));
		 map.put("userName",dimUserName.toString());
		 map.put("accountPay",dimBillId.toString());
		 String payInfo=JSONUtils.MapToJsonString(map);
		return payInfo;
	}
	
	/**
	 * 将支付信息存入session
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value="/paymentInfo", produces="text/html;charset=UTF-8")
	  @ResponseBody
	public String paymentInfo(@RequestBody String paymentInfos,HttpSession session)throws Exception{
		JSONObject paymentInfo=JSON.parseObject(paymentInfos);
		if(paymentInfo!=null){
			String ram=paymentInfo.getString("ram");
			String ramPrice=paymentInfo.getString("ramPrice");
			String productName=paymentInfo.getString("productName");
			String number=paymentInfo.getString("number");
			session.setAttribute("ram", ram);
			session.setAttribute("ramPrice", ramPrice);
			session.setAttribute("productName", productName);
			session.setAttribute("number", number);
		}
		return "true";
	}
    
	/**
	 * 跳转至商详细信息页面
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/priceRam")
	@ResponseBody
	public String priceRam(@RequestBody String priceRamJson)throws Exception{
		String brand="";   //品牌
		String price=""; //价格
		int ram=0;   //内存
		double ramPric=0.00;   //内存对应的价格
		JSONObject priceramJson=JSON.parseObject(priceRamJson);
		 
		 if(priceramJson!=null){
			 brand=priceramJson.getString("brand");
			 price=priceramJson.getString("price");
			 ram=priceramJson.getInteger("ram");
		 }
		 if("HUAWEI".equals(brand)){
			 if(32==ram){  //32g内存
				 ramPric=200+Double.valueOf(price);
			 }
			 if(64==ram){
				 ramPric=350+Double.valueOf(price);
			 }
			 if(128==ram){
				 ramPric=500+Double.valueOf(price);
			 }
		 }
		 if("XIAOMI".equals(brand)){
			 if(32==ram){  //32g内存
				 ramPric=175+Double.valueOf(price);
			 }
			 if(64==ram){
				 ramPric=210+Double.valueOf(price);
			 }
			 if(128==ram){
				 ramPric=420+Double.valueOf(price);
			 }
		 }
		 if("OPPO".equals(brand)){
			 if(32==ram){  //32g内存
				 ramPric=194+Double.valueOf(price);
			 }
			 if(64==ram){
				 ramPric=240+Double.valueOf(price);
			 }
			 if(128==ram){
				 ramPric=430+Double.valueOf(price);
			 }
		 }
		 return String.valueOf(ramPric);
	}
}
