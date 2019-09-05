package com.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.iservice.HelloIService;

@Service
public class HelloService  implements HelloIService {

    @Override
    public String sayHello(){
       return "Hello~Dubbo";
    }

}
