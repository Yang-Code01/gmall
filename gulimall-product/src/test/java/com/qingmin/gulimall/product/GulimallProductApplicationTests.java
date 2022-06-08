package com.qingmin.gulimall.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qingmin.gulimall.product.entity.BrandEntity;
import com.qingmin.gulimall.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class GulimallProductApplicationTests {

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

//        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setDescript("xiaomi");
//
//        brandService.save(brandEntity);
//        System.out.println("save success");

        List<BrandEntity> brand_id = brandService.list(new QueryWrapper<BrandEntity>().eq("brand_id", 1L));
        brand_id.forEach((item) ->{
            System.out.println(item);
        });


    }

}
