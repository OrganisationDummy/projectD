package org.companiedummy.projectd.account.web.controller.rest;

import java.util.Calendar;
import java.util.Date;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.companiedummy.projectd.account.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/rest/account")
public class RestAccountController 
{
	@RequestMapping("/login")
	@ResponseBody
	public boolean createSession(HttpServletResponse response, @RequestBody Account account)
	{
		Date requestTime = Calendar.getInstance().getTime();
		
		if(account.getPassword().equals("Test123"))
		{
			response.addCookie(new Cookie("username", account.getUsername()));
			response.addCookie(new Cookie("timestamp", requestTime.toString()));
				
			return true;
		}
		
		return false;
	}
	
	@RequestMapping("/currentUser")
	@ResponseBody
	public Account currentUser(@CookieValue("username") String username, @CookieValue("timestamp") String timestamp)
	{
		Account account = new Account();
		account.setUsername(username);
		account.setTimestamp(timestamp);
		
		return account;
	}
	
	@RequestMapping("/logout")
	public ModelAndView logout(HttpServletResponse response)
	{
		response.addCookie(new Cookie("username", null));
		response.addCookie(new Cookie("timestamp", null));
		
		return new ModelAndView("redirect:/account/login");
	}
}
