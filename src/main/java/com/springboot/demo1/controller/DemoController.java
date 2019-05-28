package com.springboot.demo1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@RestController
public class DemoController {

    @RequestMapping(value = {"","index"})
    public String sayHi(){
        return "hello world hello";
    }



}
