package com.qingmin.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


/**
 * 1、整合Mybatis-plus
 *   引入依赖
 *   配置
 *    1、 配置数据源
 *          数据库驱动
 *          application.yml里配置数据源
 *       配置mybatisplus 扫描
 *        使用@MapperScan Mapper位置
 *        xml位置映射文件位置
 *
 *
 *
 */
@SpringBootApplication
@MapperScan("com.qingmin.gulimall.product.dao")
@EnableDiscoveryClient
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
