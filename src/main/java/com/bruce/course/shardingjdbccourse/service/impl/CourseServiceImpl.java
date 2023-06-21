package com.bruce.course.shardingjdbccourse.service.impl;

import com.bruce.course.shardingjdbccourse.entity.Course;
import com.bruce.course.shardingjdbccourse.mapper.CourseMapper;
import com.bruce.course.shardingjdbccourse.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

@Transactional
@Service
@Slf4j
public class CourseServiceImpl implements CourseService {


    @Resource
    private CourseMapper courseMapper ;

    @Override
    public boolean addCourse(long userId) {
        log.info("addCourse.....userId:{}",userId);
        List<String> courseNames = Arrays.asList("Java","JavaScript","phython","C","C++") ;
        for (String courseName:courseNames) {
            Course course = new Course();
            course.setCname(courseName);
            course.setUserId(userId);
            course.setCstatus("Normal");
            course.setCreatedTime(LocalDateTime.now());
            courseMapper.addCourse(course);
        }
        return true;
    }
}
