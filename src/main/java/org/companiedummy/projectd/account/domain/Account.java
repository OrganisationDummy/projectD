package org.companiedummy.projectd.account.domain;

public class Account 
{
	private String username;
	private String password;
	private String email;
	private String firstname;
	private String timestamp;
	
	public String getUsername() 
	{
		return username;
	}
	
	public void setUsername(String username) 
	{
		this.username = username;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String getEmail() 
	{
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}

	public String getFirstname() 
	{
		return firstname;
	}

	public void setFirstname(String firstname) 
	{
		this.firstname = firstname;
	}

	public String getTimestamp() 
	{
		return timestamp;
	}

	public void setTimestamp(String timestamp) 
	{
		this.timestamp = timestamp;
	}
}