package com.qingmin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qingmin.gulimall.common.utils.PageUtils;
import com.qingmin.gulimall.product.entity.CategoryEntity;

import java.util.List;
import java.util.Map;

/**
 * 商品三级分类
 *
 * @author code-yang
 * @email sunlightcs@gmail.com
 * @date 2022-06-08 00:04:37
 */
public interface CategoryService extends IService<CategoryEntity> {

    PageUtils queryPage(Map<String, Object> params);


    List<CategoryEntity> listWithTree();
}

