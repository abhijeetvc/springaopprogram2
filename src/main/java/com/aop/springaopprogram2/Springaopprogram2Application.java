package com.aop.springaopprogram2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication
public class Springaopprogram2Application {

	public static void main(String[] args) {
		SpringApplication.run(Springaopprogram2Application.class, args);
	}

}


//Terminology: Aspect, Advice, Joinpoint, Pointcut