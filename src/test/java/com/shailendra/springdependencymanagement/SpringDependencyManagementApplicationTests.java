package com.shailendra.springdependencymanagement;

import com.shailendra.springdependencymanagement.controllers.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@SpringBootTest
@ActiveProfiles("prod")
class SpringDependencyManagementApplicationTests {
	@Autowired
	MyController myController;
	@Test
	void sayHello() {
		System.out.println(myController.sayHello());

	}

	@Test
	void getDatasource(){
		System.out.println(myController.getDatasource());
	}

}
