package com.Vip.Mart.Services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Vip.Mart.Models.OrderDetailModel;
import com.Vip.Mart.Repositorys.OrderDao;
@Service
public class OrderService {
	@Autowired
    private OrderDao orderDao;
	public OrderDetailModel placeOrder(OrderDetailModel order) {
		return this.orderDao.save(order);
	}
	public List<OrderDetailModel> getAllOrder() {
		return orderDao.findAll();
	}
	
	

}
