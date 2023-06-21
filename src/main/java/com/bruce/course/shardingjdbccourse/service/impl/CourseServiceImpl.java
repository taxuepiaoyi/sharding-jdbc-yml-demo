package com.bruce.course.shardingjdbccourse.service.impl;

import com.bruce.course.shardingjdbccourse.entity.Course;
import com.bruce.course.shardingjdbccourse.entity.UserEntity;
import com.bruce.course.shardingjdbccourse.mapper.CourseMapper;
import com.bruce.course.shardingjdbccourse.mapper.UserMapper;
import com.bruce.course.shardingjdbccourse.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Transactional
@Service
@Slf4j
public class CourseServiceImpl implements CourseService {


    @Resource
    private CourseMapper courseMapper ;

    @Resource
    private UserMapper userMapper ;

    @Override
    public boolean addCourse(long userId) {
        log.info("addCourse.....userId:{}",userId);
        List<Course> courseList = generateCourseList(userId) ;
        if(!CollectionUtils.isEmpty(courseList)){
            courseMapper.insertCourseList(courseList);
        }
        return true;
    }

    @Override
    public boolean addCourse() {
        log.info("addCourse all user........");
        List<UserEntity> userEntities = userMapper.queryAllUser() ;
        if(CollectionUtils.isEmpty(userEntities)){
            log.info("addCourse... userEntities is empty....");
            return true ;
        }
        List<Course> courseList = new ArrayList<>() ;
        for (UserEntity userEntity: userEntities) {
            courseList.addAll(this.generateCourseList(userEntity.getUserId())) ;
        }
        if(!CollectionUtils.isEmpty(courseList)){
            courseMapper.insertCourseList(courseList);
        }
        return true;
    }

    private List<Course> generateCourseList(long userId){
        List<String> courseNames = Arrays.asList("Java","JavaScript","phython","C","C++") ;
        List<Course> courseList = new ArrayList<>() ;
        for (String courseName:courseNames) {
            Course course = new Course();
            course.setCname(courseName);
            course.setUserId(userId);
            course.setCstatus("Normal");
            course.setCreatedTime(LocalDateTime.now());
            courseList.add(course) ;
        }
        return courseList ;
    }
}
