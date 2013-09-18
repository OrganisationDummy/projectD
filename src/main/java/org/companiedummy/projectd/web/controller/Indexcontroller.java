package org.companiedummy.projectd.web.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Indexcontroller 
{
	@RequestMapping("/")
	public ModelAndView index(HttpServletResponse response)
	{
		return new ModelAndView("redirect:/rest/account/logout");
	}
}
