package com.example.session16_md3_hn_jv240408.controller;

import com.example.session16_md3_hn_jv240408.model.Employee;
import com.example.session16_md3_hn_jv240408.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController
{
	@Autowired
	private IEmployeeService employeeService;
	
	@GetMapping
	public String employee(Model model)
	{
		model.addAttribute("employees", employeeService.getEmployees());
		return "employee/employees";
	}
	
	@GetMapping("/add")
	public String viewFormAdd()
	{
		return "employee/add_employee";
	}
	
	@PostMapping("/add")
	public String handleAddEmployee(@ModelAttribute Employee employee)
	{
		employeeService.save(employee);
		return "redirect:/";
	}
	
	@GetMapping("/edit/{id}")
	public String viewEdit(@PathVariable int id, Model model)
	{
		Employee employeeUpdate = employeeService.findById(id);
		model.addAttribute("employee", employeeUpdate);
		return "employee/edit_employee";
	}
	
	@PostMapping("/edit")
	public String handleEdit(@ModelAttribute Employee employee)
	{
		employeeService.save(employee);
		return "redirect:/";
	}
	
	@GetMapping("/delete/{id}")
	public String handleDelete(@PathVariable int id)
	{
		employeeService.delete(id);
		return "redirect:/";
	}
	
}
