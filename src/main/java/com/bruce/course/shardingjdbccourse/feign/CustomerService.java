package com.bruce.course.shardingjdbccourse.feign;

import com.bruce.course.shardingjdbccourse.feign.fallback.CustomerServiceFallBack;
import com.bruce.shardingjdbc.customer.dto.UserDTO;
import com.bruce.shardingjdbc.customer.query.UserQueryDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@FeignClient(value = "sharding-jdbc-customer" ,path = "/user",fallbackFactory = CustomerServiceFallBack.class)
public interface CustomerService {

    @PostMapping("list")
    List<UserDTO> queryUserList(@RequestBody UserQueryDTO userQueryDTO) ;
}
