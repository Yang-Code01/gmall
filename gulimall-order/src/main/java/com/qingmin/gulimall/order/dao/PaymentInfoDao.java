package com.qingmin.gulimall.order.dao;

import com.qingmin.gulimall.order.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author code-yang
 * @email sunlightcs@gmail.com
 * @date 2022-06-08 14:18:35
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
