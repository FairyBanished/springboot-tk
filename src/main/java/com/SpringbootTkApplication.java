package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tk.utils.TkBaseMapper;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import tk.mybatis.spring.annotation.MapperScan;

@EnableSwagger2
@MapperScan(basePackages = "com.tk.mapper", markerInterface = TkBaseMapper.class)
@SpringBootApplication
public class SpringbootTkApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTkApplication.class, args);
	}

}
