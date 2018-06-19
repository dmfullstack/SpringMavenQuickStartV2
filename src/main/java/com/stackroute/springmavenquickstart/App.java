package com.stackroute.springmavenquickstart;
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.stackroute.springmavenquickstart.config.AppConfig;
import com.stackroute.springmavenquickstart.service.HelloWorld;
 
public class App {
	public static void main(String[] args) {
	    
		//ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
	    HelloWorld obj = (HelloWorld) context.getBean("helloBean");
	    
	    obj.printHelloWorld("SpringMavenQuickStartv2 successfully runs");

	}
}