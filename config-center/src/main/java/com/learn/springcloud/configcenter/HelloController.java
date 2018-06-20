package com.learn.springcloud.configcenter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @describe:
 * @create 2018-06-20 14:56
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Value("${server.port}")
    private String welcomeWords;

    @GetMapping("/index")
    public String index(){
        return  welcomeWords;
    }
}
