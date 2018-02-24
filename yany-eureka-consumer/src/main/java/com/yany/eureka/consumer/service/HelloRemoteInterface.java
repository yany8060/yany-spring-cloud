package com.yany.eureka.consumer.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yanyong on 2018/2/23.
 */
@Component
@FeignClient(name = "eureka-client")
public interface HelloRemoteInterface {

    @RequestMapping(value = "/hi")
    String hi();

}
