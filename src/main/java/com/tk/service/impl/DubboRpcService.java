package com.tk.service.impl;

import java.util.List;



import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;
import com.fairy.rpc.api.DemoRpcService;
import com.fairy.rpc.api.bean.DemoData;
import com.fairy.rpc.api.request.DemoRpcRequest;
import com.fairy.rpc.api.response.DemoRpcResponse;
import com.tk.bean.TkDemoData;
import com.tk.service.RpcService;
import com.tk.utils.TkTranslator;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class DubboRpcService implements RpcService {
	
	@Reference(interfaceClass=DemoRpcService.class,check=false)
	DemoRpcService demoRpcService;

	@Override
	public String hello(String name) {
		log.info("----------进入 hello {}---------");
		return demoRpcService.hello(name);
	}

	@Override
	public TkDemoData queryDemo(TkDemoData tkdata) {
		log.info("----------进入 queryDemo {}---------");
		DemoRpcRequest request = new DemoRpcRequest();
		DemoData data = TkTranslator.translate(tkdata,DemoData.class);
		request.setData(data);
		DemoRpcResponse response = demoRpcService.queryDemo(request);
		if("000000".equals(response.getErrorCode())) {
			 return TkTranslator.translate(response.getDatas().get(0),TkDemoData.class);
		}else {
			log.error("queryDemo rpc 调用失败！");
			throw new RuntimeException("queryDemo rpc 调用失败！");
		}
	}

	@Override
	public List<TkDemoData> queryDemoAll() {
		log.info("----------进入 queryDemoAll {}---------");
		DemoRpcResponse response = demoRpcService.queryDemoAll();
		if("000000".equals(response.getErrorCode())) {
			 return TkTranslator.translate(response.getDatas(),TkDemoData.class);
		}else {
			log.error("queryDemoAll rpc 调用失败！");
			throw new RuntimeException("queryDemoAll rpc 调用失败！");
		}
	}
	
	
	
}
