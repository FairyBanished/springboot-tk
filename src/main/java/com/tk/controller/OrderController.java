package com.tk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tk.model.ShippingInfo;
import com.tk.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {
	
	@Autowired
	OrderService orderService;
	
	@RequestMapping("/create")
	public ShippingInfo createOrder(ShippingInfo info) {
		int count = orderService.createShippingInfo(info);
		if(count==1) {
			return info;
		}
		return null;
	}
	
	@RequestMapping("/queryall")
	public List<ShippingInfo> queryAll() {
		return orderService.queryAll();
	}
	
}
