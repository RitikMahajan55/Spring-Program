package com.nit.runners;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nit.entity.Doctor;
import com.nit.service.IDoctorService;

@Component
public class CrudRepoTestRunner implements CommandLineRunner{

	@Autowired
	private IDoctorService doct;

	@Override
	public void run(String... args) throws Exception {
		Doctor d  = new Doctor();
		d.setDocid(1);
		d.setDocName(" pqr");
		d.setSpecialization("general practitioner");
		d.setIncome(15000d);
		String registerDoctor = doct.registerDoctor(d);
		System.out.println(registerDoctor);
		
//		Doctor d1 = new Doctor();
//		d1.setDocid(2);
//		d1.setDocName("xyz");
//		d1.setSpecialization("Genral");
//		d1.setIncome(9000d);
//		
//		List<Doctor> list = List.of(d1);
//    	try {
//			String registerAllDoctors = doct.registerAllDoctors(list);
//			System.out.println(registerAllDoctors);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//			long fetchDoctorsCount = doct.fetchDoctorsCount();
//			System.out.println("Counts of record::"+fetchDoctorsCount);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		try {
//		boolean checkDoctorAvailbility = doct.checkDoctorAvailbility(352);
//		System.out.println("1 id doctor exists ?::"+(doct.checkDoctorAvailbility(352)?"available":"not available" ));
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
		// try {
			// Iterable<Doctor> it = doctorMgmtServiceImpl.showAllDoctors();
			// it.forEach(doc->{
			// System.out.println(doc);
			// });
			// System.out.println("-------------");
			//
			// } catch (Exception e) {
			// // TODO: handle exception
			// e.printStackTrace();
			// }
//			
//		try {
//			Doctor doctor = doct.showDoctorById(2);
//			System.out.println(doctor);
//			
//		}
//		catch(Exception e) {
//			System.out.println(e.getMessage());
//		}
//		
//		try {
//			Doctor doc = new Doctor();
//			doc.setDocid(3);
//			doc.setDocName("Dr.Yash Patil");
//			doc.setIncome(10000.0);
//			doc.setSpecialization("Genral practitioner");
//			System.out.println(doct.registerOrUpdateDoctor(doc));
//			
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		
//		try {
//			System.out.println(doct.deleteDoctorById(5));
//		}
//		catch(Exception e){
//			e.printStackTrace();
//		}
		
//		try {
//			Doctor doctor = new Doctor();
//			doctor.setDocid(3);
//			doctor.setDocName("Dr. Yash Patil");
//			System.out.println(doct.deleteDoctor(doctor));
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			System.out.println(doct.removeAllDoctors());
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
    	
//    	try {
//    		System.out.println(doct.removeDoctorsByIds(List.of(1,2)));
//    	}
//    	catch(Exception e) {
//    		e.printStackTrace();
//    	}
	}	
}
