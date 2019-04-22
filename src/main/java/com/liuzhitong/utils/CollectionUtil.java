package com.liuzhitong.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * 集合工具类
 * 按要求创建CollectionUtil集合工具类及方法，不得有Bug（10分）
*/
public class CollectionUtil {
	//方法1：判断List或Set集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(List<?> list){
	    //实现代码
		return list!=null&&!list.isEmpty();
	}
	public boolean notEmpty(Set<?> set){
		//实现代码
		return set!=null&&!set.isEmpty();
	}
	//测试方法1 判断方法为如何使空则false，不是空则true
	@Test
	public void test1() {
		//对象为空或对象中没有元素
		List list=new ArrayList<>();
		boolean b = notEmpty(list);
		System.out.println(b);
		//有元素的情况才是true 方法为notempty意不为空
		Set set=new HashSet<>();
		boolean c = notEmpty(set);
		System.out.println(c);
		
		
	}
	//方法2：判断Map集合是否有元素，对象为空或对象中没有元素都算没值 (5分)
	public boolean notEmpty(Map<?, ?> map){
	    //实现代码
		return map!=null&&!map.isEmpty();
	}
	//测试方法2 判断方法为如何使空则false，不是空则true
		@Test
		public void test2() {
			//对象为空或对象中没有元素
		//有元素的情况才是true 方法为notempty意不为空
			Map map=new HashMap<>();
			boolean b = notEmpty(map);
			System.out.println(b);
			
			
		}
	
}
