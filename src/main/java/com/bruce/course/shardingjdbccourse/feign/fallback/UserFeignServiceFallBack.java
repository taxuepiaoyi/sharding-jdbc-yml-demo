package com.bruce.course.shardingjdbccourse.feign.fallback;

import com.alibaba.fastjson.JSONObject;
import com.bruce.course.shardingjdbccourse.feign.UserFeignService;
import com.bruce.shardingjdbc.customer.dto.UserDTO;
import com.bruce.shardingjdbc.customer.query.UserQueryDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class UserFeignServiceFallBack implements UserFeignService {
    @Override
    public List<UserDTO> queryUserList(UserQueryDTO userQueryDTO) {
        log.info("queryUserList....userQueryDTO:{}", JSONObject.toJSONString(userQueryDTO));
        return null;
    }
}
