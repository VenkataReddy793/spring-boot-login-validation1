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
public class LoginController2 
{
	@Autowired
	private ILoginService service;
	@GetMapping("/loginpage")
	public String getLoginPage(@Modelmap map,Loginb)
	{
		return null;}
	
}
