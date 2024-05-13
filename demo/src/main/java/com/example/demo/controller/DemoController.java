package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {
    
    @GetMapping("/hello")
    public String gethello(){
        return "hello world";
    }

    @GetMapping("/msg/{msg}")
    public String getMsg(@PathVariable String msg){
        return "msg is"+msg;
    }

}
