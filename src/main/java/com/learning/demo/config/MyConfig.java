package com.learning.demo.config;

import com.learning.demo.service.UserService;
import com.learning.demo.service.UserServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author: mufei
 * @date: 2022/9/8 09:57
 * @Description:
 */
@Configuration
public class MyConfig {

    @Bean
    public UserService userService(){
        return new UserServiceImpl();
    }
}
