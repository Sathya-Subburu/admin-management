package com.admin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admin.domain.CompanyModel;
import com.admin.dto.CompanyDto;
import com.admin.entityConveter.EntityConverter;
import com.admin.repository.CompanyRepository;
import com.admin.service.CompanyService;


@Service
public class CompanyServiceImpl implements CompanyService {

	@Autowired
	private CompanyRepository companyRepository;

	@Override
	public List<CompanyModel> getAllCompanyDtls() {
		return companyRepository.findAll();
	}

	@Override
	public CompanyDto getCompanyDtlsById(Integer id) {

		CompanyDto dto = null;
		if (id != null) {
			CompanyModel model = companyRepository.findById(id).get();
			dto = EntityConverter.convertCompanyModelTODto(model);
		} else {
			// throw Exception
		}

		return dto;
	}

	@Override
	public CompanyDto createCompany(CompanyDto companyDto) {

		try {
			CompanyModel model = EntityConverter.convertCompanyDtoToEntity(companyDto);
			companyRepository.save(model);

		} catch (Exception ex) {

		}
		return null;
	}

}
