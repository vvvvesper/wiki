package com.imooc.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${test.name}")
    String testName;

    @GetMapping("/hello")
    public String test(){
        return "hello world!" + testName;
    }
}
