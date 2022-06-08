package com.qingmin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qingmin.gulimall.common.utils.PageUtils;
import com.qingmin.gulimall.product.entity.AttrGroupEntity;

import java.util.Map;

/**
 * 属性分组
 *
 * @author code-yang
 * @email sunlightcs@gmail.com
 * @date 2022-06-08 00:04:37
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

