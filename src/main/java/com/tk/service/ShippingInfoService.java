package com.tk.service;

import java.util.List;

import com.tk.model.ShippingInfo;

public interface ShippingInfoService {
	/**
	 * 新增物流公司信息表记录
	 * @param info
	 * @return ShippingInfo
	 */
	public int save(ShippingInfo info);
	/**
	 * 修改物流公司信息表记录
	 * @param info
	 * @return int
	 */
	public int update(ShippingInfo info);
	/**
	 * 删除物流公司信息表记录
	 * @param info
	 * @return int
	 */
	public int delete(ShippingInfo info);
	/**
	 * 查询物流公司信息表记录
	 * @param info
	 * @return List<ShippingInfo>
	 */
	public List<ShippingInfo> queryByCondition(ShippingInfo info);
	
	/**
	 * 根据shipId查询
	 * @param shipId
	 * @return ShippingInfo
	 */
	public ShippingInfo queryByshipId(Byte shipId);
	
	/**
	 * 查询所有值
	 * @return List<ShippingInfo>
	 */
	public List<ShippingInfo> queryAll();
}
