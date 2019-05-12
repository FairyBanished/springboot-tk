package com.tk.utils;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class TkTranslator {
	
	/**
	 * 为单个目标对象赋值,源对象和目标对象的属性名称相同才能赋值
	 * 
	 * @param origin,源对象
	 * @param targetClazz,目标对象类名
	 * @return target,目标对象
	 */
	public static <I, O> O translate(I origin,Class<O> targetClazz) {
		if (origin == null || targetClazz == null) {
			log.error("origin or targetClazz can not be null !");
			throw new RuntimeException("translate error: origin or targetClazz can not be null !");
		}
		
		try {
			O target = targetClazz.newInstance();
			BeanUtils.copyProperties(origin, target);
			return target;
		} catch (Exception e) {
			log.error("复制对象值出错：", e);
			throw new RuntimeException("复制对象值出错：", e);
		}
	}
	
	
	/**
	 * 为多个目标对象赋值,源对象和目标对象的属性名称相同才能赋值
	 * @param origin,源数据的集合
	 * @param targetClazz,目标数据对象的类名
	 * @return target,目标数的据集合
	 */
	public static <I, O> List<O> translate(List<I> origin,Class<O> targetClazz) {
		if (origin == null || targetClazz == null) {
			log.error("origin or targetClazz can not be null !");
			throw new RuntimeException("translate error: origin or targetClazz can not be null !");
		}
		
		if(origin.size()==0) {
			log.error("origin size can not be null !");
			throw new RuntimeException("origin size can not be null !");
		}
		
		List<O> target = new ArrayList<>();
		
		origin.forEach(item -> {
			try {
				O instance = targetClazz.newInstance();
				BeanUtils.copyProperties(item, instance);
				target.add(instance);
			} catch (Exception e) {
				log.error("复制对象程序出错：", e);
				throw new RuntimeException("复制对象程序出错：", e);
			}
		});

		return target;
	}
	
	
}
