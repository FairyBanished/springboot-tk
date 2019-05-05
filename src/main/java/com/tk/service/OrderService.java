package com.tk.service;

import java.util.List;

import com.tk.model.ShippingInfo;

public interface OrderService {
	public int createShippingInfo(ShippingInfo info);
	public List<ShippingInfo> queryAll();
}
