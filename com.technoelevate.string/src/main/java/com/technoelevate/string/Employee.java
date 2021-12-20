package com.technoelevate.string;

public class Employee {
	private String username;
	private String emailid;
	private int password;
	public Employee(String username,String emailid,int password) {
		// TODO Auto-generated constructor stub
		this.username=username;
		this.emailid=emailid;
		this.password=password;
	}
	public String getusername()
	{
		return username;
	}
	public void setusername(String username)
	{
		this.username=username;
	}
	public String getemailid()
	{
		return emailid;
	}
	public void setemailid(String emailid)
	{
		this.emailid=emailid;
	}
	public int getpassword()
	{
		return password;
	}
	public void setpassword(int password)
	{
		this.password=password;
	}
	}