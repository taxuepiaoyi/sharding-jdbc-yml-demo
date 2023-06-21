package com.bruce.course.shardingjdbccourse.controller;

import com.bruce.course.shardingjdbccourse.dto.CourseDTO;
import com.bruce.course.shardingjdbccourse.query.CourseQueryDTO;
import com.bruce.course.shardingjdbccourse.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
@Slf4j
public class CourserController {

    @Autowired
    private CourseService courseService ;

    @GetMapping("add")
    public boolean addCourse(@RequestParam("userId") long userId){
        return courseService.addCourse(userId) ;
    }

    @GetMapping("addAll")
    public boolean addAllUserCourse(){return courseService.addCourse();}

    @PostMapping("queryCourse")
    public List<CourseDTO> queryCourseList(@RequestBody CourseQueryDTO courseQueryDTO){
        return courseService.queryCourseList(courseQueryDTO) ;
    }
}
