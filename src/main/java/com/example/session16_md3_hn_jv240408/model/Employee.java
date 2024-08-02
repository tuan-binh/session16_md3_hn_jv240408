package com.example.session16_md3_hn_jv240408.model;

public class Employee
{
	private Integer id;
	private String name;
	private String address;
	private String phone;
	private Boolean status;
	
	public Employee()
	{
	}
	
	public Employee(Integer id, String name, String address, String phone, Boolean status)
	{
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.status = status;
	}
	
	public Integer getId()
	{
		return id;
	}
	
	public void setId(Integer id)
	{
		this.id = id;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	public void setAddress(String address)
	{
		this.address = address;
	}
	
	public String getPhone()
	{
		return phone;
	}
	
	public void setPhone(String phone)
	{
		this.phone = phone;
	}
	
	public Boolean getStatus()
	{
		return status;
	}
	
	public void setStatus(Boolean status)
	{
		this.status = status;
	}
}
