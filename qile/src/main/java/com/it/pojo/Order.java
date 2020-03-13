package com.it.pojo;

import java.util.Date;

/**
 * 订单信息类, 用于封装订单信息
 */
public class Order {
	//1.声明属性
	private Integer id;		//订单id
	private Integer doorId;	//门店id
	private String orderNo; //订单编号
	private String orderType;//订单类型(巧克力蛋糕/奶茶/咖啡等)
	private Integer pnum;	//用餐人数
	private String cashier;	//收银员
	private Date orderTime;	//下单时间
	private Date payTime;	//支付时间
	private String payType;	//支付类型(微信支付/支付宝支付)
	private Double price;	//支付金额
	
	//2.提供getter和setter方法
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getDoorId() {
		return doorId;
	}
	public void setDoorId(Integer doorId) {
		this.doorId = doorId;
	}
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public Integer getPnum() {
		return pnum;
	}
	public void setPnum(Integer pnum) {
		this.pnum = pnum;
	}
	public String getCashier() {
		return cashier;
	}
	public void setCashier(String cashier) {
		this.cashier = cashier;
	}
	public Date getOrderTime() {
		return orderTime;
	}
	public void setOrderTime(Date orderTime) {
		this.orderTime = orderTime;
	}
	public Date getPayTime() {
		return payTime;
	}
	public void setPayTime(Date payTime) {
		this.payTime = payTime;
	}
	public String getPayType() {
		return payType;
	}
	public void setPayType(String payType) {
		this.payType = payType;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
	//3.重写toString
	@Override
	public String toString() {
		return "Order [id=" + id + ", doorId=" + doorId + ", orderNo=" + orderNo + ", orderType=" + orderType
				+ ", pnum=" + pnum + ", cashier=" + cashier + ", orderTime=" + orderTime + ", payTime=" + payTime
				+ ", payType=" + payType + ", price=" + price + "]";
	}
}
