package com.tk.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tk.bean.TkDemoData;
import com.tk.service.RpcService;

@RestController
@RequestMapping("/rpc")
public class RpcController extends BaseController {
	
	@Autowired
	private RpcService rpcService;
	
	@RequestMapping("/hello/{name}")
	public String getHello(@PathVariable("name") String name) {
		return rpcService.hello(name);
	}
	
	@RequestMapping("/getdemo")
	public TkDemoData getDemo(TkDemoData tkdata) {
		return rpcService.queryDemo(tkdata);
	}
	
	@RequestMapping("/demoall")
	public List<TkDemoData> getDemo() {
		return rpcService.queryDemoAll();
	}
	
}
