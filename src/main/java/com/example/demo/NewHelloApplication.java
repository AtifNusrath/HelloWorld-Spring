package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.demo.component.DemoBean;
import com.example.demo.component.EmployeeBean;
import com.example.demo.controller.HelloRestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@SpringBootApplication
public class NewHelloApplication {
    public static final Logger logger = LoggerFactory.getLogger(NewHelloApplication.class);


	public static void main(String[] args) {
		logger.debug("Hello from Bridgelabz");
    
        ApplicationContext context = SpringApplication.run(NewHelloApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);
        logger.info("Demo Bean = " + demoBean.toString());
        System.out.println(context.getBean(HelloRestController.class));
        logger.debug("Checking Context:{}", context.getBean(DemoBean.class));
        logger.debug("\n*** Example using @Autowire annotation on property***");
        EmployeeBean employeeBean = context.getBean(EmployeeBean.class);
        employeeBean.seteId(101);
        employeeBean.seteName("Mohammed");
        employeeBean.showEmployeeDetails();
	}

}
