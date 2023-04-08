package com.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.domain.CompanyModel;

@Repository
public interface CompanyRepository extends JpaRepository<CompanyModel, Integer> {	

}
