package com.it.mapper;

import java.util.List;
import com.it.pojo.Door;

/**
 * DoorMapper 接口
 * 声明增删改查方法，对门店信息进行操作
 * @author XINGGou
 */
public interface DoorMapper {

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
	 * @param door
	 */
	public void updateById(Door door);

}
