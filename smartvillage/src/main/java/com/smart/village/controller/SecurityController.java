package com.smart.village.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	
	//handler for custom login
		@GetMapping("/register")
		public String headLogin()
		{
			System.out.println("Security ok");
			
			return "login";
		}
}
