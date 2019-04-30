package cn.com.phone.service.interfaces;

import java.util.List;

import cn.com.phone.pojo.Product;
import cn.com.phone.pojo.ShoppingCat;

public interface ShoppingService {
    /**
     * 根据商品编号，账号，和品牌查重
     * @param productId
     * @param accountNumber
     * @param brand
     * @return
     * @throws Exception
     */
    public int getIsExistProduct(Product product,String accountNumber,String number,String ram,String ramPrice) throws Exception;
    
    public List<ShoppingCat> getShoppingCatInfos(String accountNumber) throws Exception;
    
    public int delectShoppingCat(String accountNumber,int productId,String brand,String ram) throws Exception;
}
