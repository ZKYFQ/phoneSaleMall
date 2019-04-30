package cn.com.phone.common.utils;

import java.sql.Timestamp;
import java.util.Date;

public class DateUtils {
  
	/**
	 * 获取当前时间类型为Date
	 * @return
	 * @throws Exception
	 */
    public static Date getCurrDate() throws Exception{
         	Date currDate=new Date();
         	return currDate;
    }
	/**
	 * 获取当前时间类型为Timp
	 * @return
	 * @throws Exception
	 */
	public static Timestamp getTimesTampCurrDate() throws Exception{
		Timestamp currDate=new Timestamp(System.currentTimeMillis());
		return currDate;
	}
}
