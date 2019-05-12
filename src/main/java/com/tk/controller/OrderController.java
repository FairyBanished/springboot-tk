package com.tk.controller;

import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tk.model.DemoUser;
import com.tk.model.ShippingInfo;
import com.tk.service.OrderService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "订单接口 OrderController")
@RestController
@RequestMapping("/order")
public class OrderController extends BaseController {
	
	@Autowired
	OrderService orderService;
	
	
	@ApiOperation(value = "查询所有物流公司信息")
	@RequestMapping(value="/queryall", method = RequestMethod.GET)
	public List<ShippingInfo> queryAll() {
		return orderService.queryAll();
	}
	
	@RequestMapping(value="/get", method = RequestMethod.GET)
	public DemoUser get() {
		return new DemoUser("10001","鹿灵犀","123456",new Date(),"GMT");
	}
	
}
