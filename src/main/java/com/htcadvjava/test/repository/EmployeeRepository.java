package com.htcadvjava.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.htcadvjava.test.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
	

}
