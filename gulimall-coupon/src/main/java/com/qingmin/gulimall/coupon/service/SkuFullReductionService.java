package com.qingmin.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qingmin.gulimall.common.utils.PageUtils;
import com.qingmin.gulimall.coupon.entity.SkuFullReductionEntity;

import java.util.Map;

/**
 * 商品满减信息
 *
 * @author code-yang
 * @email sunlightcs@gmail.com
 * @date 2022-06-08 15:02:30
 */
public interface SkuFullReductionService extends IService<SkuFullReductionEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

