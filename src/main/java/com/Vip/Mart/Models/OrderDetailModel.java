package com.Vip.Mart.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "OrderDetails")
public class OrderDetailModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;
	private Long orderUserId;
	private String orderUserName;
	private String orderUserAddress;
	private Long orderUserContactNumber;
	private Long orderUserAlternateNumber;
	private String orderStatus;
	private Double orderAmount;
	private Long orderProductId;
	
	   
	public Long getOrderId() {
		return orderId;
	}
	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}
	public Long getOrderUserId() {
		return orderUserId;
	}
	public void setOrderUserId(Long orderUserId) {
		this.orderUserId = orderUserId;
	}
	public String getOrderUserName() {
		return orderUserName;
	}
	public void setOrderUserName(String orderUserName) {
		this.orderUserName = orderUserName;
	}
	public String getOrderUserAddress() {
		return orderUserAddress;
	}
	public void setOrderUserAddress(String orderUserAddress) {
		this.orderUserAddress = orderUserAddress;
	}
	public Long getOrderUserContactNumber() {
		return orderUserContactNumber;
	}
	public void setOrderUserContactNumber(Long orderUserContactNumber) {
		this.orderUserContactNumber = orderUserContactNumber;
	}
	public Long getOrderUserAlternateNumber() {
		return orderUserAlternateNumber;
	}
	public void setOrderUserAlternateNumber(Long orderUserAlternateNumber) {
		this.orderUserAlternateNumber = orderUserAlternateNumber;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(Double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public Long getOrderProductId() {
		return orderProductId;
	}
	public void setOrderProductId(Long orderProductId) {
		this.orderProductId = orderProductId;
	}
	
	
	

}
