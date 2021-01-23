package com.smart.village.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DivisionController {

	@GetMapping("/mymensingh")
	public String mymensingh() {
		System.out.println("mymensingh controller work");

		return "mymensingh_division";
	}
	@GetMapping("/contact")
	public String contact() {
		System.out.println("contact");
		return "contact";
		
	}
}
