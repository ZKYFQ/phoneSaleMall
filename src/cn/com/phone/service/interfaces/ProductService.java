package cn.com.phone.service.interfaces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import cn.com.phone.pojo.HuaweiInfo;
import cn.com.phone.pojo.Product;


public interface ProductService {
	  /**
	   * 模糊查询出手机品牌类型
	   * @param seachWord
	   * @return
	   * @throws Exception
	   */
     public String selectProductType(String seachWord) throws Exception;
     /**
      * 获取手机信息
      * @return
      * @throws Exception
      */
     public List<Product> getPhoneInfo(String phoneType) throws Exception;
     /**
      * 根据商品编号及品牌查询手机信息
      * @param productId
      * @param brand
      * @return
      * @throws Exception
      */
     public Product getPhoneInfoByProductId(int productId,String brand) throws Exception;
}
