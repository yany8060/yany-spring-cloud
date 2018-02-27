package com.yany.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanyong on 2018/2/27.
 */
@RestController
public class ConfigClientController {

    @Value("${yany.hello}")
    private String hello;

    @RequestMapping("/hello")
    public String configTest(){
        return hello;
    }

}
