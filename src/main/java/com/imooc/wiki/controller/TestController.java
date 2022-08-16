package com.imooc.wiki.controller;

import com.imooc.wiki.domain.Student;
import com.imooc.wiki.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {

    @Value("${test.name}")
    String testName;

    @Autowired
    private StudentService studentService;

    @GetMapping("/hello")
    public String test(){
        return "hello world!" + testName;
    }

    @GetMapping("/student/info")
    public List<Student> search(){
        return studentService.search();
    }
}
