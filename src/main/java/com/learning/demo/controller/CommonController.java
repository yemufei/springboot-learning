package com.learning.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author: mufei
 * @date: 2022/9/8 10:18
 * @Description:
 */
@Controller
public class CommonController {


    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World";
    }


}
