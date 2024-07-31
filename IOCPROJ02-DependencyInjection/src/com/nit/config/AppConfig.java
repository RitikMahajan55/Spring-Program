package com.nit.config;

import java.time.LocalDate;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="com.nit.sbeans")
public class AppConfig {
    
//	AppConfig()
//	{
//		System.out.println("AppConfig.AppConfig()");
//	}
	
	@Bean(name = "xyz")
	public LocalDate createLDT() {
		//System.out.println("AppConfig.createLDT()");
		return LocalDate.now();
	}
}
