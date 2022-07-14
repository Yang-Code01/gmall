package com.qingmin.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.qingmin.gulimall.common.utils.PageUtils;
import com.qingmin.gulimall.common.utils.Query;

import com.qingmin.gulimall.product.dao.CategoryDao;
import com.qingmin.gulimall.product.entity.CategoryEntity;
import com.qingmin.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    /**
     * 实现查询数据转为树形结构
     * @return
     */
    @Override
    public List<CategoryEntity> listWithTree() {
        // 1、查出所有的分类
        List<CategoryEntity> entities = baseMapper.selectList(null);

        // 2、组装成树形的父子结构

        // 先查出1级分类
        /**
         * 将查出的所有分类利用stream流去过滤筛选，选出符合条件的数据然后组成list的形式
         * 分别使用了Stream流中的 filter  collect
         */
//        List<CategoryEntity> level1Menus = entities.stream().filter((categoryEntity) -> {
//            return categoryEntity.getParentCid() == 0;
//        }).collect(Collectors.toList());

        List<CategoryEntity> level1Menus = entities.stream().filter((categoryEntity) -> {
            return categoryEntity.getParentCid() == 0;
        }).map(( menu ) -> {
            menu.setChildren(getChildrens(menu,entities));
            return menu;
        }).sorted((menu1,menu2) -> {
            return (menu1.getSort() != null ? 0 : menu1.getSort() ) - (menu2.getSort() != null ? 0 : menu2.getSort() );
        }).collect(Collectors.toList());


        return level1Menus;
    }

    /**
     *  递归查找所有菜单的子菜单
     * @param root 当前菜单
     * @param all 所有菜单
     * @return
     */
    private List<CategoryEntity> getChildrens(CategoryEntity root,List<CategoryEntity> all){
        List<CategoryEntity> children = all.stream().filter(categoryEntity -> {
            return categoryEntity.getParentCid() == root.getCatId();
        }).map(categoryEntity -> {
            // 找到子菜单
            categoryEntity.setChildren(getChildrens(categoryEntity,all));
            return categoryEntity;
        }).sorted((menu1,menu2) -> {
            // 菜单的排序
            return (menu1.getSort() != null ? 0 : menu1.getSort() ) - (menu2.getSort() != null ? 0 : menu2.getSort() );
        }).collect(Collectors.toList());

        return children;
    }

}