package com.uzak.eureka.A1.api.controller;

import com.uzak.eureka.A1.inter.FeignTestService;
import com.uzak.eureka.A1.inter.param.BaseParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignTestController implements FeignTestService {
    @Override
    public String hello() {
        return "hello";
    }

    @Override
    public String hello(BaseParam param) {
        return "hello " + param.getName();
    }
}