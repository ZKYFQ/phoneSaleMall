package cn.com.phone.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder.In;

import org.springframework.beans.factory.annotation.Autowired;

import com.mysql.fabric.xmlrpc.base.Array;

import cn.com.phone.mapper.ProductMapper;
import cn.com.phone.mapper.SeachWordMapper;
import cn.com.phone.pojo.Product;
import cn.com.phone.pojo.SeachWord;
import cn.com.phone.service.interfaces.ProductService;

public class ProductServiceImp implements ProductService{ 
    @Autowired 
    private ProductMapper productMapper;
    @Autowired 
    private SeachWordMapper seacherWordMapper;


@Override
public String selectProductType(String seachWord) throws Exception {
	  List<SeachWord> seachwords=seacherWordMapper.selectProductType(seachWord);
	  String phoneType="";
	  if(seachwords!=null&&seachwords.size()>0){
		  for(SeachWord seachword:seachwords){
			  phoneType=seachword.getBrankFlag();
		  }
	  }
	return phoneType;
}

@Override
public List<Product> getPhoneInfo(String phoneType) throws Exception {
    List<Product> phoneInfos=new ArrayList<Product>();
	   if("HUAWEI".equals(phoneType)){  //华为手机
		   phoneInfos=productMapper.selectHuaWei();
	   }
	   if("XIAOMI".equals(phoneType)){  //小米
		   phoneInfos=productMapper.selectXiaoMi();
		}
	   if("HONOUR".equals(phoneType)){  //荣耀
		   phoneInfos=productMapper.selectHonour();
		}
	   if("OPPO".equals(phoneType)){  //Oppo
		   phoneInfos=productMapper.selectOppo();
		}
	   if("VIVO".equals(phoneType)){  //Vivo
		   phoneInfos=productMapper.selectVivo();
		}
	   if("MEIZU".equals(phoneType)){  //魅族
		   phoneInfos=productMapper.selectMeizu();
		}
	   if("APPLE".equals(phoneType)){  //小米
		   phoneInfos=productMapper.selectApple();
		}
       if(!phoneInfos.isEmpty()&&phoneInfos.size()>0){
    	   return phoneInfos;
       }
	return phoneInfos;
}


@Override
public Product getPhoneInfoByProductId(int productId,String brand) throws Exception {
	Product phoneInfo=new Product();
	if("HUAWEI".equals(brand)){  //华为
		phoneInfo=productMapper.selectByHuaWeiProductId(productId);
	}
	if("XIAOMI".equals(brand)){  //小米
		phoneInfo=productMapper.selectByXiaoMiProductId(productId);
	}
	if("OPPO".equals(brand)){  //OPPO
		phoneInfo=productMapper.selectByOppoProductId(productId);
	}
	  if("HONOUR".equals(brand)){  //荣耀
		  phoneInfo=productMapper.selectByHonourProductId(productId);
		}
	   if("VIVO".equals(brand)){  //Vivo
		   phoneInfo=productMapper.selectByVivoProductId(productId);
		}
	   if("MEIZU".equals(brand)){  //魅族
		   phoneInfo=productMapper.selectByMeizuProductId(productId);
		}
	   if("APPLE".equals(brand)){  //苹果
		   phoneInfo=productMapper.selectByAppleProductId(productId);
		}
	return phoneInfo;
}
    
    
}
