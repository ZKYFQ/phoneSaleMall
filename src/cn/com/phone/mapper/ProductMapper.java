package cn.com.phone.mapper;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.com.phone.pojo.Product;
import cn.com.phone.pojo.ProductExample;

public interface ProductMapper {
    int countByExample(ProductExample example);

    int deleteByExample(ProductExample example);

    int deleteByPrimaryKey(Integer productid);

    int insert(Product record);

    int insertSelective(Product record);

    List<Product> selectByExample(ProductExample example);

    Product selectByProductId(@Param("productId") Integer productid);

    int updateByExampleSelective(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByExample(@Param("record") Product record, @Param("example") ProductExample example);

    int updateByPrimaryKeySelective(Product record);

    int updateByPrimaryKey(Product record);
	
	List<Product> selectProductList(String productname);
	//华为手机信息
    List<Product> selectHuaWei();
    //荣耀
    List<Product> selectHonour();
    //小米
    List<Product> selectXiaoMi();
    //OPPO
    List<Product> selectOppo();
    //Vivo
    List<Product> selectVivo();
    //魅族
    List<Product> selectMeizu();
    //苹果
    List<Product> selectApple();
    
    //根据商品编号查询华为
    Product selectByHuaWeiProductId(@Param("productId")int productId);
    //根据商品编号查询小米
    Product selectByXiaoMiProductId(@Param("productId")int productId);
    //根据商品编号查询Oppo
    Product selectByOppoProductId(@Param("productId")int productId);
    //根据商品编号查询荣耀
    Product selectByHonourProductId(@Param("productId")int productId);
    //根据商品编号查询Vivo
    Product selectByVivoProductId(@Param("productId")int productId);
    //根据商品编号查询魅族
    Product selectByMeizuProductId(@Param("productId")int productId);
    //根据商品编号查询苹果
    Product selectByAppleProductId(@Param("productId")int productId);
}