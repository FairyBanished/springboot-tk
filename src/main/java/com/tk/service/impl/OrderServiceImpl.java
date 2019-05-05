package com.tk.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tk.model.ShippingInfo;
import com.tk.service.OrderService;
import com.tk.service.ShippingInfoService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	ShippingInfoService shippingInfoService;
	
	@Override
	public int createShippingInfo(ShippingInfo info) {
		log.info("新建物流公司信息");
		return shippingInfoService.save(info);
	}

	@Override
	public List<ShippingInfo> queryAll() {
		return shippingInfoService.queryAll();
	}
	
}
