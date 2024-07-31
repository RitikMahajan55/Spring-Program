package com.nit.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.entity.Doctor;
import com.nit.repository.IDoctorRepo;

@Service("doctorService")
public class  DoctorMgmtServiceImpl implements IDoctorService{
	
    @Autowired
    private IDoctorRepo doctorRepo;
    
	@Override
	public String registerDoctor(Doctor doctor) {
		
		System.out.println("doc id(before save::)"+doctor.getDocid());
		Doctor doc = doctorRepo.save(doctor);
		return "Doctor obj is saved with id values:"+doc.getDocid();
	}

	@Override
	public String registerAllDoctors(List<Doctor> list) {
		
		Iterable<Doctor> saveAll = doctorRepo.saveAll(list);
		return list.size()+"Patients are saved";
	}

	
	

	@Override
	public boolean checkDoctorAvailbility(Integer id) {
		return doctorRepo.existsById(id); 
			
	}

	@Override
	public Iterable<Doctor> showAllDoctor() {
		return doctorRepo.findAll();

	}

	@Override
	public Iterable<Doctor> showAllDoctorsByIds(Iterable<Integer> ids) {
		return doctorRepo.findAllById(ids);
	}

	@Override
	public long fetchDoctorsCount() {
		return doctorRepo.count();
	}

	@Override
	public Doctor showDoctorById(Integer id) {
		Doctor dutyDoctor = new Doctor();
		dutyDoctor.setSpecialization("duty Doctor");
		
		Doctor doctor = doctorRepo.findById(id).orElse(dutyDoctor);
		return doctor;
	}

	@Override
	public String registerOrUpdateDoctor(Doctor doctor) {
		Optional<Doctor> opt = doctorRepo.findById(doctor.getDocid());
		if(opt.isPresent()) {
			doctorRepo.save(doctor);
		   return doctor.getDocid()+"Doctor details are found and updated";
		}
		else {
			return "Doctor is saved with id value :"+doctorRepo.save(doctor).getDocid();
		}
	}

	@Override
	public String deleteDoctorById(Integer id) {
		Optional<Doctor> opt = doctorRepo.findById(id);
		if(opt.isPresent()) {
			doctorRepo.deleteById(id);
			return id+"doctor is Deleted";
		}
		else {
			return id+"Doctor not Found for Deletion";
		}
	}

	@Override
	public String deleteDoctor(Doctor doctor) {
		Optional<Doctor> opt = doctorRepo.findById(doctor.getDocid());
		if(opt.isEmpty()) {
			return doctor.getDocid()+"Doctor is not Found";
		}
		else {
			doctorRepo.delete(opt.get());
			return doctor.getDocid()+"Doctor found and deleted";
		}
	}

	//@Override
	public String removeAllDoctors() {
		long count = doctorRepo.count();
		if(count>0) {
			doctorRepo.deleteAll();
			return count+"no of records are deleted";
		}
		return " no records found are deleted";
	}

	@Override
	public String removeDoctorsByIds(Iterable<Integer> ids) {
		List<Doctor> list =(List<Doctor>) doctorRepo.findAllById(ids);
		doctorRepo.deleteAllById(ids);
		return list.size()+" no.of records are deleted";
	}


}
