package com.tk.service.impl;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.tk.mapper.ShippingInfoMapper;
import com.tk.model.ShippingInfo;
import com.tk.service.ShippingInfoService;

import lombok.extern.slf4j.Slf4j;
import tk.mybatis.mapper.entity.Example;
import tk.mybatis.mapper.entity.Example.Criteria;

@Service
@Slf4j
public class ShippingInfoServiceImpl implements ShippingInfoService {
	
	@Autowired
	ShippingInfoMapper shippingInfoMapper;

	@Override
	public int save(ShippingInfo info) {
		try {
			shippingInfoMapper.save(info);
			log.info("ShippingInfoService save() 成功：info->"+info);
		} catch (Exception e) {
			log.error("ShippingInfoService save() 失败：->"+e);
			return 0;
		}
		return 1;
	}

	@Override
	public int update(ShippingInfo info) {
		log.info("更新物流公司信息");
		Assert.notNull(info,"Object ShippingInfo can not be null !");
		Assert.notNull(info.getShipId(),"shipid can not be null !");
		return shippingInfoMapper.updateByPrimaryKey(info);
	}

	@Override
	public int delete(ShippingInfo info) {
		log.info("删除物流公司信息");
		Example example = new Example(ShippingInfo.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("ship_id",info.getShipId())
				.andEqualTo("ship_name",StringUtils.trimToNull(info.getShipName()))
				.andEqualTo("ship_contact",StringUtils.trimToNull(info.getShipContact()))
				.andEqualTo("telephone",StringUtils.trimToNull(info.getTelephone()))
				.andEqualTo("price",info.getPrice())
				.andEqualTo("modified_time",info.getModifiedTime());
		
		return shippingInfoMapper.deleteByExample(example);
	}

	@Override
	public List<ShippingInfo> queryByCondition(ShippingInfo info) {
		log.info("根据条件查询物流公司信息");
		Example example = new Example(ShippingInfo.class);
		Criteria criteria = example.createCriteria();
		criteria.andEqualTo("ship_id",info.getShipId())
				.andEqualTo("ship_name",StringUtils.trimToNull(info.getShipName()))
				.andEqualTo("ship_contact",StringUtils.trimToNull(info.getShipContact()))
				.andEqualTo("telephone",StringUtils.trimToNull(info.getTelephone()))
				.andEqualTo("price",info.getPrice())
				.andEqualTo("modified_time",info.getModifiedTime());
		
		return shippingInfoMapper.selectByExample(example);

	}

	@Override
	public ShippingInfo queryByshipId(Byte shipId) {
		log.info("根据shipId查询物流公司信息");
		return shippingInfoMapper.queryByshipId(shipId);
	}

	@Override
	public List<ShippingInfo> queryAll() {
		log.info("查询所有物流公司信息");
		return shippingInfoMapper.selectAll();
	}

	
}
