package com.it.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.it.mapper.OrderMapper;
import com.it.pojo.Order;

/**
 * @Service 
 * 作用(1): 标识当前类属于service层
 * 作用(2): spring会扫描service包下所有带有
 * @Service注解的类, 将类注册到spring容器中
 * (即由spring容器创建实例)
 */
@Service
public class OrderServiceImpl
		implements OrderService {
	@Autowired	//由spring创建对象并为变量赋值
	OrderMapper orderMapper;
	
	@Override
	public List<Order> findAll() {
		//1.调用orderMapper的findAll方法查询所有订单
		List<Order> list = orderMapper.findAll();
		return list;
	}

	@Override
	public void deleteById(Integer id) {
		//1.调用OrderMapper的deleteById方法
			//根据id删除订单信息
		orderMapper.deleteById(id);
	}

	@Override
	public void addOrder(Order order) {
		//1.调用OrderMapper的addOrder方法
		orderMapper.addOrder(order);
	}

	@Override
	public Order findById(Integer id) {
		//1.调用OrderMapper的findById方法
		Order order = orderMapper.findById(id);
		
		return order;
	}

	@Override
	public void updateById(Order order) {
		//1.调用OrderMapper中的updateById方法
		orderMapper.updateById(order);
	}
}







