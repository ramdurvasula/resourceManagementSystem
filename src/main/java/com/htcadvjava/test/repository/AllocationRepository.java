package com.htcadvjava.test.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.htcadvjava.test.model.Allocation;
import com.htcadvjava.test.model.ProjectHistory;

public interface AllocationRepository extends CrudRepository<Allocation, Integer> {
	
	@Query(value = "SELECT p.client_name clientName,p.project_name projectName, a.from_date fromDate, a.to_date toDate,r.role_title roleTitle \r\n" + 
			"	FROM Allocation a\r\n" + 
			"	Join Project p\r\n" + 
			"	  on a.project_id = p.project_id\r\n" + 
			"	Join Role r\r\n" + 
			"	  on a.role_id = r.role_id\r\n" + 
			"	where a.emp_id=:employeeId",
			nativeQuery = true)
	public Collection<ProjectHistory> findProjectHistoryForEmployee(@Param("employeeId") Integer employeeId);
	
	
	
//	List<ProjectHistory> findProjectHistoryForEmployee(@Param("employeeId") Integer employeeId);
	
//	@Query(value = "SELECT p.projectName, r.roleTitle \r\n" + 
//	"	FROM Allocation a\r\n" + 
//	"	Join Project p\r\n" + 
//	"	  on a.allocationIdentity.projectId = p.projectId\r\n" + 
//	"	Join Role r\r\n" + 
//	"	  on a.allocationIdentity.roleId = r.roleId\r\n" + 
//	"	where a.allocationIdentity.employeeId=:employeeId")
//	List<ProjectHistory> findProjectHistoryForEmployee(@Param("employeeId") Integer employeeId);
	
}
