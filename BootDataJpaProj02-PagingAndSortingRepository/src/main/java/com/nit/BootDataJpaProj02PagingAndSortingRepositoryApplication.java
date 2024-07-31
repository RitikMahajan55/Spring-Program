package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.service.IDoctorMgmtService;
import com.nit.service.IDoctorService;

@SpringBootApplication
public class BootDataJpaProj02PagingAndSortingRepositoryApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootDataJpaProj02PagingAndSortingRepositoryApplication.class, args);
		
		
		
	}

}
