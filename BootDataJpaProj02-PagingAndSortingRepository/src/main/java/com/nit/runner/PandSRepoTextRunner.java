package com.nit.runner;

import java.security.Provider.Service;

import org.springframework.boot.CommandLineRunner;
import org.springframework.data.domain.Page;

import com.nit.entity.Doctor;

public class PandSRepoTextRunner implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		try {
			Page<Doctor> page = ServiceDoct.showDoctorsInfoByPageNo(2,3,false,"docName");
			
		}
	}

	

	

	

	
	
	
	
}
