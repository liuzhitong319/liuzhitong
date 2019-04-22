package com.liuzhitong.utils;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.nullValue;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.HttpServletRequest;

import org.junit.Test;
import org.junit.runner.Request;

/**
 * Web工具类
 * 按要求创建WebUtil集合工具类及方法，不得有Bug（30分）
*/
public class WebUtil {
	//方法1：获取url上的参数，返回字符串值类型，如果没有该参数则返回默认值 (5分)
	public static String getString(HttpServletRequest request, String name, String defaultValue){
	    //实现代码
		//如果没有该参数则返回默认值
		if (request==null) {
			return defaultValue;
		}
		String str = request.getParameter(name);
		//三目判断如果获取的url参数为空则返回默认值，不为空返回本身
		return str==null?defaultValue:str;
		
	}
	
	//方法2：获取url上的参数，返回整数类型，如果没有该参数或该参数不是整形值，则返回默认值 (5分)
	public int getInt(HttpServletRequest request, String name, Integer defaultValue){
	    //实现代码
		//如果没有该参数则返回默认值
				if (request==null) {
					return defaultValue;
				}
			try {
				//获取url上的参数，并返回整数类型
				  int parseInt = Integer.parseInt(request.getParameter(name));
				  return  parseInt;
				  
			} catch (Exception e) {
				// TODO: handle exception
			}
			return defaultValue;	
	}
	//方法3：获取url上的参数，返回布尔类型，如果没有该参数或该参数不是布尔类型，则返回false  (5分)
	public boolean getBoolean(HttpServletRequest request, String name, boolean defaultValue){
	    //实现代码
		//如果没有该参数则返回默认值
		if (request==null||request.getParameter(name)==null) {
			return defaultValue;
		}
		try {
			//获取url上的参数，并返回布尔类型
			  boolean b = Boolean.getBoolean(name);
			return b;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return defaultValue;
		
	}
	
	//方法4：获取当前请求地址，注意参数不能丢 (5分)
	public String getUrl(HttpServletRequest request){
	    //实现代码如果请求为空没有地址
		if (request==null) {
			return null;
		}
		String path = request.getContextPath();
		return path;
		
	}
	//方法5：给定一个Url名获得取Cookie值 (5分)
	//list?name=name&sex=sex获取name值
	public String getValue(String url,String name){
	    //实现代码
		url+="&";
		String p="(\\?|&){1}#{0,1}"+name+"=[a-zA-Z0-9]*(&{1})";
		Pattern pattern = Pattern.compile(p);
		Matcher m = pattern.matcher(url);
		if (m.find()) {
			return m.group(0).split("=")[1].replace("&", "");
		}
		return null;
	}
	//测试方法5list?name=name&sex=sex获取name值
	@Test
	public void test() {
		//list?name=name&sex=sex获取name值
		String string = getValue("list?name=zhangsan&sex=sex", "name");
		System.out.println(string);
	}
	
}
