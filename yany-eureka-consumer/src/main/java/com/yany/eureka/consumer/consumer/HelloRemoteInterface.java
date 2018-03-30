package com.yany.eureka.consumer.consumer;

import com.yany.eureka.consumer.common.RemoteHystrixFallBack;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yanyong on 2018/2/23.
 */
@FeignClient(name = "eureka-client", fallback = RemoteHystrixFallBack.class)
public interface HelloRemoteInterface {

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    String hi();


    @RequestMapping(method = RequestMethod.GET, value = "/hystrixTest")
    String hystrixTest();

}
