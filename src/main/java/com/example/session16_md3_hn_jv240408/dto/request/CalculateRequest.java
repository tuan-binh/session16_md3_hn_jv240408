package com.example.session16_md3_hn_jv240408.dto.request;

public class CalculateRequest
{
	private String vnd;
	private String rate;
	
	public CalculateRequest()
	{
	}
	
	public CalculateRequest(String vnd, String rate)
	{
		this.vnd = vnd;
		this.rate = rate;
	}
	
	public String getVnd()
	{
		return vnd;
	}
	
	public void setVnd(String vnd)
	{
		this.vnd = vnd;
	}
	
	public String getRate()
	{
		return rate;
	}
	
	public void setRate(String rate)
	{
		this.rate = rate;
	}
}
