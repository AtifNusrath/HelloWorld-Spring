package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import com.example.demo.component.DemoBean;
import com.example.demo.controller.HelloRestController;


@SpringBootApplication
public class NewHelloApplication {

	public static void main(String[] args) {
		System.out.println("Hello from Bridgelabz ");
		ApplicationContext context = SpringApplication.run(NewHelloApplication.class, args);
        DemoBean demoBean = context.getBean(DemoBean.class);
        System.out.println("Demo Bean = " + demoBean.toString());
        System.out.println(context.getBean(HelloRestController.class));
	}

}
