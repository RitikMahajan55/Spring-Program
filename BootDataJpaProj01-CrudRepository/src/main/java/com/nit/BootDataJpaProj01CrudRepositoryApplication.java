package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nit.entity.Doctor;
import com.nit.service.IDoctorService;


@SpringBootApplication
public class BootDataJpaProj01CrudRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootDataJpaProj01CrudRepositoryApplication.class, args);
		
		IDoctorService service = ctx.getBean("doctorService",IDoctorService.class);
	
		
	}

}
