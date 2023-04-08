package com.admin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admin.domain.UserModel;
import com.admin.dto.UserDto;
import com.admin.service.UserService;

@RestController
@RequestMapping("/user")
public class UserCtrl {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllUserDtls")
	public List<UserModel> getAllUserDtls(){	
		return userService.getAllUserDtls();
	}
	
	@GetMapping("/getUserDtlsById/{id}")
	public UserDto getUserDtlsById(@PathVariable Integer id){		
		return userService.getUserDtlsById(id);
	}
	
	@GetMapping("/createUser")
	public UserDto createUser(@RequestBody UserDto userDto){		
		return userService.createUser(userDto);
	}
	
	
	

}
