package com.smart.village.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.smart.village.model.UserSms;
import com.smart.village.repository.UserSmsRepo;

@Controller
public class HomeController {
	
	@Autowired
	UserSmsRepo userSmsRepo;
	@GetMapping("/index")
	public String index() {
		System.out.println("controller work");
		return "index";
	}
	@RequestMapping(value = "/submit", method = RequestMethod.POST)
	public String submit(@ModelAttribute("userSms") UserSms userSms, BindingResult result)
	{
		System.out.println("submit is worked");
		System.out.println(userSms.toString());
		userSmsRepo.save(userSms);
		
		return "contact-success"; 
	}

}
