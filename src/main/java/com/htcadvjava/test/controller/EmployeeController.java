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
import com.htcadvjava.test.model.Employee;
import com.htcadvjava.test.repository.DepartmentRepository;
import com.htcadvjava.test.repository.EmployeeRepository;

@Controller
public class EmployeeController {

	@Autowired
	DepartmentRepository deptRepository;
	
	@Autowired
	EmployeeRepository empRepository;
	
	@GetMapping("employee")
	public String enterEmployee(ModelMap modelMap) {
		
		List<Department> deptList = new ArrayList<Department>();
		List<Employee> empList = new ArrayList<Employee>();
		
		for(Employee emp : empRepository.findAll()) {
			empList.add(emp);
		}
		for(Department dept : deptRepository.findAll()) {
			deptList.add(dept);				
		}
		modelMap.addAttribute("empList",empList);
		modelMap.addAttribute("deptList", deptList);
		return "employeeDetails";
	}
	
	@PostMapping("addEmployee")
	public String addEmployee(@ModelAttribute Employee employee,ModelMap modelMap) {
		
		List<Employee> empList = new ArrayList<Employee>();
		System.out.println("department id =========> " + employee.getDepartment().getDepartmentId()); 	
		
		if(employee!=null && employee.getDepartment()!=null && employee.getDepartment().getDepartmentId()!=null) {
			empRepository.save(employee);
		}
		
		for(Employee emp : empRepository.findAll()) {
			empList.add(emp);
		}
		
		modelMap.addAttribute("empList",empList);
		return "employee";
	}
	
}
