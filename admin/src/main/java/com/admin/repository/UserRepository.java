package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.admin.domain.UserModel;

public interface UserRepository extends JpaRepository<UserModel, Integer> {

}
