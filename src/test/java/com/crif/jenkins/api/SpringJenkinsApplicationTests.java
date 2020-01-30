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
		logger.info("test case executing as possible...");
		// 7) I just want to check whether the test case is executing or not
		assertEquals(true, true);
	}
	
	//10) Create a git repository in github and sink our project in git repository.
	//11)create a new repository.
	//12) copy the qualified name of you project and give some description
	//13) now go to the project workspace
   // 14)right click on git bash . or download the git bash.
	//15) Initialize the repository -> git init
	//16) check the status -> git status 
	//17) It is showing lot of files has not been commited.
	//18) ADD Them -> git add *
	//19) then commmit them with a message ->git commit -m "first commit"
    //20)then add the upstring then push ->git remote add origin https://github.com/sumitdhanade17/spring-jenkins.git
	//21) push changes to the repository -> git push -u origin master
	//22) come to the jenkins dashboard and we want to run the war.
	//23)After coming to jenkins dashboard.
	//24)lets create a new jobs
	//25) enter an item name as project name (spring-jenkins)
	//26)click on freestyle project then click ok.
	//27)we are sink our project jenkins in github 
	//28)add github link in jenkins in Github Project
}
