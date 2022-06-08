package com.qingmin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qingmin.gulimall.common.utils.PageUtils;
import com.qingmin.gulimall.product.entity.AttrAttrgroupRelationEntity;

import java.util.Map;

/**
 * 属性&属性分组关联
 *
 * @author code-yang
 * @email sunlightcs@gmail.com
 * @date 2022-06-08 00:04:37
 */
public interface AttrAttrgroupRelationService extends IService<AttrAttrgroupRelationEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

