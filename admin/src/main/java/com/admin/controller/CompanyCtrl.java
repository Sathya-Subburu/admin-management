package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.domain.CompanyModel;
import com.admin.dto.CompanyDto;
import com.admin.service.CompanyService;



@RestController
@RequestMapping("/company")
public class CompanyCtrl {

	@Autowired
	private CompanyService companyService;

	@GetMapping("/getAllCompanyDtls")
	public List<CompanyModel> getAllCompanyDtls() {
		return companyService.getAllCompanyDtls();
	}

	@GetMapping("/getCompanyDtlsById/{id}")
	public CompanyDto getCompanyDtlsById(@PathVariable Integer id) {
		return companyService.getCompanyDtlsById(id);
	}

	@PostMapping("/createCompany")
	public CompanyDto createCompany(@RequestBody CompanyDto Dto) {
		
		
		 return null;
		 
	}
	
}
