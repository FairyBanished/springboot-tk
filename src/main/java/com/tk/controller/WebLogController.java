package com.tk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@Api(tags = "aop 测试接口  WebLogController")
@RestController
@RequestMapping("/aop")
public class WebLogController extends BaseController {
	
	@ApiOperation(value = "AfterThrowing",response =String.class)
	@RequestMapping(value="/throw", method = RequestMethod.GET)
	public String exceptionReturn() {
		throw new NullPointerException();
	}
	
	@ApiOperation(value = "AfterReturning",response =String.class)
	@ApiParam(required = true, name = "content", value = "任意内容")
	@RequestMapping(value="/return", method = RequestMethod.GET)
	public String normalReturn(String content){
		return content;
	}
	
}
