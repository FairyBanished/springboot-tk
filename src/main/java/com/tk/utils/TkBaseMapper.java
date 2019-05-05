package com.tk.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

//基础通用mapper，不能被扫描
public interface TkBaseMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
