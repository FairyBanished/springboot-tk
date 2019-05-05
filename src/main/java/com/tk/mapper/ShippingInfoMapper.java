package com.tk.mapper;

import org.apache.ibatis.annotations.Select;

import com.tk.model.ShippingInfo;
import com.tk.utils.TkBaseMapper;

public interface ShippingInfoMapper extends TkBaseMapper<ShippingInfo> {
	/**
	 * 新增操作，自己写sql，在ShippingInfoMapper.xml
	 * @param info
	 * @return ShippingInfo
	 */
	public void save(ShippingInfo info);
	
	/**
	 * 查询操作，使用注解 @Select
	 * @param info
	 * @return List<ShippingInfo>
	 * 
	 * 
	 * @Results(id = "ShippingInfoMap",value = {
            @Result(property = "shipId",column = "ship_id"),
            @Result(property = "shipName",column = "ship_name"),
            @Result(property = "shipContact",column = "ship_contact"),
            @Result(property = "telephone",column = "telephone"),
            @Result(property = "price",column = "price"),
            @Result(property = "modifiedTime",column = "modified_time")
    })
	 * 
	 */
	@Select("select * from shipping_info where ship_id = #{shipId}")
	public ShippingInfo queryByshipId(Byte shipId);
}