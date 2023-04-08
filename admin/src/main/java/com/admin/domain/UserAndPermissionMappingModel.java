package com.admin.domain;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Data
@Getter
@Setter
@Entity
@Table(name = "management_user_and_permission_mapping")
public class UserAndPermissionMappingModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;
	
//	@Column(name = "user_id")
//	private UserModel userId;
//	
//	@Column(name = "role_id")
//	private RoleModel roleId;
	
//	@Column(name = "permission_id")
//	private List<PermissionModel> permissionId;

}
