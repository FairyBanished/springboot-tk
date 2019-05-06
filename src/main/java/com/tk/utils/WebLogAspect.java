package com.tk.utils;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.aspectj.lang.Signature;
import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class WebLogAspect {
	
	@Pointcut("execution(public * com.tk.controller..*.*(..))")
    public void webLog(){}
	
	@Before("webLog()")
	public void doBefore(JoinPoint joinPoint){
		Signature signature = joinPoint.getSignature();
		log.info("请求调用："+signature.getDeclaringTypeName()+"-"+signature.getName()+"-"+joinPoint.getArgs());
	}
	
	/*@After("webLog()")
	public void doAfter(JoinPoint joinPoint){
		
	}*/
	
	@AfterReturning(value="webLog()",returning="result")
	public void doAfterReturning(JoinPoint joinPoint,Object result){
		Signature signature = joinPoint.getSignature();
		log.info("返回结果："+signature.getDeclaringTypeName()+"-"+signature.getName()+"-"+result);
	}
	
	@AfterThrowing(value="webLog()",throwing="exception")
	public void AfterThrowing(JoinPoint joinPoint,Throwable exception){
		Signature signature = joinPoint.getSignature();
		log.error("返回异常："+signature.getDeclaringTypeName()+"-"+signature.getName()+"-"+exception);
	}
	
	/*@Around("webLog()")
	public void doAround(ProceedingJoinPoint proceedingJoinPoint){
		
	}*/
	
}
