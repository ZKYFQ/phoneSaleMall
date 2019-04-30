package cn.com.phone.pojo;

import java.math.BigDecimal;

public class ShoppingImp extends ShoppingCat{
    private double total;  //总计
    private String phonePic;  //手机图片
	public double getTotal() {
		return total;
	}

	public String getPhonePic() {
		return phonePic;
	}

	public void setPhonePic(String phonePic) {
		this.phonePic = phonePic;
	}

	public void setTotal(double total) {
		this.total = total;
	}


}
