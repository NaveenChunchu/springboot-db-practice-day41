package com.jobiak.mvcforms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jobiak.mvcforms.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
	

}
