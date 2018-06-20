package com.learn.springcloud.eurekacomsumers;

import com.learn.springcloud.api.UserService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author jingjing.zhang
 */
@FeignClient(value = "user-service-provider")
public interface UserServiceFeignClient extends UserService {
}
