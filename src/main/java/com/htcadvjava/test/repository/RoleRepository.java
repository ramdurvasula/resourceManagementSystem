package com.htcadvjava.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.htcadvjava.test.model.Role;

public interface RoleRepository extends CrudRepository<Role, Integer> {
	

}
