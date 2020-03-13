package com.it.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.it.mapper.DoorMapper;
import com.it.pojo.Door;


/** 测试类：测试SSM开发环境 */
@Controller /* 这个注解表示当前类属于Controller层代码 */
public class TestSSM {
	
	/** 自动装配：由spring自动为属性赋值(对象)  */
	@Autowired
	DoorMapper doorMapper;
	
	@RequestMapping("/testssm")
	public String testSSM(){
		//1.调用findAll方法查询所有门店信息
		List<Door> list = doorMapper.findAll();
		//2.遍历所有门店信息
		for(Door door : list){
			System.out.println(door);
		}
		return "test";
	}
}