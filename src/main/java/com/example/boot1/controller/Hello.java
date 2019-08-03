package com.example.boot1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController //相当于@Controller和 @ResponseBody
public class Hello {
//    @Value("${person.name}")
    private String name;
    @GetMapping("hello")//相当于@RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String hello(){
        return "hello!!!!"+name;
    }
}
