package com.admin.service;

import java.util.List;

import com.admin.domain.UserModel;
import com.admin.dto.UserDto;

public interface UserService {
	
	public List<UserModel> getAllUserDtls();

	public UserDto getUserDtlsById(Integer id);

	public UserDto createUser(UserDto userDto);
}
