package com.htcadvjava.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htcadvjava.test.model.Role;
import com.htcadvjava.test.repository.RoleRepository;

@Controller
public class RoleController {

	@Autowired
	RoleRepository repository;
	
	@GetMapping("role")
	public String enterRole() {
		
		return "roleDetails";
	}
	
	@PostMapping("/addRole")
	public String addRole(@ModelAttribute Role role,ModelMap modelMap) {
		
		List<Role> roleList = new ArrayList<Role>();
		
		repository.save(role);
		
		for(Role roles : repository.findAll()) {
			roleList.add(roles);				
		}
		
		modelMap.addAttribute("roleList", roleList);
		return "showRole";
	}
}
