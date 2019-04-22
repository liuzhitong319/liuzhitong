package com.liuzhitong.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

/**
 * 字符串工具类
 * 按要求创建StringUtil字符串工具类及方法，不得有Bug（30分）
*/
public class StringUtil {
    //方法1：判断源字符串是否有值，空引号(空白字符串)也算没值 (5分)
	public boolean hasLength(String src){
	    //实现代码
		if (src==null || src.length()==0) {
			return false;
		}
		return true;
	}
	//方法1测试 true有值
	@Test
	public void test1() {
		//空引号(空白字符串)
		boolean b = hasLength("");
		System.out.println(b);
		boolean b2= hasLength("aa");
		System.out.println(b2);
	}
	//方法2：判断源字符串是否有值，空引号(空白字符串)和空格也算没值 (5分)
	public boolean hasText(String src){
	    //实现代码trim测试空格
		if (src==null || src.trim().length()==0) {
			return false;
		}
		return true;
	}
	//方法2测试 true有值/false没值
		@Test
		public void test2() {
			//空引号(空白字符串)
			boolean b = hasText("");
			System.out.println(b);
			//测试空格
			boolean b1 = hasText(" ");
			System.out.println(b1);
			boolean b2= hasText("aa");
			System.out.println(b2);
		}
		//方法3：判断是否为手机号码 (5分)
		public boolean isMobile(String src){
		    //实现代码、空引号(空白字符串)和空格直接返回
			if (src==null || src.trim().length()==0) {
				return false;
			}
			//数字长度不在11位直接返回
			if (src.trim().length()!=11) {
				return false;
			}
			
			char[] cs = src.toCharArray();
			for (int i = 0; i < cs.length; i++) {
				//判断第一位数字
				if (cs[0]=='2'||cs[0]=='6'||cs[0]=='7'||cs[0]=='8'||cs[0]=='0'||cs[0]=='9') {
					return false;
				}
				//判断第二位数字
				if (cs[1]=='2'||cs[1]=='6'||cs[1]=='7'||cs[1]=='8'||cs[1]=='0') {
					return false;
				}
			}
			return true;
			
		}
		//测试方法3:true是手机号码
		@Test
		public void test3() {
			//空格
			boolean mobile = isMobile(" ");
			System.out.println(mobile);
			//空引号（空白字符串）
			boolean mobile1 = isMobile("");
			System.out.println(mobile1);
			//长度不是11位
			boolean mobile2 = isMobile("23333333 ");
			System.out.println(mobile2);
			//首字符不符合要求含2,6,7,8,0,9
			boolean mobile3 = isMobile("20000000003 ");
			System.out.println(mobile3);
			//第二位不符合要求含2,6,7,8,0
			boolean mobile4 = isMobile("10000000003 ");
			System.out.println(mobile4);
			//全符合规范手机号
			boolean mobile5 = isMobile("13000000003 ");
			System.out.println(mobile5);
			
			
		}
		
		//方法4：判断是否为邮箱 (5分)
		public boolean isEmail(String src){
		    //实现代码
			//实现代码、空引号(空白字符串)和空格直接返回
			if (src==null || src.trim().length()==0) {
				return false;
			}
			src+="@";
			//正则格式
			String p="(@){1}#{0,1}[a-zA-Z0-9]*({1})";
			Pattern pattern = Pattern.compile(p);
			Matcher m = pattern.matcher(src);
			if (m.find()) {
				return true;
			}
			return true;
		}
		//方法4测试 true邮箱符合/false不合符规范
				@Test
				public void test4() {
					//空引号(空白字符串)
					boolean b = isEmail("");
					System.out.println(b);
					//测试空格
					boolean b1 = isEmail(" ");
					System.out.println(b1);
					//不符合规范的邮箱
					boolean b2 = isEmail("@222882.qq.com ");
					System.out.println(b);
					//符合规范的qq邮箱
					 boolean b3= isEmail("1441812666@qq.com");
					System.out.println(b3);
				}
				
				//方法5：反转字符串，例如参数值是“abcdefg”，则输出“gfedcba” (5分)
				public String reverse(String src){
				    //实现代码
					if (src==null || src.trim().length()==0) {
						return null;
					}
					
					 String string = StringUtils.reverse(src);
					 return string;
					
				}
				//方法5测试 
				@Test
				public void test5() {
					//空引号(空白字符串)
					String reverse = reverse("");
					System.out.println(reverse);
					//测试abcdefg
					 String string = reverse("abcdefg");
					 System.out.println(string);
				
				}	
				
				
				
	
}
