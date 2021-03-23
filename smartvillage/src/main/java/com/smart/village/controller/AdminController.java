package com.smart.village.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.smart.village.model.DistrictInformation;
import com.smart.village.repository.DistrictInformationRepo;

@Controller
public class AdminController {
	
	@Autowired
	DistrictInformationRepo districtInformationRepo;

	@GetMapping("/admin")
	public String admin(Model model)
	
	{
		DistrictInformation dInformation=new DistrictInformation();
		model.addAttribute("dInformation",dInformation);
		return "dashboard";
	}
	
	@PostMapping("/districtInfSave")
	public String districtOfMymensingh(@ModelAttribute("dInformation") DistrictInformation dInformation)
	{
		System.out.println("ok........."+dInformation.toString());
		districtInformationRepo.save(dInformation);
        return "redirect:/admin";
	}
	 @GetMapping("/head")
	    public String headOfice(Authentication authentication) {	        
	        return "head";
	    }
	 @GetMapping("/trail")
	 public String trail()
	 {
		 return "registration";
	 }
}
