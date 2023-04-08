package com.admin.entityConveter;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;

import com.admin.domain.CompanyModel;
import com.admin.domain.UserModel;
import com.admin.dto.CompanyDto;
import com.admin.dto.UserDto;

public interface EntityConverter {

	public static final ModelMapper mapper = new ModelMapper();

	public static CompanyDto convertCompanyModelTODto(CompanyModel companyModel) {
		return mapper.map(companyModel, new TypeToken<CompanyDto>() {
		}.getType());

	}

	public static CompanyModel convertCompanyDtoToEntity(CompanyDto companyDto) {
		return mapper.map(companyDto, new TypeToken<CompanyModel>() {
		}.getType());

	}

	public static UserDto convertUserModelTODto(UserModel userModel) {
		return mapper.map(userModel, new TypeToken<UserDto>() {
		}.getType());

	}
	
	public static UserModel convertUserDtoToEntity(UserDto userDto) {
		return mapper.map(userDto, new TypeToken<UserModel>() {
		}.getType());

	}
}

