package com.admin.dto;

import java.util.Date;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@NoArgsConstructor
@ToString
public class CompanyDto {
	
	private Integer id;
	private String companyName;
	private String owner;
	private boolean isDeletedFlag;
	private String createdBy;
	private String updatedBy;
	private Date createdDate;
	private Date updatedDate;
	

}
