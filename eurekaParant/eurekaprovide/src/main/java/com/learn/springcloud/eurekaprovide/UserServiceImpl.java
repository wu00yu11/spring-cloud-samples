package com.learn.springcloud.eurekaprovide;

import com.learn.springcloud.api.User;
import com.learn.springcloud.api.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author
 * @describe:
 * @create 2018-06-20 20:01
 **/
@RestController
public class UserServiceImpl implements UserService {
    private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    public User findUser(@RequestParam("name") String name) {
        User user = new User();
        user.setName("san mu");
        logger.info(user.toString());
        return user;
    }

}
