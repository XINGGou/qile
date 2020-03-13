package com.it.mapper;

import java.util.List;

import com.it.pojo.Order;

public interface OrderMapper {

	/**
	 * 1.查询所有订单信息
	 * @return
	 */
	List<Order> findAll();
	/**
	 * 2.根据id删除订单信息
	 * @param id
	 */
	void deleteById(Integer id);
	
	/**
	 * 3.添加订单信息
	 * @param order
	 */
	void addOrder(Order order);
	
	/**
	 * 4.1.根据id查询订单信息
	 * @param id
	 * @return
	 */
	Order findById(Integer id);
	/**
	 * 4.2.根据id修改订单信息
	 * @param order
	 */
	void updateById(Order order);
	
}
