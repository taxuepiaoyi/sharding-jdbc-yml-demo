package com.bruce.course.shardingjdbccourse.controller;

import com.bruce.course.shardingjdbccourse.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
