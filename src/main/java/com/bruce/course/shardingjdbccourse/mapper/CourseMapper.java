package com.bruce.course.shardingjdbccourse.mapper;

import com.bruce.course.shardingjdbccourse.entity.Course;
import com.bruce.course.shardingjdbccourse.query.CourseQueryDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface CourseMapper {
    void addCourse(@Param("course")Course course) ;

    void insertCourseList(@Param("courseList")List<Course> courseList) ;

    List<Course> queryCourse(@Param("courseQueryDTO")CourseQueryDTO courseQueryDTO) ;
}
