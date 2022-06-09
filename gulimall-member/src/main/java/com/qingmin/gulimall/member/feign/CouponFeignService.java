package com.qingmin.gulimall.member.feign;


import com.qingmin.gulimall.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

// 声明是调用接口，并且针对的是哪个微服务
@FeignClient("gulimall-coupon")
public interface CouponFeignService {

    // 写全服务请求
    @RequestMapping("/coupon/coupon/member")
    public R getCoupon();
}
