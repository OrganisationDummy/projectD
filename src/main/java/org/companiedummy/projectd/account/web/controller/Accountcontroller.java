package org.companiedummy.projectd.account.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/account")
public class Accountcontroller 
{
	@RequestMapping("/login")
	public ModelAndView login()
	{
		return new ModelAndView("app/account/login");
	}
}