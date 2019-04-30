package cn.com.phone.mapper;

import cn.com.phone.pojo.ShoppingCat;
import cn.com.phone.pojo.ShoppingCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShoppingCatMapper {
    int countByExample(ShoppingCatExample example);

    int deleteByExample(ShoppingCatExample example);

    int deleteByPrimaryKey(Integer accoutNumber);

    int insert(ShoppingCat record);

    int insertSelective(ShoppingCat record);

    List<ShoppingCat> selectByExample(ShoppingCatExample example);

    ShoppingCat selectByPrimaryKey(Integer accoutNumber);

    int updateByExampleSelective(@Param("record") ShoppingCat record, @Param("example") ShoppingCatExample example);

    int updateByExample(@Param("record") ShoppingCat record, @Param("example") ShoppingCatExample example);

    int updateByPrimaryKeySelective(ShoppingCat record);

    int updateByPrimaryKey(ShoppingCat record);
    
    ShoppingCat selectCatByProdIdAndAccountAndBrand(@Param("productId") int productId, @Param("accountNumber") String accountNumber, @Param("brand")String brand,@Param("ram")String ram);

    int updateByAccAndProAndBrand(ShoppingCat shoppingCat);

    List<ShoppingCat> selectCatByAccountNumber(@Param("accountNumber") String accountNumber);
    
    int delectShoppingCatInfo(@Param("productId") int productId, @Param("accountNumber") String accountNumber, @Param("brand")String brand,@Param("ram")String ram);
}