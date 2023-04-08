package com.admin.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "management_master_user")
public class UserModel {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "userName")
	private String userName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "destination")
	private String destination;
	
	@Column(name = "email_id")
	private String emialId;
	
	@Column(name = "mobile_number")
	private String mobileNumber;
	
	@Column(name = "created_by")
	private String createdBy;
	
	@Column(name = "updated_by")
	private String updatedBy;
	
	@Column(name = "created_date")
	private Date createdDate;
	
	@Column(name = "updated_date")
	private Date updatedDate;
	
}
