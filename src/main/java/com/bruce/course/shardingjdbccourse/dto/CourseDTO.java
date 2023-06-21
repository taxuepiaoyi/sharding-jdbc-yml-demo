package com.bruce.course.shardingjdbccourse.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CourseDTO implements Serializable {

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
     * 课程开始月份
     */
    private Integer startMonth ;
    /**
     * 创建时间
     */
    private LocalDateTime createdTime ;
    /**
     * 课程状态
     */
    private String cstatus ;
}
