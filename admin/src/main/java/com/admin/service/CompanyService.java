package com.admin.service;

import java.util.List;

import com.admin.domain.CompanyModel;
import com.admin.dto.CompanyDto;

public interface CompanyService {
	
	public List<CompanyModel>getAllCompanyDtls();
	
	public CompanyDto getCompanyDtlsById(Integer id);
	
	public CompanyDto createCompany(CompanyDto companyDto);

}
