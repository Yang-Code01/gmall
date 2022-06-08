package com.qingmin.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.qingmin.gulimall.common.utils.PageUtils;
import com.qingmin.gulimall.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author code-yang
 * @email sunlightcs@gmail.com
 * @date 2022-06-08 00:04:37
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

