package com.htcadvjava.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htcadvjava.test.model.Department;
import com.htcadvjava.test.repository.DepartmentRepository;

@Controller
public class DepartmentController {

	@Autowired
	DepartmentRepository repository;
	
	@GetMapping("department")
	public String enterDepartment() {
		
		return "departmentDetails";
	}
	
	@PostMapping("/addDepartment")
	public String addDepartment(@ModelAttribute Department department,ModelMap modelMap) {
		
		List<Department> deptList = new ArrayList<Department>();
		
		repository.save(department);
		
		for(Department dept : repository.findAll()) {
			deptList.add(dept);				
		}
		
		modelMap.addAttribute("deptList", deptList);
		return "showDepartment";
	}
	
	@GetMapping("/getDepartmentById")
	public String getDepartmentById() {
		
		return "getDepartmentById";
	}
	
	@PostMapping("/findDepartmentById")
	public String findDepartmentById(@ModelAttribute Department department,ModelMap modelMap) {

		List<Department> deptList = new ArrayList<Department>();
		System.out.println(repository.findById(department.getDepartmentId()));
		
		String result = repository.findById(department.getDepartmentId()).toString();
	
		System.out.println(result);
		modelMap.addAttribute("deptList", deptList);
		
		return "showDepartment";
	}

}
