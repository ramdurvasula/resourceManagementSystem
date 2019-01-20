package com.htcadvjava.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.htcadvjava.test.model.Department;

public interface DepartmentRepository extends CrudRepository<Department, Integer> {
	

}
