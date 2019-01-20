package com.htcadvjava.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.htcadvjava.test.model.Project;

public interface ProjectRepository extends CrudRepository<Project, Integer> {
	

}
