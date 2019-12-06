package com.data.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.data.bean.LoginBean;
import com.data.service.ILoginService;

@Controller
public class LoginController 
{
	@Autowired
	private ILoginService service;
	@GetMapping("/loginpage")
	public ModelAndView getLoginPage() 
	{
		return new ModelAndView("login", "loginBean", new LoginBean());
	}
	@PostMapping("/logincheck")
	public ModelAndView checkLogin(@Valid @ModelAttribute("/loginBean")LoginBean loginBean,BindingResult result) 
	{
		if(result.hasErrors())
		{
			return new ModelAndView("login");
		}
		String username = loginBean.getUsername();
		String password = loginBean.getPassword();
		boolean verifyUser = service.verifyUser(username, password);
		if(verifyUser==true)
		{
			return new ModelAndView("success");
		}
		else 
		{
			return new ModelAndView("failure");
		}
	}
}
