package com.example.session16_md3_hn_jv240408.service.impl;

import com.example.session16_md3_hn_jv240408.model.Employee;
import com.example.session16_md3_hn_jv240408.service.IEmployeeService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService
{
	static List<Employee> employees = new ArrayList<>();
	
	static
	{
		employees.add(new Employee(1, "Quang", "Gia lâm", "09823123678", true));
		employees.add(new Employee(2, "Hải", "Gia lâm", "09823123677", false));
		employees.add(new Employee(3, "Đức Anh", "Bắc giang", "09823123676", true));
		employees.add(new Employee(4, "Đức Trần", "Hải Phòng", "09823123678", false));
		employees.add(new Employee(5, "Tiệp", "Bắc Ninh", "09823123678", true));
	}
	
	@Override
	public List<Employee> getEmployees()
	{
		return employees;
	}
	
	@Override
	public Employee findById(Integer id)
	{
		return employees.stream().filter(item -> item.getId().equals(id)).findFirst().orElse(null);
	}
	
	@Override
	public void save(Employee employee)
	{
		int indexCheck = findIndexById(employee.getId());
		if (indexCheck < 0)
		{
			// chức năng thêm mới
			employees.add(employee);
		}
		else
		{
			// chức năng update
			employees.set(indexCheck, employee);
		}
	}
	
	@Override
	public void delete(Integer id)
	{
		int indexDelete = findIndexById(id);
		if (indexDelete >= 0)
		{
			employees.remove(indexDelete);
		}
	}
	
	public int findIndexById(Integer id)
	{
		for (int i = 0; i < employees.size(); i++)
		{
			if (employees.get(i).getId().equals(id))
			{
				return i;
			}
		}
		return -1;
	}
}
