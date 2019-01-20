package com.htcadvjava.test.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.htcadvjava.test.model.Project;
import com.htcadvjava.test.repository.ProjectRepository;

@Controller
public class ProjectController {

	@Autowired
	ProjectRepository repository;
	
	@GetMapping("project")
	public String enterProject() {
		
		return "projectDetails";
	}
	
	@PostMapping("/addProject")
	public String addProject(@ModelAttribute Project project,ModelMap modelMap) {
		
		List<Project> projectList = new ArrayList<Project>();
		
		repository.save(project);
		
		for(Project projects : repository.findAll()) {
			projectList.add(projects);				
		}
		
		modelMap.addAttribute("projectList", projectList);
		return "showProject";
	}
}
