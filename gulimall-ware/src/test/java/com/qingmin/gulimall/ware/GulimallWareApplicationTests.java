package com.qingmin.gulimall.ware;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.qingmin.gulimall.ware.service.WareInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GulimallWareApplicationTests {

    @Autowired
    WareInfoService wareInfoService;

    @Test
    void contextLoads() {
        int count = wareInfoService.count();
        System.out.println("count = " + count);
    }

}
