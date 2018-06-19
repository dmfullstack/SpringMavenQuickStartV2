package com.stackroute.springmavenquickstart.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.stackroute.springmavenquickstart.service.HelloWorld;
import com.stackroute.springmavenquickstart.service.HelloWorldImpl;

@Configuration
public class AppConfig {
	
	@Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }
	
}