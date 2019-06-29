package com.uzak.eureka.A1.inter;

import com.uzak.eureka.A1.inter.param.BaseParam;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@FeignClient("client-a1")
public interface FeignTestService {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    String hello();

    @PostMapping("/hello_param")
    String hello(@RequestBody BaseParam param);

}