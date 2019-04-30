package cn.com.phone.controller;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import org.springframework.web.servlet.ModelAndView;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import cn.com.phone.pojo.Product;
import cn.com.phone.pojo.ShoppingCat;
import cn.com.phone.pojo.ShoppingImp;
import cn.com.phone.service.interfaces.ProductService;
import cn.com.phone.service.interfaces.ShoppingService;


/**
 * 购物车的处理类
 * @author SUser
 *
 */
@Controller
public class ShoppingCatController {
  @Autowired
   private ShoppingService shoppingService;
  @Autowired
  private ProductService productService;
  /**
   * 将添加到购物车的商品存入数据库
   * @param number
   * @return
   * @throws Exception
   */
  @RequestMapping("/AddCat")
  @ResponseBody
  public String AddCat(@RequestBody String shoppingCatJson)throws Exception{
	  		String number=""; //数量
	  		 int productId=0;//商品编号
			 String brand="";  //手机品牌
			 String accountNumber=""; //用户名
			 String ram="";  //内存大小
			 String ramPrice="";  //内存对应价格
		 JSONObject catJson=JSON.parseObject(shoppingCatJson);
		 if(catJson!=null){
			  number=catJson.getString("number");  
			  productId=catJson.getInteger("productId");  //商品编号
			  brand=catJson.getString("brand");  //手机品牌
			  accountNumber=catJson.getString("username");
			  ram=catJson.getString("ram");
			  ramPrice=catJson.getString("ramPrice");
		 }
	   Product product=productService.getPhoneInfoByProductId(productId, brand);
	   int result=shoppingService.getIsExistProduct(product, accountNumber, number,ram,ramPrice);
	   if(result<0){
		   return "error";
	   }
	  return "success";
  }
  /**
   * 加入购物车的在购物车显示
   * @return
   * @throws Exception
   */
  @RequestMapping("/ShowCat")
  public ModelAndView ShowCat(HttpSession session) throws Exception{
	 String accountNumber= (String)session.getAttribute("username");
	ModelAndView modelAndView=new ModelAndView();
	List<ShoppingCat> shoppingCatList=shoppingService.getShoppingCatInfos(accountNumber);
	 List<ShoppingImp> shoppingImpList=new ArrayList<ShoppingImp>();
	 double sum=0.0;
	for(ShoppingCat cat:shoppingCatList){
		ShoppingImp shoppingImp=new ShoppingImp();
		Product product=productService.getPhoneInfoByProductId(cat.getProductId(),cat.getBrand());
		String phonePic=product.getPicFilePath()+product.getPicNameType();
		shoppingImp.setAccountNumber(accountNumber);
		shoppingImp.setBrand(cat.getBrand());
		shoppingImp.setPhonePic(phonePic);
		shoppingImp.setNumber(cat.getNumber());
		shoppingImp.setProductName(cat.getProductName());
		shoppingImp.setPrice(cat.getPrice());
		shoppingImp.setProductId(cat.getProductId());
		shoppingImp.setRam(cat.getRam());
		//总计
		double  total=cat.getPrice().multiply(new BigDecimal(cat.getNumber())).doubleValue();
		shoppingImp.setTotal(total);
		shoppingImpList.add(shoppingImp);
	}
	for(ShoppingImp s:shoppingImpList)
	{
		sum+=s.getTotal();	
	}
	modelAndView.addObject("shoppingList",shoppingImpList);
	//传入所有商品的价格
	modelAndView.addObject("sum",sum);
	modelAndView.setViewName("shoppingcat");
	 return  modelAndView;
  }
  /**
   * 单个进行删除，btn_id和页面按钮的name属性一致
   * @param btn_id
   * @return
   * @throws Exception
   */
  @RequestMapping("/delectCat")
   public String delectCat(String btn_id,HttpSession session)throws Exception{
	  String[] productIdAndBrand=btn_id.split(",");
	  String productId=productIdAndBrand[0];
	  String brand=productIdAndBrand[1];
	  String ram=productIdAndBrand[2];
	  String accountNumber= (String)session.getAttribute("username");
	  int count=shoppingService.delectShoppingCat(accountNumber,Integer.valueOf(productId),brand,ram);
	  return "redirect:ShowCat.action";
  }
  
  
}
