package com.bruce.course.shardingjdbccourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bruce"})
public class ShardingJdbcCourseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingJdbcCourseApplication.class, args);
    }

}
