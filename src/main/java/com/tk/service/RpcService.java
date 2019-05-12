package com.tk.service;

import java.util.List;

import com.tk.bean.TkDemoData;

public interface RpcService {
	
	public String hello(String name);
	
	public TkDemoData queryDemo(TkDemoData tkdata);
	
	public List<TkDemoData> queryDemoAll();
	
}
