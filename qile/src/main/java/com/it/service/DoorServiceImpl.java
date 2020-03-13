package com.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.mapper.DoorMapper;
import com.it.pojo.Door;
/**
 * @Service 
 *    作用1：将当前对象的创建交给spring管理
 *    作用2：作为业务层代码的标识
 */
@Service
public class DoorServiceImpl implements DoorService{

	@Autowired
	private DoorMapper doorMapper;
	
	@Override
	public List<Door> findAll() {
		//1.调用DoorMapper的findAll方法，查询所有门店信息
		List<Door> list = doorMapper.findAll();
		//2.将所有门店信息的List集合返回
		return list;
	}
	
	@Override
	public void deleteById(Integer id) {
		//根据id删除门店信息
		doorMapper.deleteById(id);
	}

	@Override
	public void addDoor(Door door) {
		doorMapper.addDoor(door);
	}

	@Override
	public Door findById(Integer id) {
		Door door = doorMapper.findById(id);
		return door;
	}

	@Override
	public void updateById(Door door) {
		doorMapper.updateById(door);
	}
}
