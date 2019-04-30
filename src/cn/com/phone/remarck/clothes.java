package cn.com.phone.remarck;

import java.util.ArrayList;
import java.util.List;

/**
 * 衣服类，用于存储衣服相关的信息
 * @author Kai
 *
 */
public class clothes {
  private List<String> brand;
  private  List<String> man;
  private  List<String> woman;
  private  List<String>  size;
  private List<String> row;
  public List<String> brand_init(){
  	brand=new ArrayList<String>();
  	brand.add("花花公子");
  	brand.add("七匹狼");
  	brand.add("森马");
  	brand.add("卡宾");
  	brand.add("布先生");
		return brand;
  }
  
  public List<String> woman_init(){
	  woman=new ArrayList<String>();
	  woman.add("连衣裙");
	  woman.add("T恤");
	  woman.add("中年妇女");
	  woman.add("寸衫");
	  woman.add("卫衣");
		return woman;
  }
  public List<String> man_init(){
	  man=new ArrayList<String>();
	  man.add("T恤");
	  man.add("寸衫");
	  man.add("卫衣");
	  man.add("夹克");
	  man.add("风衣");
		return man;
  }
  public List<String> size_init(){
	  size=new ArrayList<String>();
	  size.add("37");
	  size.add("38");
	  size.add("39");
	  size.add("40");
	  size.add("41");
		return size;
  }
  public List<String> row_init(){
 	 row=new ArrayList<String>();
 	 row.add("品牌");
 	 row.add("男装");
 	 row.add("女装");
 	 row.add("尺寸大小");
		return row;
 }
}
