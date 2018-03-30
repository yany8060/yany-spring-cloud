package com.yany.eureka.consumer.common;

import com.yany.eureka.consumer.consumer.HelloRemoteInterface;
import org.springframework.stereotype.Component;

/**
 * Created by yanyong on 2018/3/16.
 */
@Component
public class RemoteHystrixFallBack implements HelloRemoteInterface {
    @Override
    public String hi() {
        return "hi fail";
    }

    @Override
    public String hystrixTest() {
        return "hystrixTest fail";
    }
}
