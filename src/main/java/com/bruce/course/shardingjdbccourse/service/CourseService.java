package com.bruce.course.shardingjdbccourse.service;

import com.bruce.course.shardingjdbccourse.dto.CourseDTO;
import com.bruce.course.shardingjdbccourse.query.CourseQueryDTO;

import java.util.List;

public interface CourseService {
    boolean addCourse(long userId) ;

    boolean addCourse() ;

    List<CourseDTO> queryCourseList(CourseQueryDTO courseQueryDTO) ;
}
