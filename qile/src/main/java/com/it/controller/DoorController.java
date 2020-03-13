package com.it.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.it.pojo.Door;
import com.it.service.DoorService;

/**
 * @Controller
 *   作用1： 将当前对象的创建交给spring管理
 *   作用2：作为控制层代码的标识
 */
@Controller
public class DoorController {

	@Autowired	//自动注入(由spring创建当前对象并为属性赋值)
	private DoorService doorService;
	
	/** 1.查询所有门店信息 */
	@RequestMapping("/doorList")
	public String doorList(Model model){
		//调用service层的findAll方法，查询所有的门店信息
		List<Door> list = doorService.findAll();
		
		//将所有门店信息的list集合存入model中，带到JSP显示
		model.addAttribute("list", list);
		
		return "door_list";
	}

	/**
	 * 2.根据id删除门店信息
	 */
	@RequestMapping("/doorDelete")
	public String doorDelete(Integer id){
		//调用deleteById方法, 根据id删除门店
		doorService.deleteById(id);
		
		return "redirect:/doorList";
	}
	
	/** 3.添加门店信息 */
	@RequestMapping("/doorAdd")
	public String doorAdd(Door door){
		//System.out.println(door);
		//1.调用DoorService层的addDoor方法, 添加门店信息
		doorService.addDoor(door);
		
		return "redirect:/doorList";
	}
	
	/** 4.根据id修改门店信息
	 *  4.1.先根据id查询当前门店的信息 */
	@RequestMapping("/doorInfo")
	public String doorInfo(Integer id, Model model){
		//1.根据id查询门店信息
		Door door = doorService.findById(id);
		System.out.println(door);
		
		//2.将门店信息存入model中(存入request域中)
		model.addAttribute("door", door);
		//3.转向door_update.jsp
		return "door_update";
	}
	
	/** 4.根据id修改门店信息
	 *  4.1.先根据id查询当前门店的信息
	 *  4.2.再根据id修改当前门店的信息 */
	@RequestMapping("/doorUpdate")
	public String doorUpdate(Door door){
		//System.out.println(door);
		//1.调用doorService的updateById方法修改门店信息
		doorService.updateById(door);
		//2.转向查询所有门店的方法
		return "redirect:/doorList";
	}
}
