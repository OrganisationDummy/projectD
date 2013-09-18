package org.companiedummy.projectd.blog.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/blog")
public class Blogcontroller 
{
	@RequestMapping("/overview")
	public ModelAndView overview()
	{
		return new ModelAndView("app/blog/overview");
	}
}
