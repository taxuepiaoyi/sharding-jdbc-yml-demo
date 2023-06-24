package com.bruce.course.shardingjdbccourse.feign;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "coupon-template" ,path = "/template")
public interface CustomerService {
}
