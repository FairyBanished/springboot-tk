package com.tk;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.tk.model.ShippingInfo;
import com.tk.service.ShippingInfoService;
import com.tk.utils.TkBaseMapper;

import tk.mybatis.spring.annotation.MapperScan;

@RunWith(SpringRunner.class)
@MapperScan(basePackages = "com.tk.mapper", markerInterface = TkBaseMapper.class)
@SpringBootTest
public class SpringbootTkApplicationTests {
	
	@Autowired
	ShippingInfoService shippingInfoService;

	@Test
	public void contextLoads() {
	}
	
	@Test
	public void ShippingInfoServiceTest() {
		System.out.println("-----ShippingInfoServiceTest() 测试开始- - - - -");
		/*ShippingInfo info = new ShippingInfo();
		info.setShipId((byte) 101);
		info.setShipName("顺丰快递");
		info.setShipContact("张三");
		info.setTelephone("18812345678");
		info.setPrice(new BigDecimal(1000));
		info.setModifiedTime(new Date());
		shippingInfoService.save(info);*/
		
		ShippingInfo result = shippingInfoService.queryByshipId((byte) 102);
		System.out.println("--------------:result->"+result);
		System.out.println("-----ShippingInfoServiceTest() 测试结束- - - - -");
	}

}
