package com.bruce.course.shardingjdbccourse.query;

import groovy.transform.builder.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 课程查询条件 DTO
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CourseQueryDTO implements Serializable {

    /**
     * 课程名称
     */
    private String cname ;
    /**
     * 用户ID
     */
    private Long userId ;
}
