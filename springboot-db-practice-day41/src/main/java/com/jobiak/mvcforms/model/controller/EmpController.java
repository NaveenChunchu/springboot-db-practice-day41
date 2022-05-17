package com.jobiak.mvcforms.model.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jobiak.mvcforms.model.Employee;
import com.jobiak.mvcforms.repository.EmployeeRepository;

@Controller
public class EmpController {
	
	@Autowired
	EmployeeRepository repository;
	
	public EmpController() {
	}
	
	
	
	@RequestMapping(path="/go",method=RequestMethod.GET)
	public String method() {
		return "result";
		
	}
	
	@RequestMapping(path="/result",method=RequestMethod.POST)
	public String doSignUp(@ModelAttribute("employee")Employee employee) {
		
		repository.save(employee);
		return "details";
	}

}
