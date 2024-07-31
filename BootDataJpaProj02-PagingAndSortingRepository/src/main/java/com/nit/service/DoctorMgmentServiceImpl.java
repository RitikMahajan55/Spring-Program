package com.nit.service;

import java.awt.print.Pageable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.nit.Repository.IDoctorRepository;
import com.nit.entity.Doctor;

@Service("DoctorService")
public class DoctorMgmentServiceImpl implements IDoctorMgmtService{

	@Autowired
	private IDoctorRepository doctorRepo;
	
	

	@Override
	public Page<Doctor> showDoctorsInfoByPageNo(int pageNo, int PageSize, boolean ascOrder, String props) {
		Sort sort = Sort.by(ascOrder ? Direction.ASC : Direction.DESC,props);
		
		PageRequest pageable = PageRequest.of(pageNo, PageSize,sort);
		
		Page<Doctor> page = doctorRepo.findAll(pageable);
		return page;
	}
     
}
