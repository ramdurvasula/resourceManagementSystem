package com.htcadvjava.test.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htcadvjava.test.model.Allocation;
import com.htcadvjava.test.model.AllocationIdentity;
import com.htcadvjava.test.model.Employee;
import com.htcadvjava.test.model.Project;
import com.htcadvjava.test.model.Role;
import com.htcadvjava.test.repository.AllocationRepository;
import com.htcadvjava.test.repository.EmployeeRepository;
import com.htcadvjava.test.repository.ProjectRepository;
import com.htcadvjava.test.repository.RoleRepository;

@Controller
public class AllocationController {

	private static final String SHOW_PROJECT_HISTORY = "showProjectHistory";
	private static final String PROJECT_HISTORY_LIST = "projectHistoryList";
	@Autowired
	AllocationRepository repository;
	@Autowired
	EmployeeRepository empRepository;
	@Autowired
	RoleRepository roleRepository;
	@Autowired
	ProjectRepository projectRepository;
	
	@GetMapping("allocation")
	public String enterAllocation(ModelMap modelMap) {
		
		List<Role> roleList = new ArrayList<Role>();
		List<Project> projectList = new ArrayList<Project>();
		
		for(Project projects : projectRepository.findAll()) {
			projectList.add(projects);				
		}
		
		for(Role roles : roleRepository.findAll()) {
			roleList.add(roles);				
		}
		
		List<Employee> empList = new ArrayList<Employee>();
		for(Employee emp : empRepository.findAll()) {
			empList.add(emp);
		}
		
		modelMap.addAttribute("projectList", projectList);
		modelMap.addAttribute("roleList", roleList);
		modelMap.addAttribute("empList",empList);
		return "allocationDetails";
	}
	
	@PostMapping("addAllocation")
	public String addAllocation(@ModelAttribute Allocation allocation,ModelMap modelMap) throws ParseException {
	
		List<Allocation> allocationList = new ArrayList<Allocation>();
		setAllocationIdentity(allocation, new Date());
		
		repository.save(allocation);
		
		for(Allocation allocations : repository.findAll()) {
			allocationList.add(allocations);				
		}
		
		modelMap.addAttribute("allocationList", allocationList);
		return "showAllocations";
	}

	private void setAllocationIdentity(Allocation allocation, Date myDate) {
		AllocationIdentity allocationIdentity = new AllocationIdentity();
		allocationIdentity.setEmployeeId(allocation.getEmployee().getEmployeeId());
		allocationIdentity.setProjectId(allocation.getProject().getProjectId());
		allocationIdentity.setRoleId(allocation.getRole().getRoleId());
		allocationIdentity.setFromDate(myDate);
		allocation.setAllocationIdentity(allocationIdentity);
	}
	
	@GetMapping("projectHistory")
	public String projectHistory(ModelMap modelMap) {
		
		List<Employee> empList = new ArrayList<Employee>();
		for(Employee emp : empRepository.findAll()) {
			empList.add(emp);
		}
		modelMap.addAttribute("empList",empList);
		return "projectHistory";
	}
	
	@PostMapping(SHOW_PROJECT_HISTORY)
	public String showProjectHistory(@ModelAttribute Employee employee,ModelMap modelMap) {
		modelMap.addAttribute(PROJECT_HISTORY_LIST,repository.findProjectHistoryForEmployee(employee.getEmployeeId()));
		modelMap.addAttribute("employeeName",employee.getEmployeeName());
		return SHOW_PROJECT_HISTORY;
	}
}
