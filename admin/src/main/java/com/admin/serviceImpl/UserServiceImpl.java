package com.admin.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.admin.domain.UserModel;
import com.admin.dto.UserDto;
import com.admin.entityConveter.EntityConverter;
import com.admin.repository.UserRepository;
import com.admin.service.UserService;

@Component
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<UserModel> getAllUserDtls() {
		return userRepository.findAll();
	}

	@Override
	public UserDto getUserDtlsById(Integer id) {
		UserModel model = userRepository.findById(id).get();
		return EntityConverter.convertUserModelTODto(model);
	}

	@Override
	public UserDto createUser(UserDto userDto) {
		
		try {

			UserModel userModel = EntityConverter.convertUserDtoToEntity(userDto);
			userRepository.save(userModel);

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		return null;
	}

}
