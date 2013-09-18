package org.companiedummy.projectd.exception;

public class NoAccessException extends RuntimeException
{ 
	private static final long serialVersionUID = 1L;
	
	private String message;
 
	public String getMessage() 
	{
		return message;
	}

	public void setMessage(String message) 
	{
		this.message = message;
	}
	
	public NoAccessException(String message) 
	{
		this.setMessage(message);
	}
}
