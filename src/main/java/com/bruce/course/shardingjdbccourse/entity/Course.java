package com.bruce.course.shardingjdbccourse.entity;

import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

/**
 * 课程实体类
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    /**
     * 课程Id
     */
    private Long cid ;

    /**
     * 课程名称
     */
    private String cname ;
    /**
     * 用户ID
     */
    private Long userId ;
    /**
     * 创建时间
     */
    private LocalDateTime createdTime ;
    /**
     * 课程状态
     */
    private String cstatus ;
}
