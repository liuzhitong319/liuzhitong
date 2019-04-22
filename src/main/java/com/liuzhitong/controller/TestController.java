package com.liuzhitong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.liuzhitong.utils.WebUtil;

@Controller
public class TestController {
    
	@RequestMapping("say")
	public String say(@RequestParam()String name,@RequestParam(defaultValue="name")String defaultValue,HttpServletRequest request)
	{  
		String string = WebUtil.getString(request, name, defaultValue);
		
		
		
		return string;
		
	}
}
