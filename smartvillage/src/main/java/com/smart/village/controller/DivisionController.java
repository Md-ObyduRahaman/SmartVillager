package com.smart.village.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.smart.village.model.LinkClick;
import com.smart.village.model.UserSms;
import com.smart.village.repository.DistrictInformationRepo;

@Controller
public class DivisionController {
	@Autowired
	LinkClick linkClick;
	
	@Autowired
	DistrictInformationRepo  districtInformationRepo;

	@GetMapping("/mymensingh/{cid}")
	public String mymensingh(@PathVariable("cid") String cid,Model m) {
		System.out.println("@GetMapping(\"/mymensingh\")...................");
		
		boolean active= linkClick.isActive();
		System.out.println(active+".....................");
		if (active) {
			linkClick.setActive(false);
			m.addAttribute("link","ok");
			
			m.addAttribute("header", linkClick.getDistrictInformation());
		}

		List list = districtInformationRepo.findBydivisionIssoCode(cid);
		if(!list.isEmpty())
		{
			m.addAttribute("data", list);
			m.addAttribute("result",districtInformationRepo.count());
		}
		else
		{
			m.addAttribute("msg", "Record not found!");
		}
		
		
		m.addAttribute("title","Mymensingh Division");
		
		return "mymensingh_division";
	}
	@GetMapping("/contact")
	public String contact (Model model) {
		UserSms userSms=new UserSms();
		model.addAttribute("userSms",userSms);
		model.addAttribute("title","Contact information");
		return "contact";
		
	}
	
	}

