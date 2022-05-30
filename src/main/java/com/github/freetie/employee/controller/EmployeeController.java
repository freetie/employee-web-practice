package com.github.freetie.employee.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.freetie.employee.entity.Employee;
import com.github.freetie.employee.entity.EmployeeQueryParameters;
import com.github.freetie.employee.service.AccountService;
import com.github.freetie.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	
	EmployeeService employeeService;
	AccountService accountService;

	@RequestMapping("/employee/new")
	public String createPage(Model model) {
		List<String> existEmployeeNumbers = employeeService.findAllEmployeeNumbers();
		List<String> existAccountNames = accountService.findAllNames();
		model.addAttribute("existEmployeeNumbers", existEmployeeNumbers);
		model.addAttribute("existAccountNames", existAccountNames);
		return "employee-detail";
	}
	
	@RequestMapping("/employee/{id}")
	public String detailPage(@PathVariable("id") Integer id, Model model) {
		List<String> existEmployeeNumbers = employeeService.findAllEmployeeNumbers();
		List<String> existAccountNames = accountService.findAllNames();
		Employee detail = employeeService.find(id);
		model.addAttribute("existEmployeeNumbers", existEmployeeNumbers);
		model.addAttribute("existAccountNames", existAccountNames);
		model.addAttribute("detail", detail);
		return "employee-detail";
	}

	@RequestMapping("/employee/new.action")
	public String create(Employee employee) {
		employeeService.save(employee);
		return "redirect:employee";
	}
	
	@RequestMapping("/employee/{id}.delete")
	public void delete(@PathVariable("id") Integer id) {
		employeeService.delete(id);
	}
	
	@RequestMapping("/employee/{id}.update")
	public String udpate(Employee employee) {
		return "redirect:employee";
	}

	@RequestMapping("/employee")
	public String list(EmployeeQueryParameters queryParameters, Model model) {
		List<Employee> list = employeeService.findAll(queryParameters);
		Integer count = employeeService.count(queryParameters);
		model.addAttribute("page", queryParameters.getPage());
		model.addAttribute("list", list);
		model.addAttribute("count", count);
		return "employee";
	}
}
