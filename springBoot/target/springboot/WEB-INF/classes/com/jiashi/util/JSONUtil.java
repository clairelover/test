package com.jiashi.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;



/**
 * 
 * 类名称： JSONUtil
 * 类描述： JSON数据格式转换工具类 
 * 创建人： 许洪涛 创建时间： 2018-2-8 下午17:11:33 
 * 修改人：
 * 修改时间：
 * 
 * @version 1.0.0
 */
public class JSONUtil {

	/**
	 * 
	 * jsonStringToObject(Json字符串转换为java对象)
	 * 
	 * @param type
	 *            java对象类型 如:Object.class
	 * @param jsonStr
	 *            json字符串
	 * @return T 转化后的java对象
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @since 1.0.0
	 */
	public static <T> T jsonStringToObject(Class<T> type, String jsonStr)
			throws JsonParseException, JsonMappingException, IOException {

		return new ObjectMapper().readValue(jsonStr, type);
	}

	/**
	 * 
	 * objectToJSONString(java对象转换为Json字符串)
	 * 
	 * @param object
	 *            java对象 如：javaBean对象、Map集合、List集合
	 * @return json字符串
	 * @throws (IOException常)
	 * @since 1.0.0
	 */
	public static <T> String objectToJSONString(T object) throws IOException {

		return new ObjectMapper().writeValueAsString(object);
	}

	/**
	 * java对象转换为Json字符串
	 * @param object 可以是任何java对象，一般为list
	 * @param code 状态码
	 * @param msg 返回前端的提示信息
	 * @return
	 * @throws IOException
	 */
	public static <T> String objectToJSONString(Boolean succeed,Object object,String code,String msg) throws IOException {
		JsonObjectResult ent = new JsonObjectResult();
		ent.setSucceed(succeed);
		ent.setData(object);
		ent.setMsg(msg);
		ent.setCode(code);
		return new ObjectMapper().writeValueAsString(ent);
	}
	/**
	 * 
	 * jsonStringsToObjectArray(将多个同类型json的字符串转换为java对象数组)
	 * 
	 * @param type
	 *            java对象数组类型 如：Object[].class
	 * @param jsonStr
	 *            多个同类型json字符串 如："[jsonString1,jsonString2,...]"
	 * @return T[] 存放对象的数组
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @since 1.0.0
	 */
	public static <T> T[] jsonStringsToObjectArray(TypeReference<T[]> type, String jsonStr)
			throws JsonParseException, JsonMappingException, IOException {

		return new ObjectMapper().readValue(jsonStr, type);
	}

	/**
	 * 
	 * jsonStringsToObjectList(将多个同类型json的字符串转换为java对象List)
	 * 
	 * @param type
	 *            java对象数组类型 如：Object[].class
	 * @param jsonStr
	 *            多个同类型json的字符串 如："[jsonString1,jsonString2,...]"
	 * @return List<T> list数据集合
	 * @throws JsonParseException
	 * @throws JsonMappingException
	 * @throws IOException
	 * @since 1.0.0
	 */
	public static <T> List<T> jsonStringsToObjectList(TypeReference<List<T>> type, String jsonStr)
			throws JsonParseException, JsonMappingException, IOException {
		List<T> list = new ArrayList<T>(0);
		list = new ObjectMapper().readValue(jsonStr, type);

		return list;
	}

}
