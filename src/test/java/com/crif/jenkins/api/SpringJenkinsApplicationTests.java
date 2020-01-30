package com.crif.jenkins.api;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

//6) we have to test whether the test process is automated with the help of the jenkins
@SpringBootTest
class SpringJenkinsApplicationTests {
//8 Add the logger statement here also
	public static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);

	@Test
	void contextLoads() {
		// 9
		logger.info("test case executing...");
		// 7) I just want to check whether the test case is executing or not
		assertEquals(true, true);
	}

}
