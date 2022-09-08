package com.learning.demo;

import com.learning.demo.config.MyConfig;
import com.learning.demo.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringbootLearningApplicationTests {

	@Test
	void contextLoads() {
		AnnotationConfigApplicationContext applicationContext=new AnnotationConfigApplicationContext(MyConfig.class);
		UserService userService=(UserService) applicationContext.getBean("userService");
		userService.yelling();
	}

}
