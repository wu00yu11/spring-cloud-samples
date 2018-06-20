package com.learn.springcloud.eurekacomsumers;

import com.learn.springcloud.api.User;
import com.learn.springcloud.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @authori
 * @describe:
 * @create 2018-06-20 20:23
 **/
@RestController
@RequestMapping("/user")
public class UserController {
//    @Autowired
//    private UserServiceFeignClient userServiceFeignClient;
    @Autowired
    private UserService userService;
    @GetMapping("/findUser")
    public User findUser(String name){
        return userService.findUser(name);
    }

}
