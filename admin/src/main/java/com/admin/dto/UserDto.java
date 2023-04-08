package com.admin.dto;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
@NoArgsConstructor
public class UserDto {

	private Integer id;
	private String userName;
	private String address;
	private String destination;
	private String emialId;
	private String mobileNumber;
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	private Date updatedDate;

}
