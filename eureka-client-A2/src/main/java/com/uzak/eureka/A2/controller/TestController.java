package com.uzak.eureka.A2.controller;

import com.uzak.eureka.A1.inter.FeignTestService;
import com.uzak.eureka.A1.inter.param.BaseParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private FeignTestService service;

    @GetMapping("/test")
    public String test(){
        return service.hello();
    }

    @GetMapping("/test_param")
    public String test_param(){
        BaseParam param = new BaseParam();
        param.setName("吴松远");
        return service.hello(param);
    }
}