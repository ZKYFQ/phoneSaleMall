package cn.com.phone.service.impl;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.validator.internal.engine.messageinterpolation.parser.BeginState;
import org.springframework.beans.factory.annotation.Autowired;

import cn.com.phone.common.utils.DateUtils;
import cn.com.phone.mapper.ShoppingCatMapper;
import cn.com.phone.pojo.Product;
import cn.com.phone.pojo.ShoppingCat;
import cn.com.phone.service.interfaces.ShoppingService;


public class ShoppingServiceImp implements ShoppingService{
   @Autowired 
   private ShoppingCatMapper shoppingCatMapper;

	@Override
	public int getIsExistProduct(Product product, String accountNumber,String number,String ram,String ramPrice) throws Exception {
		int productId=product.getProductId();  //商品编号
		String brand=product.getBrand();  //品牌
		int result=0;   //返回结果
        String[] ramPrices=ramPrice.split("￥");
		BigDecimal priceRam=new BigDecimal(ramPrices[1]);
		  ShoppingCat shoppingCat=shoppingCatMapper.selectCatByProdIdAndAccountAndBrand(productId, accountNumber, brand,ram);
			if(shoppingCat!=null){  //存在，更新
				int Onumber=shoppingCat.getNumber();
				shoppingCat.setNumber(Onumber+Integer.valueOf(number));
				result=shoppingCatMapper.updateByAccAndProAndBrand(shoppingCat);
			}else{
				ShoppingCat shoppingCatNew=new ShoppingCat();
				shoppingCatNew.setAccountNumber(accountNumber);
				shoppingCatNew.setBrand(brand);
				shoppingCatNew.setNumber(Integer.valueOf(number));
				shoppingCatNew.setProductId(productId);
				shoppingCatNew.setPrice(priceRam);
				shoppingCatNew.setProductName(product.getProductName());
				shoppingCatNew.setRam(ram);
				shoppingCatNew.setCreateDate(DateUtils.getCurrDate());
				result=shoppingCatMapper.insert(shoppingCatNew);
			}
		  return result;
	}
	@Override
	public List<ShoppingCat> getShoppingCatInfos(String accountNumber)
			throws Exception {
		
		return shoppingCatMapper.selectCatByAccountNumber(accountNumber);
	}
	@Override
	public int delectShoppingCat(String accountNumber, int productId,
			String brand,String ram) throws Exception {
		int result=shoppingCatMapper.delectShoppingCatInfo(productId, accountNumber, brand,ram);
		return result;
	}

}
