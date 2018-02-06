package com.mycompany.emailservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@ContextConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(classes = EmailServiceApplicationTests.class)
public class EmailServiceApplicationTests {

	@Test
	public void contextLoads() {
	}

}
