package com.it.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 测试类：测试springmvc开发环境
 * @author XINGGou
 */
@Controller
public class TestController {

	@RequestMapping("/hello")
	public String hello(){
		System.out.println("test springmvc~~");
		return "test";
	}
	
}
