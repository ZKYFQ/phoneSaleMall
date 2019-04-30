package cn.com.phone.common.utils;

import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class JSONUtils {
	/**
	 * 将map对象转化成json字符串
	 * @param map
	 * @return
	 */
	public static String MapToJsonString(Map map){
		 String json=JSONObject.toJSONString(map);
		return json;
    }
}
