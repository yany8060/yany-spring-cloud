package com.yany.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by yanyong on 2018/2/8.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientApplication.class).web(true).run(args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hello(){
        return "hello world: "+port;
    }


}
