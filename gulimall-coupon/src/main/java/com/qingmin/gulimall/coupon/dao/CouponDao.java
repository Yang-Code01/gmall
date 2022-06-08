package com.qingmin.gulimall.coupon.dao;

import com.qingmin.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author code-yang
 * @email sunlightcs@gmail.com
 * @date 2022-06-08 15:02:30
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
