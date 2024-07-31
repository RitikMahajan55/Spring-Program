package com.nit.service;

import org.springframework.data.domain.Page;

import com.nit.entity.Doctor;

public interface IDoctorMgmtService {
    public Page<Doctor>showDoctorsInfoByPageNo(int pageNo, int PageSize,boolean ascOrder, String props);

}
