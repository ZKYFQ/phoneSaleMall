package cn.com.phone.remarck;

import java.util.ArrayList;
import java.util.List;

/**
 * 用于存放手机相关的信息
 * @author Kai
 *
 */
public class phone {
     private List<String>brand;
     private List<String> rom;
     private List<String>cpu;
     private List<String> ram;  //运行内存
     private List<String> row;  //代表列名
    public List<String> brand_init(){
    	brand=new ArrayList<String>();
    	brand.add("华为");
    	brand.add("荣耀");
    	brand.add("小米");
    	brand.add("魅族");
    	brand.add("OPPO");
		return brand;
    }
    
    public List<String> rom_init(){
    	rom=new ArrayList<String>();
    	rom.add("8GB");
    	rom.add("16GB");
    	rom.add("32GB");
    	rom.add("64GB");
    	rom.add("128GB");
		return rom;
    }
    public List<String> cpu_init(){
    	cpu=new ArrayList<String>();
    	cpu.add("八核");
    	cpu.add("四核");
    	cpu.add("十核");
    	cpu.add("单核");
    	cpu.add("双核");
		return cpu;
    }
    public List<String> ram_init(){
    	ram=new ArrayList<String>();
    	ram.add("2GB");
    	ram.add("3GB");
    	ram.add("4GB");
    	ram.add("6GB");
    	ram.add("8GB");
		return ram;
    }
    public List<String> row_init(){
    	 row=new ArrayList<String>();
    	 row.add("品牌");
    	 row.add("机身内存");
    	 row.add("cpu核心数");
    	 row.add("运行内存");
		return row;
    }
}
