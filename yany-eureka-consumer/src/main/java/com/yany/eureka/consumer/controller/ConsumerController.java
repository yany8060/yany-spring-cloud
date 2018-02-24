package com.yany.eureka.consumer.controller;

import com.yany.eureka.consumer.service.HelloRemoteInterface;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by yanyong on 2018/2/23.
 */
@RestController
public class ConsumerController {

    @Resource
    HelloRemoteInterface helloRemoteInterface;

    @RequestMapping("/hello")
    public String hello() {
        return helloRemoteInterface.hi();
    }

}
