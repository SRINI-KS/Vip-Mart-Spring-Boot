package com.Vip.Mart.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Vip.Mart.Models.OrderDetailModel;
import com.Vip.Mart.Services.OrderService;

@RestController
@RequestMapping("order")
@CrossOrigin(origins = "http://localhost:4200/")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	@PostMapping("/placeOrder")
	public OrderDetailModel placeOrder(@RequestBody OrderDetailModel order) {
		return orderService.placeOrder(order);
	}
	
	@GetMapping("/getOrderList")
	public List<OrderDetailModel> getAllOrder() {
		return orderService.getAllOrder();
	}

}
