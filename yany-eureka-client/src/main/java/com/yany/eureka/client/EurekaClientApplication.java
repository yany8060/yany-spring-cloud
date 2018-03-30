package com.yany.eureka.client;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * Created by yanyong on 2018/2/8.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaClientApplication {
    private static Integer num = 0;


    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientApplication.class).web(true).run(args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/hi")
    public String hello() {
        return "hello world: " + port;
    }


    @RequestMapping(value = "/hystrixTest")
    public String hystrixTest() {
        num = num + 1;
        if (num % 2 == 0) {
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "hystrixTest: " + port + " num:" + num;
    }


}
