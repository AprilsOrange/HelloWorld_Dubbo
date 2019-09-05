package com.consumer;

import com.iservice.HelloIService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/")
public class HelloController {
// @RestController=@Controller+@ResponseBody

@com.alibaba.dubbo.config.annotation.Reference
    private HelloIService helloiService;

    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(){

        return helloiService.sayHello();

    }
}
