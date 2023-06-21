package com.bruce.course.shardingjdbccourse.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.bruce.course.shardingjdbccourse.dto.CourseDTO;
import com.bruce.course.shardingjdbccourse.entity.Course;
import com.bruce.course.shardingjdbccourse.entity.UserEntity;
import com.bruce.course.shardingjdbccourse.mapper.CourseMapper;
import com.bruce.course.shardingjdbccourse.mapper.UserMapper;
import com.bruce.course.shardingjdbccourse.query.CourseQueryDTO;
import com.bruce.course.shardingjdbccourse.service.CourseService;
import com.fasterxml.jackson.databind.util.BeanUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.collections4.ListUtils;
import org.springframework.beans.BeanUtils;
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
        log.info("addCourse.....userId:{}.....tableIndex:{}",userId, userId % 2 + 1);
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

    @Override
    public List<CourseDTO> queryCourseList(CourseQueryDTO courseQueryDTO) {
        log.info("queryCourseList.....courseQueryDTO = [{}]" , JSONObject.toJSONString(courseQueryDTO)) ;
        if(courseQueryDTO == null){
            return null ;
        }
        List<Course> courseList = courseMapper.queryCourse(courseQueryDTO) ;
        if(CollectionUtils.isEmpty(courseList)){
            log.info("queryCourseList.....courseList...is empty.");
            return null ;
        }
        List<CourseDTO> courseDTOList = new ArrayList<>() ;
        for (Course course: courseList) {
            CourseDTO courseDTO = CourseDTO.builder().build();
            BeanUtils.copyProperties(course,courseDTO);
            courseDTOList.add(courseDTO) ;
        }
        return courseDTOList ;
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
