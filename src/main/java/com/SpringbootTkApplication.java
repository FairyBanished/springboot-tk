package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tk.utils.TkBaseMapper;

import tk.mybatis.spring.annotation.MapperScan;

@MapperScan(basePackages = "com.tk.mapper", markerInterface = TkBaseMapper.class)
@SpringBootApplication
public class SpringbootTkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTkApplication.class, args);
	}

}
