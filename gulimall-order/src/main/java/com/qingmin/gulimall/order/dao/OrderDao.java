package com.qingmin.gulimall.order.dao;

import com.qingmin.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author code-yang
 * @email sunlightcs@gmail.com
 * @date 2022-06-08 14:18:35
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
