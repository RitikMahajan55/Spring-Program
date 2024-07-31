package com.nit.service;

import java.util.List;

import com.nit.entity.Doctor;

public interface IDoctorService {
     public String registerDoctor(Doctor doctor);
     
     public String registerAllDoctors(List<Doctor> list);
 
     public long fetchDoctorsCount();
     
     public boolean checkDoctorAvailbility(Integer id);
     
     public Iterable <Doctor> showAllDoctor();
     
     public Iterable <Doctor> showAllDoctorsByIds(Iterable<Integer> ids);
     
     public Doctor showDoctorById(Integer id);
     
     public String registerOrUpdateDoctor(Doctor doctor);
	
     public String deleteDoctorById(Integer id);
     
     public String deleteDoctor(Doctor doctor);
     
     public String removeAllDoctors();
     
     public String removeDoctorsByIds(Iterable<Integer> ids);
     
}
