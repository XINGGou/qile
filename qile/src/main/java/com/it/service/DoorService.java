package com.it.service;

import java.util.List;

import com.it.pojo.Door;

public interface DoorService {

	/**
	 * 查询所有门店信息
	 */
	public List<Door> findAll();
	
	/**
	 * 2.根据id删除门店信息
	 * @param id
	 */
	public void deleteById(Integer id);
	
	/**
	 * 3.添加门店信息
	 * @param door
	 */
	public void addDoor(Door door);
	
	/**
	 * 4.根据id查询门店信息
	 * @param id
	 * @return
	 */
	public Door findById(Integer id);
	
	/**
	 * 5.根据id修改门店信息
	 * @param Door
	 * @return
	 */
	public void updateById(Door door);
	
	
}
