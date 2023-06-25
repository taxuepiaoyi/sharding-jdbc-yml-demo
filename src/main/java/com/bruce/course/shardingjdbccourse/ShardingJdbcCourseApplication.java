package com.bruce.course.shardingjdbccourse;

import com.bruce.course.shardingjdbccourse.loadbalance.CanaryRuleConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bruce"})
@EnableFeignClients(basePackages = {"com.bruce"})
@LoadBalancerClient(value = "sharding-jdbc-customer", configuration = CanaryRuleConfiguration.class)
public class ShardingJdbcCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcCourseApplication.class, args);
    }

}
