package com.smart.village.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.smart.village.model.UserSms;

@Controller
public class DivisionController {

	@GetMapping("/mymensingh")
	public String mymensingh() {
		System.out.println("mymensingh controller work");
		return "mymensingh_division";
	}
	@GetMapping("/contact")
	public String contact (Model model) {
		UserSms userSms=new UserSms();
		model.addAttribute("userSms",userSms);
		System.out.println("contact");
		return "contact";
		
	}
}
