package com.learn.springcloud.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author jingjing.zhang
 */
@RequestMapping("API-USER-SERVER")
public interface UserService {
    @GetMapping("/findUser")
    User findUser(@RequestParam("name") String name);
}
